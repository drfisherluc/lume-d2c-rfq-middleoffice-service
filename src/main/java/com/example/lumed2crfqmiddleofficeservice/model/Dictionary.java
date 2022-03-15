package com.example.lumed2crfqmiddleofficeservice.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;

@Data
@Document
public class Dictionary {
    List<PredicateSchema> predicateSchemas;
    List<PredicateOperator>  predicateOperators;
}
