package com.neuedu.VO;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderItemVO implements Serializable {
           private Long  orderNo; // "orderNo": 1485158223095,
           private Integer productId;//"productId": 2,
           private String productName;//"productName": "oppo R8",
           private String productImage;// "productImage": "mainimage.jpg",
           private BigDecimal currentUnitPrice;//"currentUnitPrice": 2999.11,
           private Integer quantity;// "quantity": 1,
           private BigDecimal totalPrice;//"totalPrice": 2999.11,
           private String createTime;//"createTime": null

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public BigDecimal getCurrentUnitPrice() {
        return currentUnitPrice;
    }

    public void setCurrentUnitPrice(BigDecimal currentUnitPrice) {
        this.currentUnitPrice = currentUnitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
