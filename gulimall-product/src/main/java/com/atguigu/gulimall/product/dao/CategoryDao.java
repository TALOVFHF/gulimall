package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author TA
 * @email TA@gmail.com
 * @date 2022-05-13 14:05:51
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
