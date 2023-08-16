package com.csz.spring.service.Impl;

import com.csz.spring.dao.DeptDao;
import com.csz.spring.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsPackage: com.csz.spring.service.Impl
 * @ClassName: DeptServiceImpl
 * @Author: QC_Wink
 * @Description: 部门Service接口的实现类
 * @CreateTime: 2023-08-16 15:25
 * @Version: 1.0
 */

@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptDao deptDao;
	@Override
	public void saveDept_Service() {
		deptDao.saveDept_Dao();
	}
}
