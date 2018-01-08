package com.mmall.vo;

import com.mmall.pojo.OrderItem;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by 10679 on 2018/1/3.
 */
public class OrderProductVo {
    private List<OrderItemVo> oroductVoList;
    private BigDecimal productTotalPrice;
    private String imageHost;

    public List<OrderItemVo> getOroductVoList() {
        return oroductVoList;
    }

    public void setOroductVoList(List<OrderItemVo> oroductVoList) {
        this.oroductVoList = oroductVoList;
    }

    public BigDecimal getProductTotalPrice() {
        return productTotalPrice;
    }

    public void setProductTotalPrice(BigDecimal productTotalPrice) {
        this.productTotalPrice = productTotalPrice;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }
}
