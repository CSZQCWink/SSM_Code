package com.csz.spring.dao.impl;

import com.csz.spring.dao.DeptDao;
import org.springframework.stereotype.Repository;

/**
 * @BelongsPackage: com.csz.spring.dao.impl
 * @ClassName: DeptDaoImpl
 * @Author: QC_Wink
 * @Description: 部门Dao接口的实现类
 * @CreateTime: 2023-08-16 15:27
 * @Version: 1.0
 */
@Repository
public class DeptDaoImpl implements DeptDao {
	@Override
	public void saveDept_Dao() {
		System.out.println("添加部门成功");
	}
}
