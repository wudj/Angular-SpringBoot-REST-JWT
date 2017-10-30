package com.app.model.order;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class CompositeOrderProductKey implements Serializable {
    private static final long serialVersionUID = 5389583648050241890L;
    private int orderId;
    private int productId;

    public CompositeOrderProductKey(int orderId, int productId){
        this.orderId   =orderId;
        this.productId =productId;
    }
}
