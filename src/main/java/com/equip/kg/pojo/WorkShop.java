package com.equip.kg.pojo;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Node(labels = "workshop")
public class WorkShop {

    @Id
    @GeneratedValue
    private Long id;

    @Property(name = "wk_desceprition")
    private String wkName;

    public WorkShop() {
    }

    public WorkShop(String wkName) {
        this.wkName = wkName;
    }

    public String getWkName() {
        return wkName;
    }

    public void setWkName(String wkName) {
        this.wkName = wkName;
    }

    @Override
    public String toString() {
        return "WorkShop{" +
                "id=" + id +
                ", wkName='" + wkName + '\'' +
                '}';
    }
}
