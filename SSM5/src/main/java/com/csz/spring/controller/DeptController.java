package com.csz.spring.controller;

import com.csz.spring.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @BelongsPackage: com.csz.spring.controller
 * @ClassName: DeptController
 * @Author: QC_Wink
 * @Description: 部门Controller
 * @CreateTime: 2023-08-16 15:23
 * @Version: 1.0
 */

@Controller
public class DeptController {
	@Autowired
	private DeptService deptService;

	public void saveDept_Controller(){
		deptService.saveDept_Service();
	}

}
