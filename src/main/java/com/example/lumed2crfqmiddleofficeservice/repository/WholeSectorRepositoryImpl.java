package com.example.lumed2crfqmiddleofficeservice.repository;

import com.example.lumed2crfqmiddleofficeservice.model.WholeSectorDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class WholeSectorRepositoryImpl implements WholeSectorRepository {

    @Autowired
    MongoTemplate mongoTemplate;


//    @Override
//    public List<WholeSectorDefinition> findRuleDefinitionBy(String segment) {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("segment").is(segment));
//        List<WholeSectorDefinition> wholeSectorDefinitionList = mongoTemplate.find(query, WholeSectorDefinition.class);
////        List<RuleDefinition> ruleDefinitionList = mongoTemplate.findAll(RuleDefinition.class);
//        return wholeSectorDefinitionList;
//    }

    @Override
    public List<WholeSectorDefinition> find() {
//        Query query = new Query();
//        query.with(Sort.by(Sort.Direction.ASC, "segment"));
//        List<RuleDefinition> ruleDefinitionList = mongoTemplate.find(query,RuleDefinition.class);
        return mongoTemplate.findAll(WholeSectorDefinition.class);

    }

    @Override
    public List<WholeSectorDefinition> findSectorDefinitionBy(String sector) {
        return null;
    }

    @Override
    public <S extends WholeSectorDefinition> List<S> findAll(Example<S> example) {
        return null;
    }


//    @Override
//    public List<RuleDefinition> findRuleDefinitionBySegment(String segment) {
//        return null;
//    }

    @Override
    public <S extends WholeSectorDefinition> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public List<WholeSectorDefinition> findAll() {
        return null;
    }

    @Override
    public List<WholeSectorDefinition> findAll(Sort sort) {
        return null;
    }

    @Override
    public <S extends WholeSectorDefinition> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends WholeSectorDefinition> List<S> insert(Iterable<S> entities) {
        return null;
    }


    @Override
    public <S extends WholeSectorDefinition> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public Page<WholeSectorDefinition> findAll(Pageable pageable) {

        return null;
    }

    @Override
    public <S extends WholeSectorDefinition> S save(S entity) {
        return null;
    }

    @Override
    public Optional<WholeSectorDefinition> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<WholeSectorDefinition> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(WholeSectorDefinition entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends WholeSectorDefinition> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends WholeSectorDefinition> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends WholeSectorDefinition> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends WholeSectorDefinition> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends WholeSectorDefinition> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends WholeSectorDefinition, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
