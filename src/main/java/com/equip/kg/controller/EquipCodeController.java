package com.equip.kg.controller;

import com.equip.kg.pojo.*;
import com.equip.kg.pojo.System;
import com.equip.kg.service.EquipCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/ecode")
public class EquipCodeController {
    @Autowired
    EquipCodeService equipCodeService;

    @GetMapping("/{ecodeid}")
    public CustomNode findByeCodeId(@PathVariable("ecodeid") String eCodeId) {
        EquipmentCode equipmentCode = equipCodeService.findByeCodeId(eCodeId);
//        return equipmentCode;
        return new CustomNode(equipmentCode.geteCodeId(), 1, equipmentCode);
    }

    @GetMapping("/all")
    public List<CustomNode> findAll() {
        Iterable<EquipmentCode> codeIterable = equipCodeService.findAll();
//        List<EquipmentCode> codeList = new ArrayList<>();
        List<CustomNode> customNodes = new ArrayList<>();
        for (EquipmentCode code : codeIterable) {
//            codeList.add(code);
            customNodes.add(new CustomNode(code.geteCodeId(), 1, code));
        }
//        return codeList;
        return customNodes;
    }

    @GetMapping("/query/{relationship}/{ecodeid}")
    public List<CustomNode> getENameByCode(@PathVariable("relationship") String rel, @PathVariable("ecodeid") String eCodeId) {
        EquipmentCode code = equipCodeService.findByeCodeId(eCodeId);
        List<CustomNode> customNodes = new ArrayList<>();
        if ("ename".equals(rel)) {
            List<EquipmentName> nameList = equipCodeService.getEquipNameByCode(code, rel);
            for (EquipmentName name : nameList) {
                customNodes.add(new CustomNode(name.getEquipName(), 2, name));
            }
        } else if ("epart".equals(rel)) {
            List<EquipPart> partList = equipCodeService.getEquipPartByCode(code, rel);
            for (EquipPart part : partList) {
                customNodes.add(new CustomNode(part.getPartName(), 3, part));
            }
        } else if ("mat".equals(rel)) {
            List<Material> mats = equipCodeService.getMatByCode(code, rel);
            for (Material mat : mats) {
                customNodes.add(new CustomNode(mat.getMatDesc(), 4, mat));
            }
        } else if ("unit".equals(rel)) {
            List<UnitNumber> units = equipCodeService.getUnitsByCode(code, rel);
            for (UnitNumber unit : units) {
                customNodes.add(new CustomNode(unit.getUnitId(), 5, unit));
            }
        }else if ("prods".equals(rel)) {
            List<Producer> prods = equipCodeService.getProdsByCode(code, rel);
            for (Producer prod : prods) {
                customNodes.add(new CustomNode(prod.getProdName(), 6, prod));
            }
        }else if ("sys".equals(rel)) {
            List<System> sysByCode = equipCodeService.getSysByCode(code, rel);
            for (System sys : sysByCode) {
                customNodes.add(new CustomNode(sys.getSysName(), 7, sys));
            }
        }else if ("wk".equals(rel)) {
            List<WorkShop> wkByCode = equipCodeService.getWkByCode(code, rel);
            for (WorkShop wk : wkByCode) {
                customNodes.add(new CustomNode(wk.getWkName(), 8, wk));
            }
        }

        return customNodes;
    }
}
