package com.equip.kg.pojo;

import org.springframework.data.neo4j.core.schema.*;

import java.util.ArrayList;
import java.util.List;

@Node(labels = "e_code")
public class EquipmentCode {

    @Id
    @GeneratedValue
    private Long id;

    @Property(name = "e_code_id")
    private String eCodeId;

    @Property(name = "e_level")
    private String eLevel;

    public EquipmentCode() {
    }

    public EquipmentCode(String eCodeId, String eLevel) {
        this.eCodeId = eCodeId;
        this.eLevel = eLevel;
    }

    public String geteCodeId() {
        return eCodeId;
    }

    public void seteCodeId(String eCodeId) {
        this.eCodeId = eCodeId;
    }

    public String geteLevel() {
        return eLevel;
    }

    public void seteLevel(String eLevel) {
        this.eLevel = eLevel;
    }

    @Relationship(type = "对应设备", direction = Relationship.Direction.OUTGOING)
    private List<EquipmentName> equipmentNames = new ArrayList<>();

    @Relationship(type = "包含部件", direction = Relationship.Direction.OUTGOING)
    private List<EquipPart> parts = new ArrayList<>();

    @Relationship(type = "涉及物料", direction = Relationship.Direction.OUTGOING)
    private List<Material> mats = new ArrayList<>();

    @Relationship(type = "所属机组", direction = Relationship.Direction.OUTGOING)
    public List<UnitNumber> units = new ArrayList<>();

    @Relationship(type = "所属制造厂商", direction = Relationship.Direction.OUTGOING)
    public List<Producer> prods = new ArrayList<>();

    @Relationship(type = "涉及系统", direction = Relationship.Direction.OUTGOING)
    public List<System> sys = new ArrayList<>();

    @Relationship(type = "所属房间", direction = Relationship.Direction.OUTGOING)
    public List<WorkShop> wk = new ArrayList<>();


    public List<EquipmentName> getEquipmentNames() {
        return equipmentNames;
    }

    public void setEquipmentNames(List<EquipmentName> equipmentNames) {
        this.equipmentNames = equipmentNames;
    }

    public List<EquipPart> getParts() {
        return parts;
    }

    public void setParts(List<EquipPart> parts) {
        this.parts = parts;
    }

    public List<Material> getMats() {
        return mats;
    }

    public void setMats(List<Material> mats) {
        this.mats = mats;
    }

    public List<UnitNumber> getUnits() {
        return units;
    }

    public void setUnits(List<UnitNumber> units) {
        this.units = units;
    }

    public List<Producer> getProds() {
        return prods;
    }

    public void setProds(List<Producer> prods) {
        this.prods = prods;
    }

    public List<System> getSys() {
        return sys;
    }

    public void setSys(List<System> sys) {
        this.sys = sys;
    }

    public List<WorkShop> getWk() {
        return wk;
    }

    public void setWk(List<WorkShop> wk) {
        this.wk = wk;
    }

    @Override
    public String toString() {
        return "EquipmentCode{" +
                "id=" + id +
                ", eCodeId='" + eCodeId + '\'' +
                ", eLevel='" + eLevel + '\'' +
                ", equipmentNames=" + equipmentNames +
                ", parts=" + parts +
                ", mats=" + mats +
                ", units=" + units +
                ", prods=" + prods +
                ", sys=" + sys +
                ", wk=" + wk +
                '}';
    }
}
