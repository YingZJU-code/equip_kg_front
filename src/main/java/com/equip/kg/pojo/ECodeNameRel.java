package com.equip.kg.pojo;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@RelationshipProperties
public class ECodeNameRel {

    //仅id属性
    @Id
    @GeneratedValue
    private Long id;

    @TargetNode
    private EquipmentName name;

    public ECodeNameRel() {
    }

    public ECodeNameRel(EquipmentName name) {
        this.name = name;
    }
}
