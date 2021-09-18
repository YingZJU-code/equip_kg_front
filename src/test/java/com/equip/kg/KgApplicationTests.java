package com.equip.kg;

import org.junit.jupiter.api.Test;
//import org.neo4j.driver.AuthTokens;
//import org.neo4j.driver.Driver;
//import org.neo4j.driver.GraphDatabase;
//import org.neo4j.driver.Session;
//import org.neo4j.driver.Result;
//import org.neo4j.driver.Record;
import org.neo4j.driver.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KgApplicationTests {

	@Test
	void contextLoads() {
		Driver driver = GraphDatabase.driver("bolt://127.0.0.1:7687", AuthTokens.basic("neo4j", "neo4jmm"));
		SessionConfig sessionConfig = SessionConfig.defaultConfig();
		Session session = driver.session(sessionConfig);
		// 查询
		Result result = session.run("MATCH (a:material) WHERE a.mat_description = '叶片式水泵 CLYDE UNION LIMITED RK 1C 75' RETURN a.mat_description as mat_description");
		while (result.hasNext()) {
			Record record = result.next();
			String matDescription = record.get("mat_description").asString();
			System.out.println(matDescription);
		}
		session.close();
		driver.close();
	}

}
