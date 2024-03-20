package com.clasesylombok.modulo1.Models;

import lombok.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
public class OrdenItem {

    private Integer Quantity;
    private Double Price;
    private Producto Product;

    public Double subTotal() {
        return Quantity * Price;
    }

    @Override
    public String toString() {
        var ax = new StringBuilder();
        ax.append(getProduct().getName());
        ax.append(", Cantidad: " + Quantity);
        ax.append(", Subtotal: $" + String.format("%.2f", subTotal()) + "\n");
        return ax.toString();
    }
}
