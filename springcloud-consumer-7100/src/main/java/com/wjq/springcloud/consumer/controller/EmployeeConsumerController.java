package com.wjq.springcloud.consumer.controller;


import com.wjq.springcloud.api.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class EmployeeConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    private static final String url = "http://emp.provider8100.com:8100";

    @RequestMapping(value = "/consumer/emp/list", method = RequestMethod.GET)
    public List<Employee> list() {
        return restTemplate.getForObject(url+"/emp/list",List.class);
    }
    @RequestMapping(value = "/consumer/emp/add" , method = RequestMethod.POST)
    public boolean add(Employee e) {
        return restTemplate.postForObject(url+"/dep/add",e,Boolean.class);
    }
    @RequestMapping(value = "/consumer/emp/get/{id}",method = RequestMethod.GET)
    public Employee get(@PathVariable int id) {
        return restTemplate.getForObject(url + "/emp/get/"+id,Employee.class);
    }

}
