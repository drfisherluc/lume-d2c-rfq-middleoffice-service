package com.example.lumed2crfqmiddleofficeservice.repository;

import com.example.lumed2crfqmiddleofficeservice.model.RuleDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class RulesRepositoryImpl implements RulesRepository {

    @Autowired
    MongoTemplate mongoTemplate;


    @Override
    public List<RuleDefinition> findRuleDefinitionBy(String segment) {
        Query query = new Query();
        query.addCriteria(Criteria.where("segment").is(segment));
        List<RuleDefinition> ruleDefinitionList = mongoTemplate.find(query,RuleDefinition.class);
//        List<RuleDefinition> ruleDefinitionList = mongoTemplate.findAll(RuleDefinition.class);
        return ruleDefinitionList;
    }

    @Override
    public List<RuleDefinition> find() {
//        Query query = new Query();
//        query.with(Sort.by(Sort.Direction.ASC, "segment"));
//        List<RuleDefinition> ruleDefinitionList = mongoTemplate.find(query,RuleDefinition.class);
        List<RuleDefinition> ruleDefinitionList = mongoTemplate.findAll(RuleDefinition.class);
        return ruleDefinitionList;
    }

    @Override
    public <S extends RuleDefinition> List<S> findAll(Example<S> example) {
        return null;
    }


//    @Override
//    public List<RuleDefinition> findRuleDefinitionBySegment(String segment) {
//        return null;
//    }

    @Override
    public <S extends RuleDefinition> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public List<RuleDefinition> findAll() {
        return null;
    }

    @Override
    public List<RuleDefinition> findAll(Sort sort) {
        return null;
    }

    @Override
    public <S extends RuleDefinition> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends RuleDefinition> List<S> insert(Iterable<S> entities) {
        return null;
    }


    @Override
    public <S extends RuleDefinition> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public Page<RuleDefinition> findAll(Pageable pageable) {

        return null;
    }

    @Override
    public <S extends RuleDefinition> S save(S entity) {
        return null;
    }

    @Override
    public Optional<RuleDefinition> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<RuleDefinition> findAllById(Iterable<String> strings) {
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
    public void delete(RuleDefinition entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends RuleDefinition> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends RuleDefinition> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends RuleDefinition> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends RuleDefinition> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends RuleDefinition> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends RuleDefinition, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
