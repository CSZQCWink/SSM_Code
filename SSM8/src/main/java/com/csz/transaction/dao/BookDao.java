package com.csz.transaction.dao;

/**
 * @BelongsPackage: com.csz.transaction.dao
 * @ClassName: BookDao
 * @Author: QC_Wink
 * @Description: book的数据交互层
 * @CreateTime: 2023-08-18 10:10
 * @Version: 1.0
 */

public interface BookDao {


	Integer getPriceByBookId(Integer bookId);

	void updateStock(Integer bookId);

	void updateBalance(Integer userId, Integer price);
}
