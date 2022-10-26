package tarea2;

public class Tarea2 {

    public static void main(String[] args) {

        //Test NoHayBebidaException 
        Expendedor e = new Expendedor(0, 500);
        Moneda m = new Moneda1500();
        Comprador c = new Comprador(m, 1, e);
        System.out.println("Vuelto: " + c.cuantoVuelto());
        System.out.println(c.queBebiste());
        System.out.println();

        //Test Exception de PAGOINSUFICIENTE
        Expendedor h = new Expendedor(1, 6000);
        Moneda a = new Moneda1000();
        Comprador z = new Comprador(a, 1, h);
        System.out.println("Vuelto: " + z.cuantoVuelto());
        System.out.println(z.queBebiste());
        System.out.println();

        //Test Exception de PAGO NULL
        Expendedor t = new Expendedor(1, 1000);
        Comprador j = new Comprador(null, 1, t);
        System.out.println("Vuelto: " + j.cuantoVuelto());
        System.out.println(j.queBebiste());
        System.out.println();

        //Test Sistema de VUELTO
        Expendedor v = new Expendedor(1, 600);
        Moneda b = new Moneda1500();
        Comprador y = new Comprador(b, 1, v);
        System.out.println("Vuelto: " + y.cuantoVuelto());
        System.out.println(y.queBebiste());
        System.out.println();
    }

}
