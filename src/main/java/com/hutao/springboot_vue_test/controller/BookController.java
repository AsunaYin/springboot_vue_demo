package com.hutao.springboot_vue_test.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hutao.springboot_vue_test.mapper.BookMapper;
import com.hutao.springboot_vue_test.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author HUTAO
 * @Description
 * @date 2022/2/16 16:39
 */
@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookMapper bookMapper;
	
	@GetMapping("/allbook/{page}")
	public IPage<Book> findAll(@PathVariable("page") Integer pageNum){
		Page<Book> page = new Page<>(pageNum,10);
		return bookMapper.selectPage(page, null);
	}
	
	//添加书籍并保存
	@PostMapping("/save")
	public String addBook(@RequestBody Book book){
		int rows = bookMapper.insert(book);			//返回值为受影响的行数
		
		//判断是否存入数据库
		if (rows < 1){
			return "error";
		} else {
			return "success";
		}
	}
	
	//更改书籍并保存
	@PostMapping("/update")
	public String updateBook(@RequestBody Book book){
		
		int rows = bookMapper.updateById(book);
		if (rows == 1){
			return "success";
		} else {
			return "error";
		}
	}
	
	//根据ID删除书籍
	@PostMapping("/delete")
	public String deleteBookById(@RequestBody Book book){
		Integer id = book.getId();
		int rows = bookMapper.deleteById(id);
		
		if (rows == 1){
			return "success";
		} else {
			return "error";
		}
	}
	
}
