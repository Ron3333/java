package ventas;
//import ventas.Producto;
public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Venta ***");
        var camisa1 = new Producto("Camisa", 50.00);
        System.out.println(camisa1);
        var pantalon1 = new Producto("Pantalon",100.00);
        System.out.println(pantalon1);


        // Primer orden
        var orden1 = new Orden();
        orden1.agregarProducto(camisa1);
        orden1.agregarProducto(pantalon1);
        orden1.mostrarOrden();

        // Segunda orden
        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("Calcetines", 20.00));
        orden2.agregarProducto(camisa1);
        orden2.mostrarOrden();



    }
}
