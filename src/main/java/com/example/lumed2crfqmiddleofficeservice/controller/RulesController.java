package com.example.lumed2crfqmiddleofficeservice.controller;


import com.example.lumed2crfqmiddleofficeservice.model.WholeSectorDefinition;
import com.example.lumed2crfqmiddleofficeservice.service.RulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class RulesController {
    @Autowired
    RulesService rs;

    @GetMapping("/wholerules")
    public List<WholeSectorDefinition> getRules(@RequestParam(value = "sector", defaultValue = "ALL") String sector) {
        if (sector.equals("ALL"))
            return rs.getWholeRules();
        else
            return rs.getWholeRules(sector);
    }


}
