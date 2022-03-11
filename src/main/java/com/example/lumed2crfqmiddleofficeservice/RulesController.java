package com.example.lumed2crfqmiddleofficeservice;


import com.example.lumed2crfqmiddleofficeservice.model.RuleDefinition;
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
    public List<RuleDefinition> getRules(@RequestParam(value = "sector", defaultValue = "ALL") String segment) {
        if (segment.equals("ALL"))
            return rs.getRules();
        else
            return rs.getRules(segment);
    }


}
