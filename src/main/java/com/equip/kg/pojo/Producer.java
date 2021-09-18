package com.equip.kg.pojo;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Node(labels = "producer")
public class Producer {

    @Id
    @GeneratedValue
    private Long id;

    @Property(name = "prod_name")
    private String prodName;

    public Producer() {
    }

    public Producer(String prodName) {
        this.prodName = prodName;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "id=" + id +
                ", prodName='" + prodName + '\'' +
                '}';
    }
}
