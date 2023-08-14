package com.csz.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @BelongsPackage: com.csz.spring.pojo
 * @ClassName: Student
 * @Author: QC_Wink
 * @Description: 学生类
 * @CreateTime: 2023-08-14 17:10
 * @Version: 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	private Integer id;
	private String name;
	private Integer age;
	private String sex;
	private Clazz clazz;
	private String[] hobbies;
	private Map<String, Teacher> teacherMap;
}
