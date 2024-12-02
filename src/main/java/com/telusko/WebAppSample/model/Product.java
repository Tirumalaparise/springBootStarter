package com.telusko.WebAppSample.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    private int prodId;
    private String prodName;
    private int price;

    public void setProdId(Integer prodId) {
        prodId = prodId;
    }

    public void setProdName(String prodName) {
        prodName = prodName;
    }

    public void setPrice(Integer price) {
        price = price;
    }

    public Integer getProdId() {
        return prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public Integer getPrice() {
        return price;
    }
}
