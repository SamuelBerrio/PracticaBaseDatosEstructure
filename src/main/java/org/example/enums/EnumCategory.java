package org.example.enums;

public enum EnumCategory {
    BEBE("Bebe"),JUGUETES("Juguetes"),LIBROS("Libros");
    private String accion;
    public String getAccion(){return accion; }

    EnumCategory(String accion){this.accion=accion;}
}
