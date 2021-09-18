package com.equip.kg.pojo;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Node(labels = "e_part")
public class EquipPart {

    @Id
    @GeneratedValue
    private Long id;

    @Property(name = "p_code")
    private String partName;

    public EquipPart() {
    }

    public EquipPart(String partName) {
        this.partName = partName;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    @Override
    public String toString() {
        return "EquipPart{" +
                "id=" + id +
                ", partName='" + partName + '\'' +
                '}';
    }
}
