package com.example.lumed2crfqmiddleofficeservice.model;


import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "rules")
public class RuleDefinition {
//    @Id
//    private long id;

    @Indexed(unique = true)
    private String segment;
    private  List<Rule> ruleSet;
}