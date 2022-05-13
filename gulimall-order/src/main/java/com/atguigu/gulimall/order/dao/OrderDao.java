package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author TA
 * @email TA@gmail.com
 * @date 2022-05-13 17:41:06
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
