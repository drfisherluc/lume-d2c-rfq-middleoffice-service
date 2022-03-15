package com.example.lumed2crfqmiddleofficeservice.service;

import com.example.lumed2crfqmiddleofficeservice.model.WholeSectorDefinition;
import com.example.lumed2crfqmiddleofficeservice.repository.WholeSectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RulesService {
    @Autowired
    private WholeSectorRepository wholeSectorRepository;

    public List<WholeSectorDefinition> getWholeRules() {
        return wholeSectorRepository.find();
    }
    public List<WholeSectorDefinition> getWholeRules(String sector) {
        return wholeSectorRepository.findSectorDefinitionBy(sector);
    }

}
