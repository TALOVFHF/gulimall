package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author TA
 * @email TA@gmail.com
 * @date 2022-05-13 17:30:49
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
