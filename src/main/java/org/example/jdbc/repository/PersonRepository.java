package org.example.jdbc.repository;


import org.example.jdbc.entity.Person;
import org.example.jdbc.entity.PersonalData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, PersonalData> {

    List<Person> findPersonByCityOfLiving(String city);

    List<Person> findByPersonalData_AgeIsLessThanOrderByPersonalData_Age(int age);

    @Query("SELECT p FROM Person p WHERE LOWER(p.personalData.name) = LOWER(:name) AND LOWER(p.personalData.surname) = LOWER(:surname)")
    Optional<List<Person>> findPersonByNameAndSurname(@Param("name") String name, @Param("surname") String surname);

}
