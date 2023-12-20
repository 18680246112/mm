package com.jzh.xx.transaction.vo;

import com.jzh.xx.transaction.domain.Express;
import com.jzh.xx.transaction.domain.OrderDetail;
import com.jzh.xx.transaction.domain.XxUser;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class OrderVO implements Serializable {
    /**
     * 订单ID
     */
    private Long id;

    /**
     * 快递
     */
    private Express express;

    /**
     * 订单项集合
     */
    private List<OrderDetail> orderDetails;

    /**
     *订单总额
     */
    private Double total;

    /**
     * 订单创建时间
     */
    private Date createTime;

    /**
     * 订单状态
     */
    private Byte status;

    /**
     * 会员信息
     */
    private XxUser user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Express getExpress() {
        return express;
    }

    public void setExpress(Express express) {
        this.express = express;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public XxUser getUser() {
        return user;
    }

    public void setUser(XxUser user) {
        this.user = user;
    }
}
