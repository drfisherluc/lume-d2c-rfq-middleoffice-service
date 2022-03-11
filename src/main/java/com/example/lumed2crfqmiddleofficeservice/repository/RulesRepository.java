package com.example.lumed2crfqmiddleofficeservice.repository;

import com.example.lumed2crfqmiddleofficeservice.model.RuleDefinition;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface RulesRepository extends MongoRepository<RuleDefinition, String> {

    List<RuleDefinition> find();

    @Query("{segment:'?0'}")
    List<RuleDefinition> findRuleDefinitionBy(String segment);

}
