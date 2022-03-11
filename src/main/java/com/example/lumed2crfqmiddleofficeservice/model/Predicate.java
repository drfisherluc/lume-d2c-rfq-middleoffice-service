package com.example.lumed2crfqmiddleofficeservice.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Predicate {
    private  String leftOperand;
    private  String rightOperand;
    private  String operator;
}
