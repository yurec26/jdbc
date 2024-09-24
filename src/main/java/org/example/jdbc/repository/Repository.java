package org.example.jdbc.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.jdbc.entity.Person;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {

    @PersistenceContext
    private EntityManager entityManager;


    public Repository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Person> getPersonsByCity(String cityOfLiving) {
        String jpql = "SELECT p FROM Person p";
        return entityManager.createQuery(jpql, Person.class).getResultList()
                .stream().filter(s -> s.getCityOfLiving().equals(cityOfLiving)).toList();
    }
}
