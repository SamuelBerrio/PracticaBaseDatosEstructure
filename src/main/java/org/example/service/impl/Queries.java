package org.example.service.impl;

import org.example.enums.EnumCategory;
import org.example.model.Order;
import org.example.model.Product;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Queries {

    CustomerServiceImpl customerService = new CustomerServiceImpl();
    OrderServiceImpl orderService = new OrderServiceImpl();
    ProductServiceImpl productService = new ProductServiceImpl();

    public List<Product> oneQuerie(){
        return orderService.getProductList()
                .stream()
                .filter(e -> e.getCategory().equals(EnumCategory.LIBROS.getAccion()) && e.getPrice()>100.0)
                .collect(Collectors.toList());
    }

    public List<Order> twoQuerie(){
        return orderService.getOrderList()
                .stream()
                .filter(e -> e.getProducts().stream()
                        .anyMatch(u -> u.getCategory().equals(EnumCategory.BEBE.getAccion())))
                .collect(Collectors.toList());
    }

    public List<Product> treeQuerie(){
        return productService.getProducts()
                .stream()
                .filter(e -> e.getCategory().equals("Jugetes"))
                .peek(u->u.setPrice(u.getPrice()*0.1))
                .collect(Collectors.toList());
    }

    public List<Product> fourQuerie(){
        return orderService.getOrderList()
                .stream()
                .filter(e -> e.getCustomer().getTier()==2)
                .filter(u -> u.getDeliveryDate()
                        .isAfter(LocalDate.of(2021,2,1))&&u.getOrderDate().isBefore(LocalDate.of(2021,4,1)))
                .flatMap(r -> r.getProducts().stream())
                .collect(Collectors.toList());
    }

}
