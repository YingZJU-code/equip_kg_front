package com.equip.kg.pojo;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Node(labels = "e_name")
public class EquipmentName {

    @Id
    @GeneratedValue
    private Long id;

    @Property(name = "euip_name")
    private String equipName;

    public EquipmentName() {
    }

    public EquipmentName(String equipName) {
        this.equipName = equipName;
    }

    public String getEquipName() {
        return equipName;
    }

    public void setEquipName(String equipName) {
        this.equipName = equipName;
    }

    @Override
    public String toString() {
        return "EquipmentName{" +
                "id=" + id +
                ", equipName='" + equipName + '\'' +
                '}';
    }
}
