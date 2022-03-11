package com.example.lumed2crfqmiddleofficeservice.model;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@Document
public class Rule {
    @Indexed(unique = true)
    private String ruleID;
    private int orderOfPrecedence;
    private List<Predicate> predicateSet;
}
