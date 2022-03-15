package com.example.lumed2crfqmiddleofficeservice.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "predicateSchemas")
public class PredicateSchema {
    private String id;
    private List<String> operators;
    private List<String> leftOperands;
}
