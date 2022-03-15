package com.example.lumed2crfqmiddleofficeservice.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "predicateOperators")
public class PredicateOperator {
    private String id;
    private String label;
}
