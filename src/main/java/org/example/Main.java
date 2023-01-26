package org.example;

import org.example.enums.EnumMenu;
import org.example.model.Product;
import org.example.service.impl.OrderServiceImpl;
import org.example.service.impl.ProductServiceImpl;
import org.example.service.impl.Queries;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        OrderServiceImpl orderService = new OrderServiceImpl();
        ProductServiceImpl productService = new ProductServiceImpl();
        Queries queries = new Queries();

        orderService.inicialize();

        int des;

        do {
            des = Integer.parseInt(JOptionPane.showInputDialog(EnumMenu.MENU.getAccion()));
            switch (des){
                case 1:
                    System.out.println(queries.oneQuerie().get(0).getName());
                    for (Product product:queries.oneQuerie()){
                        System.out.println(product.toString());
                    }
                    break;
                case 2:
                    System.out.println(queries.twoQuerie().get(0).getCustomer().getName());
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }

        }while (des!=0);
    }
}