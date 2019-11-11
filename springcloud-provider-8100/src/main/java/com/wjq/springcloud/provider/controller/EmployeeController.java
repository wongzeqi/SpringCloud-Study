package com.wjq.springcloud.provider.controller;


import com.wjq.springcloud.api.bean.Employee;
import com.wjq.springcloud.provider.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController  {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/emp/list", method = RequestMethod.GET)
    public List<Employee> list() {
        return employeeService.list();
    }
    @RequestMapping(value = "/emp/add" , method = RequestMethod.POST)
    public boolean add(Employee e) {
        return employeeService.add(e);
    }
    @RequestMapping(value = "/emp/get/{id}",method = RequestMethod.GET)
    public Employee get(@PathVariable  int id) {
        return employeeService.get(id);
    }

}
