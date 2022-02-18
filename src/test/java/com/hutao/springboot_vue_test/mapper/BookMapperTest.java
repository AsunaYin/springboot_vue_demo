package com.hutao.springboot_vue_test.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hutao.springboot_vue_test.pojo.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author HUTAO
 * @Description
 * @date 2022/2/16 15:48
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class BookMapperTest {
	
	@Autowired
	private BookMapper bookMapper;
	
	@Test
	public void findAll(){
		
		List<Book> books = bookMapper.selectList(null);
		
		for (Book book: books) {
			System.out.println(book);
		}
		
		
	}
	
	@Test
	public void findAll2(){
		Page<Book> page = new Page<>(1,3);
		bookMapper.selectPage(page, null);
	}
	
	@Test
	public void insert(){
		Book book = new Book();
		book.setName("SpringBoot");
		book.setAuthor("胡桃");
		int insert = bookMapper.insert(book);
	}
	
	@Test
	public void update(){
		Book book = new Book();
		book.setId(27);
		book.setAuthor("27号作者");
		book.setName("2727272");
		
		int update = bookMapper.updateById(book);
		
	}
	
	@Test
	public void delete(){
		Book book = new Book();
		book.setId(31);
		Integer id = book.getId();
		int i = bookMapper.deleteById(id);
	}
	
}