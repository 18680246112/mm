package com.jzh.xx.transaction.vo;

import com.jzh.xx.transaction.domain.Category;
import com.jzh.xx.transaction.domain.Goods;

import java.io.Serializable;

public class GoodsVO implements Serializable {

    /**
     * 分类ID
     */
    private String categoryId;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 商品
     */
    private Goods goods;

    /**
     * 分类
     */
    private Category category;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
