package com.equip.kg.pojo;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Node(labels = "np_unit")
public class UnitNumber {

    @Id
    @GeneratedValue
    private Long id;

    @Property(name = "unit_id")
    private String unitId;

    public UnitNumber() {
    }

    public UnitNumber(String unitId) {
        this.unitId = unitId;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    @Override
    public String toString() {
        return "UnitNumber{" +
                "id=" + id +
                ", unitId='" + unitId + '\'' +
                '}';
    }
}
