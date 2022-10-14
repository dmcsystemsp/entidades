package com.dmcsystemsp.aula4.consultas.entidades.repositories;

import com.dmcsystemsp.aula4.consultas.entidades.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
