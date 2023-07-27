package com.csz.mybatisResultMap.mapper;

import com.csz.mybatisResultMap.pojo.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @BelongsPackage: com.csz.mybatisResultMap.mapper
 * @ClassName: DeptMapper
 * @Author: QC_Wink
 * @Description: 部门Mapper
 * @CreateTime: 2023-07-26 16:17
 * @Version: 1.0
 */

public interface DeptMapper {
	// 查询所有的部门信息
	List<Dept> getAllDeptList();

	// 分步查询员工的部门信息
	Dept SubStepTwoGetEmpAndDeptById(@Param("deptId") Integer deptId);
}
