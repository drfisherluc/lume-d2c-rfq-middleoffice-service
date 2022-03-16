package com.example.lumed2crfqmiddleofficeservice.controller;


import com.example.lumed2crfqmiddleofficeservice.model.WholeSectorDefinition;
import com.example.lumed2crfqmiddleofficeservice.service.RulesService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class RulesController {
    @Autowired
    RulesService rs;

    @GetMapping("/wholerules")
    public ResponseEntity<String> getRules(@RequestParam(value = "sector", defaultValue = "ALL") String sector) {
        try {
            List<WholeSectorDefinition> wholeSectorDefinitionList;
            if (sector.equals("ALL"))
                wholeSectorDefinitionList =  rs.getWholeRules();
            else
                wholeSectorDefinitionList = rs.getWholeRules(sector);

            String wsdStr = new Gson().toJson(wholeSectorDefinitionList);

            return ResponseEntity.ok().body(wsdStr);
        }
        catch (Exception x) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(x.getMessage());
        }
    }


}
