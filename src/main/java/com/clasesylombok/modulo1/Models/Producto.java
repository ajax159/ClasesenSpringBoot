package com.clasesylombok.modulo1.Models;

import lombok.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
public class Producto {

    private String Name;
    private Double Price;

}
