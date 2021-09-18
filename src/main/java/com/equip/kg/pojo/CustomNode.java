package com.equip.kg.pojo;

public class CustomNode {
    private String id;  //前端结点,id是结点的名称
    private int group;
    private Object obj;

    public CustomNode(String id, int group, Object obj) {
        this.id = id;
        this.group = group;
        this.obj = obj;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
