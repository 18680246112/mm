package com.jzh.xx.transaction.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName order_detail
 */
@TableName(value ="order_detail")
@Data
public class OrderDetail implements Serializable {
    /**
     * 订单详情ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 商品ID
     */
    private Long goodsId;

    /**
     * 卖家ID
     */
    private Long sellerId;

    /**
     * 快递ID
     */
    private Long expressId;

    /**
     * 快递名称
     */
    private String expressName;

    /**
     * 快递价格
     */
    private Double expressPrice;

    /**
     * 商品图片
     */
    private String goodsImg;

    /**
     * 商品数量
     */
    private Integer buyCount;

    /**
     * 商品价格
     */
    private Double goodsPrice;

    /**
     * 商品名称
     */
    private String goodsName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getExpressId() {
        return expressId;
    }

    public void setExpressId(Long expressId) {
        this.expressId = expressId;
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    public Double getExpressPrice() {
        return expressPrice;
    }

    public void setExpressPrice(Double expressPrice) {
        this.expressPrice = expressPrice;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
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
        OrderDetail other = (OrderDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getSellerId() == null ? other.getSellerId() == null : this.getSellerId().equals(other.getSellerId()))
            && (this.getExpressId() == null ? other.getExpressId() == null : this.getExpressId().equals(other.getExpressId()))
            && (this.getExpressName() == null ? other.getExpressName() == null : this.getExpressName().equals(other.getExpressName()))
            && (this.getExpressPrice() == null ? other.getExpressPrice() == null : this.getExpressPrice().equals(other.getExpressPrice()))
            && (this.getGoodsImg() == null ? other.getGoodsImg() == null : this.getGoodsImg().equals(other.getGoodsImg()))
            && (this.getBuyCount() == null ? other.getBuyCount() == null : this.getBuyCount().equals(other.getBuyCount()))
            && (this.getGoodsPrice() == null ? other.getGoodsPrice() == null : this.getGoodsPrice().equals(other.getGoodsPrice()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getSellerId() == null) ? 0 : getSellerId().hashCode());
        result = prime * result + ((getExpressId() == null) ? 0 : getExpressId().hashCode());
        result = prime * result + ((getExpressName() == null) ? 0 : getExpressName().hashCode());
        result = prime * result + ((getExpressPrice() == null) ? 0 : getExpressPrice().hashCode());
        result = prime * result + ((getGoodsImg() == null) ? 0 : getGoodsImg().hashCode());
        result = prime * result + ((getBuyCount() == null) ? 0 : getBuyCount().hashCode());
        result = prime * result + ((getGoodsPrice() == null) ? 0 : getGoodsPrice().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", sellerId=").append(sellerId);
        sb.append(", expressId=").append(expressId);
        sb.append(", expressName=").append(expressName);
        sb.append(", expressPrice=").append(expressPrice);
        sb.append(", goodsImg=").append(goodsImg);
        sb.append(", buyCount=").append(buyCount);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}