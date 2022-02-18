package com.hutao.springboot_vue_test.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author HUTAO
 * @Description
 * @date 2022/2/16 15:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("book")
public class Book {
	@TableId(type = IdType.AUTO)
	private Integer id;
	private String name;
	private String author;
}
