package com.csz.transaction.pojo;

import lombok.Data;

/**
 * @BelongsPackage: com.csz.transaction
 * @ClassName: Emp
 * @Author: QC_Wink
 * @Description: 员工类
 * @CreateTime: 2023-08-18 09:28
 * @Version: 1.0
 */
@Data
public class Emp {
	private Integer empId;
	private String empName;
	private Integer age;
	private String gender;
	private String dept_id;
}
