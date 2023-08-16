package com.csz.spring.bean;

import lombok.Data;

import java.util.List;

/**
 * @BelongsPackage: com.csz.spring.bean
 * @ClassName: Department
 * @Author: QC_Wink
 * @Description: 部门类
 * @CreateTime: 2023-08-16 15:22
 * @Version: 1.0
 */

@Data
public class Department {
    private Integer deptId;
    private String deptName;
    private List<Employee> empList;
}
