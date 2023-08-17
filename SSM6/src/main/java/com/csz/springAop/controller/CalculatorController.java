package com.csz.springAop.controller;

import com.csz.springAop.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @BelongsPackage: com.csz.springAop.controller
 * @ClassName: CalculatorController
 * @Author: QC_Wink
 * @Description: 计算器控制层
 * @CreateTime: 2023-08-17 10:37
 * @Version: 1.0
 */
@Controller
public class CalculatorController {
	@Autowired
	private CalculatorService calculatorService;

	public void calculatorMethod(){
		calculatorService.calculateMethod();
	}
}
