package com.csz.transaction.pojo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @BelongsPackage: com.csz.transaction.pojo
 * @ClassName: Book
 * @Author: QC_Wink
 * @Description: 书类
 * @CreateTime: 2023-08-18 10:07
 * @Version: 1.0
 */
@Data
public class Book {
    private Integer bookId;
	private String bookName;
	private Integer price;
	private Integer stock;
}
