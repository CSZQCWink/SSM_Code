package com.csz.transaction.service.impl;

import com.csz.transaction.dao.BookDao;
import com.csz.transaction.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @BelongsPackage: com.csz.transaction.service.impl
 * @ClassName: BookServiceImpl
 * @Author: QC_Wink
 * @Description: book的服务层的实现类
 * @CreateTime: 2023-08-18 10:10
 * @Version: 1.0
 */
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDao bookDao;

	@Override
	@Transactional
	public void buyBook(Integer bookId, Integer userId) {
		//查询图书的价格
		Integer price = bookDao.getPriceByBookId(bookId);
		//更新图书的库存
		bookDao.updateStock(bookId);
		//更新用户的余额
		bookDao.updateBalance(userId, price);
	}
}
