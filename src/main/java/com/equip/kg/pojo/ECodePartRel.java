package com.equip.kg.pojo;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@RelationshipProperties
public class ECodePartRel {

    @Id
    @GeneratedValue
    private Long id;

    @TargetNode
    private EquipPart part;

    public ECodePartRel() {
    }

    public ECodePartRel(EquipPart part) {
        this.part = part;
    }
}
