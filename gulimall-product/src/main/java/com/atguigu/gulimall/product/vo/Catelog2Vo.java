package com.atguigu.gulimall.product.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//2级分离vo
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Catelog2Vo {
    private String catalog1Id;  //1级父分类id
    private List<catelog3Vo> catalog3List;  //三级子分类
    private String id;
    private String name;

    /**
     * 三级分类vo
     */
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class catelog3Vo{
        private String catalog2Id; //父分类，二级分类id
        private String id;
        private String name;
    }
}
