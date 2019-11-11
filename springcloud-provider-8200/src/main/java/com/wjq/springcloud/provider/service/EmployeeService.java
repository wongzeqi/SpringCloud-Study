package com.wjq.springcloud.provider.service;

import com.wjq.springcloud.api.bean.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> list();
    public boolean add(Employee e);
    public Employee get(int id);
}
