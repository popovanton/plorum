package ru.popovanton.plorum.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.popovanton.plorum.domains.Employee;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee> findAll();
    List<Employee> findAllByOrderBySurnameAsc();
}
