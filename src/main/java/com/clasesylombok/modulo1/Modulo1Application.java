package com.clasesylombok.modulo1;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.clasesylombok.modulo1.Models.Cliente;
import com.clasesylombok.modulo1.Models.Orden;
import com.clasesylombok.modulo1.Models.OrdenItem;
import com.clasesylombok.modulo1.Models.OrderStatus;
import com.clasesylombok.modulo1.Models.Producto;

import lombok.var;

@SpringBootApplication
public class Modulo1Application {

	public static void main(String[] args) throws ParseException {
		// SpringApplication.run(Modulo1Application.class, args);
		var sdf = new SimpleDateFormat("dd/MM/yyyy");
		var sc = new Scanner(System.in);

		System.out.println("Datos de cliente: ");
		System.out.print("Nombre: ");
		String name = sc.next();
		sc.nextLine();

		System.out.print("Email: ");
		String email = sc.next();

		System.out.print("Fecha de Nacimiento(DD/MM/YYYY): ");
		String birthDate = sc.next();

		Date birthDate2 = sdf.parse(birthDate);

		Cliente c1 = new Cliente(name, email, birthDate2);

		System.out.println("Detalle de orden:");
		System.out.print("Estado ");
		OrderStatus status = OrderStatus.fromInteger(sc.nextInt());

		var moment = new Date();
		Orden order = new Orden(moment, status, c1);

		System.out.print("¿Cuantos productos se venderan? ");
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			System.out.println("Producto " + "#" + (i + 1) + " : ");
			System.out.print("Nombre de Producto ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Precio de producto ");
			Double productPrice = sc.nextDouble();
			System.out.print("Cantidad ");
			Integer quantity = sc.nextInt();
			var producto = new Producto(productName, productPrice);
			var it = new OrdenItem(quantity, productPrice, producto);
			order.addItem(it);
		}

		System.out.println(order);
		sc.close();
	}

}
