package com.epsilon.tdc.mongorepositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;

import com.espilon.tdc.model.ModuleFields;

@Component
public interface ModuleFieldsRepository extends MongoRepository<ModuleFields, String>{
    
    @Query("{ $and: [{ 'component' : ?0 }]}")
    ModuleFields getModuleFields(String component);

}
