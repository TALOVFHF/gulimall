package com.atguigu.gulimall.product.vo;

import lombok.Data;

@Data
public class AttrRespVo extends AttrVo {
    /**
     * catelogName：所有分类名字
     * groupName：所属分组名字
     */
    private String catelogName;
    private String groupName;

    private Long[] catelogPath;
}
