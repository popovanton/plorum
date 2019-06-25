package ru.popovanton.plorum.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.popovanton.plorum.domains.Employee;
import ru.popovanton.plorum.javabasics.SimpleFile;
import ru.popovanton.plorum.repositories.EmployeeRepository;
import ru.popovanton.plorum.services.EmployeeService;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class indexController {

    EmployeeService employeeService;

    public indexController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping({"", "/", "/index.html", "/index"})
    public String getIndex(Model model) {
        model.addAttribute("employees", employeeService.findAll());
        return "index";
    }

    @GetMapping({"/sort", "/sort.html"})
    public String getSortedIndex(Model model) {
        model.addAttribute("employees", employeeService.findAllByOrderBySurnameAsc());
        return "index";
    }

    @GetMapping({"/store", "/store.html"})
    public String getDataStored() throws IOException {
        String path = "/plorum/testcase.txt";
        SimpleFile simpleFile = new SimpleFile();
        simpleFile.setFile(path);
        List<Employee> employees = employeeService.findAll();
        for (Employee employee : employees) {
            simpleFile.writeStringToFile(simpleFile.getFile(), employee.toString() + "\n");
        }
        return "index";
    }
}
