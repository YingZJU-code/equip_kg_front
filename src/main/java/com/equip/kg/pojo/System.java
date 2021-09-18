package com.equip.kg.pojo;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Node(labels = "system")
public class System {

    @Id
    @GeneratedValue
    private Long id;

    @Property(name = "s_name")
    private String sysName;

    public System() {
    }

    public System(String sysName) {
        this.sysName = sysName;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    @Override
    public String toString() {
        return "System{" +
                "id=" + id +
                ", sysName='" + sysName + '\'' +
                '}';
    }
}
