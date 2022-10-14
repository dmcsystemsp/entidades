package com.dmcsystemsp.aula4.consultas.entidades.services;

import com.dmcsystemsp.aula4.consultas.entidades.dto.PersonDTO;
import com.dmcsystemsp.aula4.consultas.entidades.dto.PersonDepartmentDTO;
import com.dmcsystemsp.aula4.consultas.entidades.entities.Department;
import com.dmcsystemsp.aula4.consultas.entidades.entities.Person;
import com.dmcsystemsp.aula4.consultas.entidades.repositories.DepartmentRepository;
import com.dmcsystemsp.aula4.consultas.entidades.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;
    @Autowired
    private DepartmentRepository depRepository;
    public PersonDepartmentDTO insert(PersonDepartmentDTO dto){

        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        //Esta declaração para pegar o nome do departamento
        Department dept = depRepository.getReferenceById(dto.getDepartment().getId());

        //Department dept = new Department();
        //dept.setId(dto.getDepartment().getId());

        entity.setDepartment(dept);

        entity = repository.save(entity);

        return new PersonDepartmentDTO(entity);
    }

    public PersonDTO insert(PersonDTO dto){

        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        //Department dept = depRepository.getReferenceById(dto.getDepartmentId());

        Department dept = new Department();
        dept.setId(dto.getDepartmentId());

        entity.setDepartment(dept);

        entity = repository.save(entity);

        return new PersonDTO(entity);
    }

}
