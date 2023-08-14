package com.csz.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @BelongsPackage: com.csz.spring.bean
 * @ClassName: Clazz
 * @Author: QC_Wink
 * @Description: 班级类
 * @CreateTime: 2023-08-14 17:42
 * @Version: 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Clazz {
    private Integer id;
	private String name;
	private List<Student> students;
}
