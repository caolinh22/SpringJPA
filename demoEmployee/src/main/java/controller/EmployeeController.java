package controller;

import entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.EployeeJPARepository;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/employee")
public class EmployeeController {
    @Autowired
    private EployeeJPARepository eployeeJPARepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> getList() {
        return eployeeJPARepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Employee create(@RequestBody Employee employee) {
        return eployeeJPARepository.save(employee);
    }
}
