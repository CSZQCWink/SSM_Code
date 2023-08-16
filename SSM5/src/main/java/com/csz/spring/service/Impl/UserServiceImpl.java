package com.csz.spring.service.Impl;

import com.csz.spring.dao.UserDaO;
import com.csz.spring.service.UserService;
import lombok.Data;

/**
 * @BelongsPackage: com.csz.spring.service.Impl
 * @ClassName: UserServiceImpl
 * @Author: QC_Wink
 * @Description: UserServiceImpl
 * @CreateTime: 2023-08-16 10:55
 * @Version: 1.0
 */

@Data
public class UserServiceImpl implements UserService {
	private UserDaO userDaO;

	/**
	 * @title: saveUser_Service
	 * @author: QC_Wink
	 * @description: 保存用户_Service层
	 * @param: []
	 * @return: void
	 * @throws:
	 * @date: 2023/8/16 11:17
	 **/
	@Override
	public void saveUser_Service() {
		userDaO.saveUser_Dao();
	}
}
