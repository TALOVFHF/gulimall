package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author TA
 * @email TA@gmail.com
 * @date 2022-05-13 17:20:34
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}