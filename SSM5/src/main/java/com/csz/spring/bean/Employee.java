package com.csz.spring.bean;

import lombok.Data;

/**
 * @BelongsPackage: com.csz.spring.bean
 * @ClassName: Employee
 * @Author: QC_Wink
 * @Description: 员工类
 * @CreateTime: 2023-08-16 14:09
 * @Version: 1.0
 */
@Data
public class Employee {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
}
