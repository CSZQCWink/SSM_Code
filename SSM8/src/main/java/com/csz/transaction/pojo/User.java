package com.csz.transaction.pojo;

import lombok.Data;

/**
 * @BelongsPackage: com.csz.transaction.pojo
 * @ClassName: User
 * @Author: QC_Wink
 * @Description: 用户类
 * @CreateTime: 2023-08-18 10:39
 * @Version: 1.0
 */

@Data
public class User {
    private Integer userId;
    private String userName;
    private Integer balance;
}
