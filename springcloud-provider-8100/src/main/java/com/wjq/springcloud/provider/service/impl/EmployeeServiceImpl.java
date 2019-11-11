package com.wjq.springcloud.provider.service.impl;

import com.wjq.springcloud.api.bean.Employee;
import com.wjq.springcloud.provider.dao.EmployeeDao;
import com.wjq.springcloud.provider.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public List<Employee> list() {
        return employeeDao.findAll();
    }

    @Override
    public boolean add(Employee e) {
        return employeeDao.addEmployee(e);
    }

    @Override
    public Employee get(int id) {
        return employeeDao.findById(id);
    }
}
