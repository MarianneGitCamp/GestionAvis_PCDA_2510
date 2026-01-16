package com.eni.gestionavis.repository;

import com.eni.gestionavis.bo.Avis;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvisRepository extends MongoRepository<Avis, String> {
}
