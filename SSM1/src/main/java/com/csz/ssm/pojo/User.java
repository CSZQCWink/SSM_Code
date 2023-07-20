package com.csz.ssm.pojo;

import lombok.*;

/**
 * @BelongsPackage: com.csz.ssm.pojo
 * @ClassName: User
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
public class User {
    private Integer id;
    private String name;
    private String password;
    private String email;
    private int age;
    private String gender;
}
