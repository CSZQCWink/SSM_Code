package com.csz.mybatisResultMap.mapper;

import com.csz.mybatisResultMap.pojo.Emp;
import org.apache.ibatis.annotations.Param;

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
	// 查询所有的员工
	List<Emp> getAllEmpList();

	// 根据id查询 指定的员工
	Emp getEmpById(@Param("id") int id);

	// 根据id 查询中指定的员工信息和对应的部门信息
	Emp getEmpAndDeptById(@Param("empId") int empId);
}
