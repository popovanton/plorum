package ru.popovanton.plorum.services;

import org.springframework.stereotype.Service;
import ru.popovanton.plorum.domains.Employee;
import ru.popovanton.plorum.repositories.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
    public List<Employee> findAllByOrderBySurnameAsc() {
        return employeeRepository.findAllByOrderBySurnameAsc();
    }


}
