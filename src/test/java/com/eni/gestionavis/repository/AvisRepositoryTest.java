package com.eni.gestionavis.repository;

import com.eni.gestionavis.bo.Avis;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class AvisRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(AvisRepositoryTest.class);

    @Autowired
    AvisRepository avisRepository;

    @Test
    void test_save() {
        Avis avis = Avis.builder().commentaire("Ce vin est un dur avec le palais").note(3).date(LocalDateTime.now()).build();

        Avis savedAvis = this.avisRepository.save(avis);

        assertNotNull(savedAvis.getId());
        logger.info(savedAvis.toString());
    }

    @Test
    void test_findAll() {
        List<Avis> allAvis = avisRepository.findAll();

        logger.info(allAvis.toString());
    }
}
