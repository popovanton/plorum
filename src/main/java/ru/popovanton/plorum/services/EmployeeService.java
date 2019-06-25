package ru.popovanton.plorum.services;

import ru.popovanton.plorum.domains.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    List<Employee> findAllByOrderBySurnameAsc();

}
