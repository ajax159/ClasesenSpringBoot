package com.clasesylombok.modulo1.Models;

import java.text.SimpleDateFormat;
import java.util.*;
import lombok.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
public class Cliente {

    private String Name;
    private String Email;
    private Date BirthDate;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Cliente(String Name, String Email, Date BirthDate) {
        this.Name = Name;
        this.Email = Email;
        this.BirthDate = BirthDate;
    }

    @Override
    public String toString() {
        return "Cliente: " + Name + " (" + sdf.format(BirthDate) + ") - " + Email;
    }
}
