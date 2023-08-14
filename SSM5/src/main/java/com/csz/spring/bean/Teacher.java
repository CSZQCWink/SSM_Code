package com.csz.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsPackage: com.csz.spring.bean
 * @ClassName: Teacher
 * @Author: QC_Wink
 * @Description: 教师类
 * @CreateTime: 2023-08-14 18:07
 * @Version: 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
	private Integer teacherId;
	private String teacherName;
}
