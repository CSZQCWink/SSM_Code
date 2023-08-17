package com.csz.aop.annotation;

/**
 * @BelongsPackage: com.csz.aop.annotation
 * @ClassName: Calculator
 * @Author: QC_Wink
 * @Description: 计算器接口
 * @CreateTime: 2023-08-17 14:52
 * @Version: 1.0
 */

public interface Calculator {
    int add(int i, int j);
    int sub(int i, int j);
    int mul(int i, int j);
    int div(int i, int j);
}
