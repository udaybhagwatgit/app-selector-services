package com.epsilon.tdc.mongorepositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;

import com.espilon.tdc.model.CommonProperties;

@Component
public interface CommonPropertiesRepository extends MongoRepository<CommonProperties, String> {

    @Query("{}")
    CommonProperties getCommonProperties();
}
