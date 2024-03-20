package com.clasesylombok.modulo1.Models;

import java.text.SimpleDateFormat;
import java.util.*;

import lombok.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
public class Orden {

    private Date Moment;
    private OrderStatus Status;
    private Cliente Client;
    private List<OrdenItem> items = new ArrayList<>();
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Orden(Date Moment, OrderStatus Status, Cliente Client) {
        this.Moment = Moment;
        this.Status = Status;
        this.Client = Client;
    }

    public void addItem(OrdenItem item) {
        items.add(item);
    }

    public void removeItem(OrdenItem item) {
        items.remove(item);
    }

    public Double total() {
        Double sum = 0d;
        for (OrdenItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        var ax = new StringBuilder();
        ax.append("RESUMEN DE ORDEN:\n");
        ax.append("Fecha: " + sdf.format(Moment) + "\n");
        ax.append("Estado de Orden: " + Status);
        ax.append("\n" + Client);
        ax.append("\nProductos:\n");
        for (OrdenItem item : items) {
            ax.append(item);
        }
        ax.append("Total: $" + total());
        return ax.toString();
    }

}
