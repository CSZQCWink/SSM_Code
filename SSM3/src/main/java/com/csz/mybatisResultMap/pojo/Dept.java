package com.csz.mybatisResultMap.pojo;

import lombok.*;

import java.util.List;

/**
 * @BelongsPackage: com.csz.mybatisResultMap.pojo
 * @ClassName: Dept
 * @Author: QC_Wink
 * @Description: 部门实体类
 * @CreateTime: 2023-07-26 16:15
 * @Version: 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Dept {
	private Integer deptId;

	private String deptName;

	private List<Emp> empList;
}
