package com.equip.kg.pojo;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Node(labels = "material")
public class Material {

    @Id
    @GeneratedValue
    private Long id;

    @Property(name = "mat_description")
    private String matDesc;

    public Material() {
    }

    public Material(String matDesc) {
        this.matDesc = matDesc;
    }

    public String getMatDesc() {
        return matDesc;
    }

    public void setMatDesc(String matDesc) {
        this.matDesc = matDesc;
    }

    @Override
    public String toString() {
        return "Material{" +
                "id=" + id +
                ", matDesc='" + matDesc + '\'' +
                '}';
    }
}
