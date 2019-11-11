package com.wjq.springcloud.api.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Data                   //添加get、set方法 和hashcode equals
@Accessors(chain = true)//开启链式访问
public class Employee implements Serializable {

    private String empName;
    private String empSex;
    private Integer empAge;
    private String empEmail;
    private Integer empId;
    private String empDB;

}
