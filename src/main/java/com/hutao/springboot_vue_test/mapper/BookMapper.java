package com.hutao.springboot_vue_test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hutao.springboot_vue_test.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author HUTAO
 * @Description
 * @date 2022/2/16 15:46
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {
}
