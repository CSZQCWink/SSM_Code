package com.csz.mybatisResultMap.mapper;

import com.csz.mybatisResultMap.pojo.Emp;

import java.util.List;

/**
 * @BelongsPackage: com.csz.mybatisResultMap.mapper
 * @ClassName: EmpMapper
 * @Author: QC_Wink
 * @Description: 员工mapper
 * @CreateTime: 2023-07-26 16:08
 * @Version: 1.0
 */

public interface EmpMapper {
	List<Emp> getAllEmpList();
}
