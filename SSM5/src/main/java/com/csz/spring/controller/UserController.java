package com.csz.spring.controller;

import com.csz.spring.service.UserService;
import lombok.Data;

/**
 * @BelongsPackage: com.csz.spring.controller
 * @ClassName: UserController
 * @Author: QC_Wink
 * @Description: 用户的Controller层
 * @CreateTime: 2023-08-16 10:50
 * @Version: 1.0
 */

@Data
public class UserController {
	private UserService userService;

	/**
	 * @title: saveUser_Controller
	 * @author: QC_Wink
	 * @description: 保存用户_controller层
	 * @param: []
	 * @return: void
	 * @throws:
	 * @date: 2023/8/16 11:11
	 **/
	public void saveUser_Controller(){
		userService.saveUser_Service();
	}

}
