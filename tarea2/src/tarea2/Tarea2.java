package tarea2;

import java.util.ArrayList;

public class Tarea2 {

    public static void main(String[] args) {
        System.out.println("main");
    }

}

abstract class Bebida {

    private int num;

    public void setSerie(int serie) {
        this.num = serie;
    }

    public int getSerie() {
        return num;
    }

    public String Beber() {
        return "Bebiendo: ";
    }
}

class Sprite extends Bebida {

    public Sprite() {
        super();
    }

    @Override
    public String Beber() {
        return super.Beber() + "Sprite";
    }

}

class CocaCola extends Bebida {

    public CocaCola() {
        super();
    }

    @Override
    public String Beber() {
        return super.Beber() + "Cocacola";
    }
}

class Fanta extends Bebida {

    public Fanta() {
        super();
    }

    @Override
    public String Beber() {
        return super.Beber() + "Fanta";
    }
}

//Esta bien agregar el toString como lo hice en cada clase de tipo Moneda?
abstract class Moneda {

    public int valor;
    public String serie;

    public Moneda() {
        super();
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSerie() {
        return "Moneda de " + serie;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}

//Clase moneda de 1500.
class Moneda1500 extends Moneda {

    public Moneda1500() {
        super();
    }

    @Override
    public String getSerie() {
        return super.getSerie() + "1500";
    }

    @Override
    public int getValor() {
        valor = 1500;
        return super.getValor();
    }

    @Override
    public String toString() {
        return "Moneda de $1500/n°Serie: " + getSerie();
    }
}

//Clase moneda 1000.
class Moneda1000 extends Moneda {

    public Moneda1000() {
        super();
    }

    @Override
    public String getSerie() {
        return super.getSerie() + "1000";
    }

    @Override
    public int getValor() {
        valor = 1000;
        return super.getValor();
    }

    @Override
    public String toString() {
        return "Moneda de $1000/n°Serie: " + getSerie();
    }
}

//Clase moneda 500.
class Moneda500 extends Moneda {

    public Moneda500() {
        super();
    }

    @Override
    public String getSerie() {
        return super.getSerie() + "500";
    }

    @Override
    public int getValor() {
        valor = 500;
        return super.getValor();
    }

    @Override
    public String toString() {
        return "Moneda de $500/n°Serie: " + getSerie();
    }
}

//Clase moneda 100.
class Moneda100 extends Moneda {

    public Moneda100() {
        super();
    }

    @Override
    public String getSerie() {
        return super.getSerie() + "100";
    }

    @Override
    public int getValor() {
        valor = 100;
        return super.getValor();
    }

    @Override
    public String toString() {
        return "Moneda de $100/n°Serie: " + getSerie();
    }
}

class Expendedor {

    private int cantidad;
    private int precio;
    private int cualquiera;
    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private Moneda Pago;

    public Expendedor(int numBebidas, int precioBebidas) {
        cantidad = numBebidas;
        precio = precioBebidas;
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        for (int i = 0; i < cantidad; i++) {
            coca.addBebida(new CocaCola(i + 100));
            sprite.addBebida(new Sprite(i + 200));
            fanta.addBebida(new Fanta(i + 300));
        }
    }

    public Bebida comprarBebida(Moneda m, int cual) {
        Pago = m;
        //Verificar sentencia cuando se intente comprar con una moneda de tipo null
        //(Pago incorrecto exception)
        if (Pago.getValor() > precio) {
            cualquiera = Pago.getValor() - precio;
            switch (cual) {
                case 1:
                    return coca.getBebida();
                case 2:
                    return sprite.getBebida();
                case 3:
                    return fanta.getBebida();
                default:
                    return null;
            }
        } else {
            return null;
        }
    }

    public Moneda getVuelto() {
        if (cualquiera == 0) {
            Pago = null;
            return Pago;
        } else {
            cualquiera = cualquiera - 100;
            return (new Moneda100());
        }
    }

    public int vueltito() {
        int resp = Pago.getValor() - precio;
        return (resp);
    }

    /*    public void ValidarBebida() {
        ControlExceptions h = new ControlExceptions();
        if (cantidad <= 0) {
            try {
                h.validarBebida();
            } catch (NoHayBebidaException b) {
                System.out.println("Error: " + b.getMessage());
            }
        }
    }
}*/
    class Deposito {

        private ArrayList gaseosa;

        public Deposito() {
            gaseosa = new ArrayList();
        }

        public void addBebida(Bebida num) {
            gaseosa.add(num);
        }

        public Bebida getBebida() {
            if (gaseosa.size() <= 0) {
                return null;
            } else {
                Bebida b = (Bebida) gaseosa.remove(0);
                return b;
            }
        }
    }
    class Comprador {

    private int cantidad;
    private String tipoBebida;

    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        Bebida aux = exp.comprarBebida(m, cualBebida);
        ControlExceptions h = new ControlExceptions();
        if (aux == null) {
            cantidad = m.getValor();
            try {
                h.validarBebida();
            } catch (NoHayBebidaException b) {
                System.out.println("Error: " + b.getMessage());
            }
        } else {
            tipoBebida = aux.Beber();
            cantidad = exp.vueltito();
        }

    }
    public int cuantoVuelto() {
        return (cantidad);
    }

    public String queBebiste() {
        return (tipoBebida);
    }

}

