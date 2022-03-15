package com.example.lumed2crfqmiddleofficeservice.repository;

import com.example.lumed2crfqmiddleofficeservice.model.WholeSectorDefinition;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface WholeSectorRepository extends MongoRepository<WholeSectorDefinition, String> {

    List<WholeSectorDefinition> find();

    @Query("{segment:'?0'}")
    List<WholeSectorDefinition> findSectorDefinitionBy(String sector);

}
