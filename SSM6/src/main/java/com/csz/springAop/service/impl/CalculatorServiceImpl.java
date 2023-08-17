package com.csz.springAop.service.impl;

import com.csz.springAop.dao.CalculatorDao;
import com.csz.springAop.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsPackage: com.csz.springAop.service.impl
 * @ClassName: CalculatorServiceImpl
 * @Author: QC_Wink
 * @Description: 计算器服务层的实现类
 * @CreateTime: 2023-08-17 10:39
 * @Version: 1.0
 */
@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Autowired
	private CalculatorDao calculatorDao;


	@Override
	public void calculateMethod() {
		calculatorDao.add(1,2);
		calculatorDao.div(1,2);
		calculatorDao.mul(1,2);
		calculatorDao.mul(1,2);
	}
}
