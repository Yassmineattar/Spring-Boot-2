package com.example.demo.dao.repositories;

import com.example.demo.dao.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
