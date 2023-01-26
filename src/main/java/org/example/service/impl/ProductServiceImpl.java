package org.example.service.impl;

import org.example.enums.EnumCategory;
import org.example.model.Product;
import org.example.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }


    @Override
    public void seeArray() {
        for (Product product:products){
            System.out.println(product.toString());
        }
    }
}
