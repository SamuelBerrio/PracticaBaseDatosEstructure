package org.example.enums;

public enum EnumMenu {
    MENU("1 - Obtener una lista de productos pertenecientes a la categoría “Libros” con\n" +
            "precio > 100 \n" +
            "2 - Obtener una lista de pedidos con productos pertenecientes a la categoría\n" +
            "“Bebé” \n" +
            "3 - Obtenga una lista de productos con categoría = \"Juguetes\" y luego aplique un\n" +
            "10% de descuento \n" +
            "4 - Obtenga una lista de productos pedidos por el cliente del nivel 2 entre el 01\n" +
            "de febrero de 2021 y el 01 de abril de 2021 \n" +
            "5 - Consigue los productos más baratos de la categoría “Libros” \n" +
            "0 - Salir");
    private String accion;
    public String getAccion(){return accion; }

    EnumMenu(String accion){this.accion=accion;}
}
