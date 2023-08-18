package com.csz.transaction.service;

/**
 * @BelongsPackage: com.csz.transaction.service
 * @ClassName: BookService
 * @Author: QC_Wink
 * @Description: book的服务层
 * @CreateTime: 2023-08-18 10:09
 * @Version: 1.0
 */

public interface BookService {

	void buyBook(Integer bookId, Integer userId);
}
