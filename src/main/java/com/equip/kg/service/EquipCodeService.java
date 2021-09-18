package com.equip.kg.service;

import com.equip.kg.dao.EquipCodeDAO;
import com.equip.kg.pojo.*;
import com.equip.kg.pojo.System;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipCodeService {
    @Autowired
    EquipCodeDAO equipCodeDAO;

    public EquipmentCode findByeCodeId(String e_code_id) {
        return equipCodeDAO.findByeCodeId(e_code_id);
    }

    public Iterable<EquipmentCode> findAll() {
        return equipCodeDAO.findAll();
    }

    public List<EquipmentName> getEquipNameByCode(EquipmentCode code, String rel) {
        if (rel.equals("ename")) {
            return code.getEquipmentNames();
        }
        return null;
    }

    public List<EquipPart> getEquipPartByCode(EquipmentCode code, String rel) {
        if (rel.equals("epart")) {
            return code.getParts();
        }
        return null;
    }

    public List<Material> getMatByCode(EquipmentCode code, String rel) {
        if (rel.equals("mat")) {
            return code.getMats();
        }
        return null;
    }

    public List<UnitNumber> getUnitsByCode(EquipmentCode code, String rel) {
        if (rel.equals("unit")) {
            return code.getUnits();
        }
        return null;
    }

    public List<Producer> getProdsByCode(EquipmentCode code, String rel) {
        if (rel.equals("prod")) {
            return code.getProds();
        }
        return null;
    }

    public List<System> getSysByCode(EquipmentCode code, String rel) {
        if (rel.equals("sys")) {
            return code.getSys();
        }
        return null;
    }

    public List<WorkShop> getWkByCode(EquipmentCode code, String rel) {
        if (rel.equals("wk")) {
            return code.getWk();
        }
        return null;
    }

}
