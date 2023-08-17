package com.csz.springAop.dao;

/**
 * @BelongsPackage: com.csz.springAop.dao
 * @ClassName: CalculatorDao
 * @Author: QC_Wink
 * @Description: 计算器数据访问层
 * @CreateTime: 2023-08-17 10:39
 * @Version: 1.0
 */

public interface CalculatorDao {
	int add(int i, int j);
	int sub(int i, int j);
	int mul(int i, int j);
	int div(int i, int j);
}
