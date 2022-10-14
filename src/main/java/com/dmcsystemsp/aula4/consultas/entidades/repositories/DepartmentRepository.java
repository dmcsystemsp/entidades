package com.dmcsystemsp.aula4.consultas.entidades.repositories;

import com.dmcsystemsp.aula4.consultas.entidades.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
