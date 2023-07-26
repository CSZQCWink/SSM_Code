package com.csz.mybatisResultMap.mapper;

import com.csz.mybatisResultMap.pojo.Dept;

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
	List<Dept> getAllDeptList();
}
