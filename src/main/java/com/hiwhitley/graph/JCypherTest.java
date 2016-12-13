package com.hiwhitley.graph;

import iot.jcypher.database.DBAccessFactory;
import iot.jcypher.database.DBProperties;
import iot.jcypher.database.DBType;
import iot.jcypher.database.IDBAccess;
import iot.jcypher.graph.GrNode;
import iot.jcypher.query.JcQuery;
import iot.jcypher.query.JcQueryResult;
import iot.jcypher.query.api.IClause;
import iot.jcypher.query.factories.clause.MATCH;
import iot.jcypher.query.factories.clause.RETURN;
import iot.jcypher.query.values.JcNode;
import iot.jcypher.query.values.JcString;

import java.util.List;
import java.util.Properties;

/**
 * Created by hiwhitley on 16-12-6.
 */
public class JCypherTest {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty(DBProperties.SERVER_ROOT_URI, "bolt://localhost");
        String userId = "neo4j";
        String passWord = "123";
        IDBAccess dbAccess =
                DBAccessFactory.createDBAccess(DBType.REMOTE, props, userId, passWord);
        System.out.println(dbAccess.getDBType());
        JcNode n = new JcNode("n");
        IClause[] clauses = new IClause[]{
                // match nodes
                MATCH.node(n).label("USER").property("user_name").value("风水先生_8957"),
                RETURN.value(n)
        };
        JcQuery query = new JcQuery();
        query.setClauses(clauses);

// execute the query
        JcQueryResult result = dbAccess.execute(query);
        List<GrNode> grNodes = result.resultOf(n);
        System.out.println(grNodes.get(0).getProperties());
    }
}
