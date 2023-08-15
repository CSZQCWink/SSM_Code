package com.csz.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsPackage: com.csz.spring.bean
 * @ClassName: User
 * @Author: QC_Wink
 * @Description: 用户类
 * @CreateTime: 2023-08-15 15:27
 * @Version: 1.0
 */
@Data

@AllArgsConstructor
public class User {

	private Integer id;
	private String username;
	private String password;
	private Integer age;

	public User() {
		System.out.println("生命周期：1、创建对象");
	}
	public void initMethod(){
		System.out.println("初始化");
	}
	public void destroyMethod(){
		System.out.println("销毁");
	}
}
