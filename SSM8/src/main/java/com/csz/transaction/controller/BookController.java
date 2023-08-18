package com.csz.transaction.controller;

import com.csz.transaction.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @BelongsPackage: com.csz.transaction.controller
 * @ClassName: BookController
 * @Author: QC_Wink
 * @Description: book的控制层
 * @CreateTime: 2023-08-18 10:06
 * @Version: 1.0
 */

@Controller
public class BookController {
	@Autowired
	private BookService bookService;

	public void buyBook(Integer bookId, Integer userId ){
		bookService.buyBook(bookId, userId);
	}

}
