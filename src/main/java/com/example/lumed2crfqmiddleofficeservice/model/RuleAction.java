package com.example.lumed2crfqmiddleofficeservice.model;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class RuleAction {
    private double markup;
    private String markupOperation;
    private long onTheWireTime;
    private int numberOfTimesNegotiatedThreshold;
}
