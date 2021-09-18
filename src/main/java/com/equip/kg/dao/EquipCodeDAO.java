package com.equip.kg.dao;

import com.equip.kg.pojo.EquipmentCode;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface EquipCodeDAO extends Neo4jRepository<EquipmentCode,Long> {

    EquipmentCode findByeCodeId(String e_code_id);

}
