package com.wjq.springcloud.provider.dao;

import com.wjq.springcloud.api.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface EmployeeDao {
    public List<Employee> findAll();
    public Employee findById(int id);
    public boolean addEmployee(Employee e);
}
