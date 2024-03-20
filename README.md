
# Clases y Modelos en Springboot

Leer datos de un pedido con N articulos (N suministrador por el usuario).
Luego, muestre un resumen del pedido como se muestra en el ejemplo.
Nota: La hora del pedido debe ser la hora del sistema.
Nota 2: Los estados de la orden deben ser ingresados como numeros enteros.




## Diagrama

![App Screenshot](https://camo.githubusercontent.com/46538169ae0cef01fee2c9dde6f08160449438ca8dd81afccf7724582a23b35c/68747470733a2f2f692e696d6775722e636f6d2f684458744976362e706e67)


## Datos ingresados por el usuario

```javascript
Datos de cliente: 
Nombre: AXEL
Email: GMOD
Fecha de Nacimiento(DD/MM/YYYY): 26/02/1996
Detalle de orden:
Estado 2
¿Cuantos productos se venderan? 1
Producto #1 :
Nombre de Producto TV
Precio de producto 100
Cantidad 4
```


## Resultado esperado

```bash
    RESUMEN DE ORDEN:
    Fecha: 20/03/2024 15:23:02
    Estado de Orden: SHIPPED
    Cliente: AXEL (26/02/1996) - GMOD
    Productos:
    TV, Cantidad: 4, Subtotal: $400.00
    Total: $400.0
```

