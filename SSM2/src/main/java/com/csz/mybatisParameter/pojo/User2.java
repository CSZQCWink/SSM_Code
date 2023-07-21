package com.csz.mybatisParameter.pojo;

import lombok.*;

/**
 * @BelongsPackage: com.csz.ssm.pojo
 * @ClassName: User2
 * @Author: QC_Wink
 * @Description: 用户类
 * @CreateTime: 2023-07-20  23:37
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User2 {
    // 用户id
    private Integer id;
    // 用户名称
    private String username;
    // 用户密码
    private String password;
    // 用户年龄
    private int age;
    // 用户性别
    private String gender;
    // 用户邮箱
    private String email;
}
