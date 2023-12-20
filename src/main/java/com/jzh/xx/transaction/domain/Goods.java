package com.jzh.xx.transaction.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName goods
 */
@TableName(value ="goods")
@Data
public class Goods implements Serializable {
    /**
     * 商品ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 分类ID
     */
    private Long categoryId;

    /**
     * 卖家ID
     */
    private Long sellerId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 价格
     */
    private Double price;

    /**
     * 原价格
     */
    private Double originalPrice;

    /**
     * 描述
     */
    private String goodsDetail;

    /**
     * 数量
     */
    private Integer goodsNumber;

    /**
     * 热度
     */
    private Integer heat;

    /**
     * 图片1
     */
    private String picture1;

    /**
     * 图片2
     */
    private String picture2;

    /**
     * 图片3
     */
    private String picture3;

    /**
     * 图片4
     */
    private String picture4;

    /**
     * 图片5
     */
    private String picture5;

    /**
     * 精选1 白菜2
     */
    private Byte jbStatus;

    /**
     * 售出0 还有1
     */
    private Byte sellStatus;

    /**
     * 上架时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date updated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Integer getHeat() {
        return heat;
    }

    public void setHeat(Integer heat) {
        this.heat = heat;
    }

    public String getPicture1() {
        return picture1;
    }

    public void setPicture1(String picture1) {
        this.picture1 = picture1;
    }

    public String getPicture2() {
        return picture2;
    }

    public void setPicture2(String picture2) {
        this.picture2 = picture2;
    }

    public String getPicture3() {
        return picture3;
    }

    public void setPicture3(String picture3) {
        this.picture3 = picture3;
    }

    public String getPicture4() {
        return picture4;
    }

    public void setPicture4(String picture4) {
        this.picture4 = picture4;
    }

    public String getPicture5() {
        return picture5;
    }

    public void setPicture5(String picture5) {
        this.picture5 = picture5;
    }

    public Byte getJbStatus() {
        return jbStatus;
    }

    public void setJbStatus(Byte jbStatus) {
        this.jbStatus = jbStatus;
    }

    public Byte getSellStatus() {
        return sellStatus;
    }

    public void setSellStatus(Byte sellStatus) {
        this.sellStatus = sellStatus;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Goods other = (Goods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getSellerId() == null ? other.getSellerId() == null : this.getSellerId().equals(other.getSellerId()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getOriginalPrice() == null ? other.getOriginalPrice() == null : this.getOriginalPrice().equals(other.getOriginalPrice()))
            && (this.getGoodsDetail() == null ? other.getGoodsDetail() == null : this.getGoodsDetail().equals(other.getGoodsDetail()))
            && (this.getGoodsNumber() == null ? other.getGoodsNumber() == null : this.getGoodsNumber().equals(other.getGoodsNumber()))
            && (this.getHeat() == null ? other.getHeat() == null : this.getHeat().equals(other.getHeat()))
            && (this.getPicture1() == null ? other.getPicture1() == null : this.getPicture1().equals(other.getPicture1()))
            && (this.getPicture2() == null ? other.getPicture2() == null : this.getPicture2().equals(other.getPicture2()))
            && (this.getPicture3() == null ? other.getPicture3() == null : this.getPicture3().equals(other.getPicture3()))
            && (this.getPicture4() == null ? other.getPicture4() == null : this.getPicture4().equals(other.getPicture4()))
            && (this.getPicture5() == null ? other.getPicture5() == null : this.getPicture5().equals(other.getPicture5()))
            && (this.getJbStatus() == null ? other.getJbStatus() == null : this.getJbStatus().equals(other.getJbStatus()))
            && (this.getSellStatus() == null ? other.getSellStatus() == null : this.getSellStatus().equals(other.getSellStatus()))
            && (this.getCreated() == null ? other.getCreated() == null : this.getCreated().equals(other.getCreated()))
            && (this.getUpdated() == null ? other.getUpdated() == null : this.getUpdated().equals(other.getUpdated()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getSellerId() == null) ? 0 : getSellerId().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getOriginalPrice() == null) ? 0 : getOriginalPrice().hashCode());
        result = prime * result + ((getGoodsDetail() == null) ? 0 : getGoodsDetail().hashCode());
        result = prime * result + ((getGoodsNumber() == null) ? 0 : getGoodsNumber().hashCode());
        result = prime * result + ((getHeat() == null) ? 0 : getHeat().hashCode());
        result = prime * result + ((getPicture1() == null) ? 0 : getPicture1().hashCode());
        result = prime * result + ((getPicture2() == null) ? 0 : getPicture2().hashCode());
        result = prime * result + ((getPicture3() == null) ? 0 : getPicture3().hashCode());
        result = prime * result + ((getPicture4() == null) ? 0 : getPicture4().hashCode());
        result = prime * result + ((getPicture5() == null) ? 0 : getPicture5().hashCode());
        result = prime * result + ((getJbStatus() == null) ? 0 : getJbStatus().hashCode());
        result = prime * result + ((getSellStatus() == null) ? 0 : getSellStatus().hashCode());
        result = prime * result + ((getCreated() == null) ? 0 : getCreated().hashCode());
        result = prime * result + ((getUpdated() == null) ? 0 : getUpdated().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", sellerId=").append(sellerId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", price=").append(price);
        sb.append(", originalPrice=").append(originalPrice);
        sb.append(", goodsDetail=").append(goodsDetail);
        sb.append(", goodsNumber=").append(goodsNumber);
        sb.append(", heat=").append(heat);
        sb.append(", picture1=").append(picture1);
        sb.append(", picture2=").append(picture2);
        sb.append(", picture3=").append(picture3);
        sb.append(", picture4=").append(picture4);
        sb.append(", picture5=").append(picture5);
        sb.append(", jbStatus=").append(jbStatus);
        sb.append(", sellStatus=").append(sellStatus);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}