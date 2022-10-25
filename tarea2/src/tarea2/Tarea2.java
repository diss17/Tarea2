package tarea2;

public class Tarea2 {

    public static void main(String[] args) {

        //Test NoHayBebidaException 
        Expendedor e = new Expendedor(1, 2000);
        Moneda m = new Moneda1500();
        Comprador c = new Comprador(m, 1, e);
        System.out.println("Vuelto: " + c.cuantoVuelto());
        System.out.println(c.queBebiste());
        System.out.println();

        //Test sistema de vuelto
        Expendedor h = new Expendedor(1, 1000);
        Moneda a = new Moneda1500();
        Comprador z = new Comprador(a, 1, h);
        System.out.println("Vuelto: " + z.cuantoVuelto());
        System.out.println();
    }

}
