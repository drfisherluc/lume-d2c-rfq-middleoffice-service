package com.example.lumed2crfqmiddleofficeservice.service;

import com.example.lumed2crfqmiddleofficeservice.model.RuleDefinition;
import com.example.lumed2crfqmiddleofficeservice.repository.RulesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RulesService {
    @Autowired
    private RulesRepository rulesRepository;


    public List<RuleDefinition> getRules() {
        return rulesRepository.find();
    }
    public List<RuleDefinition> getRules(String segment) {
        return rulesRepository.findRuleDefinitionBy(segment);
    }



}
