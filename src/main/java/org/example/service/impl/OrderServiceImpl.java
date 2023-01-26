package org.example.service.impl;

import org.example.enums.EnumStatus;
import org.example.model.Customer;
import org.example.model.Order;
import org.example.model.Product;
import org.example.service.OrderService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.example.enums.EnumCategory;

public class OrderServiceImpl implements OrderService {

    ProductServiceImpl productService = new ProductServiceImpl();

    CustomerServiceImpl customerService = new CustomerServiceImpl();

    List<Order> orderList = new ArrayList<>();


    public List<Order> getOrderList() {
        return orderList;
    }

    @Override
    public void inicialize() {

        productService.getProducts().add(new Product(1L,"ToyStory", EnumCategory.JUGUETES.getAccion(),100.0));
        productService.getProducts().add(new Product(2L,"Tetero", EnumCategory.BEBE.getAccion(), 40.0));
        productService.getProducts().add(new Product(3L,"El principito", EnumCategory.LIBROS.getAccion(),130.0));
        productService.getProducts().add(new Product(4L,"Volver al futuro", EnumCategory.LIBROS.getAccion(),50.0));
        productService.getProducts().add(new Product(5L,"Barbie", EnumCategory.JUGUETES.getAccion(), 20.0));

        productService.seeArray();

        customerService.getCustomersList().add(new Customer(1L,"Carlos",1));
        customerService.getCustomersList().add(new Customer(2L,"Juan",2));

        System.out.println(customerService.getCustomersList().get(0).getName());

        orderList.add(new Order(1L,
                EnumStatus.ON.name(),
                LocalDate.of(2021,2,2),
                LocalDate.of(2021,4,5),
                productService.getProducts().stream().filter(e -> e.getPrice() < 90.0).collect(Collectors.toList()),
                customerService.getCustomersList().get(0)));

        orderList.add(new Order(2L,
                EnumStatus.OFF.name(),
                LocalDate.of(2021,3,25),
                LocalDate.of(2021,6,16),
                productService.getProducts().stream().filter(e -> e.getPrice() > 45.0).collect(Collectors.toList()),
                customerService.getCustomersList().get(1)));

        System.out.println(orderList.get(1).getCustomer().getName());


    }

    public List<Product> getProductList(){
        return productService.getProducts();
    }
}
