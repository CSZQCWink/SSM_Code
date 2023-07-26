package com.csz.mybatisResultMap.pojo;

import lombok.*;

/**
 * @BelongsPackage: com.csz.mybatisResultMap.pojo
 * @ClassName: Emp
 * @Author: QC_Wink
 * @Description: 员工类
 * @CreateTime: 2023-07-26 16:11
 * @Version: 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Emp {
    private Integer empId;
    private String empName;
    private Integer age;
    private String gender;
    // 一对一就是实体类对象 一对多就是一个集合
    private Dept dept;
}
