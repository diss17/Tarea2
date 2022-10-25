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

    private int cantidadBebidas;
    private int precioBebidas;
    private int aux_Bebida;
    private Deposito CocaCola;
    private Deposito Sprite;
    private Deposito Fanta;
    private Moneda Pago;
    

    public Expendedor(int numBebidas, int valorBebidas) {
        cantidadBebidas = numBebidas;
        precioBebidas = valorBebidas;
        CocaCola = new Deposito();
        Sprite = new Deposito();
        Fanta = new Deposito();
      
        for (int i = 0; i < cantidadBebidas; i++) {
           Bebida aux_CocaCola= new CocaCola();
           Bebida aux_Sprite=new Sprite();
           Bebida aux_Fanta=new Fanta();
           
           CocaCola.addBebida(aux_CocaCola);
           Sprite.addBebida(aux_Sprite);
           Fanta.addBebida(aux_Fanta);
        }
    }

<<<<<<< HEAD
    public Bebida comprarBebida(Moneda m, int aux_b) {
        Pago=m;
        if(m!=null){ //por aqui agregar exception de pago incorrecto
            if(Pago.getValor()>=precioBebidas){
                aux_Bebida=Pago.getValor()-precioBebidas;
                switch (aux_b) {
=======
    public Bebida comprarBebida(Moneda m, int cual) {
        Pago=m;
        if(m!=null){ //por aqui agregar exception de pago incorrecto
            if(Pago.getValor()>=precio){
                cualquiera=Pago.getValor()-precio;
                switch (cual) {
>>>>>>> 08202dd10ef29a0d3e639a6305b5580a0c9ac561
                case 1:
                    return CocaCola.getBebida();
                case 2:
                    return Sprite.getBebida();
                case 3:
                    return Fanta.getBebida();
                default:
                    return null;
                }
            }else{
<<<<<<< HEAD
                aux_Bebida=Pago.getValor();//aqui agregar expection pago insuficiente
            }
        }else{
            aux_Bebida=0;
=======
                cualquiera=Pago.getValor();//aqui agregar expection pago insuficiente
            }
        }else{
            cualquiera=0;
>>>>>>> 08202dd10ef29a0d3e639a6305b5580a0c9ac561
            return null;
        }
        return null;
    }

    public Moneda getVuelto() {
        if (aux_Bebida == 0) {
            Pago = null;
            return Pago;
        } else {
<<<<<<< HEAD
            while(aux_Bebida!=0){
            aux_Bebida = aux_Bebida - 100;
=======
            while(cualquiera!=0){
            cualquiera = cualquiera - 100;
>>>>>>> 08202dd10ef29a0d3e639a6305b5580a0c9ac561
            return (new Moneda100());
            }
        }
    }

    public int vueltito() {
<<<<<<< HEAD
        int resp = aux_Bebida;
=======
        int resp = cualquiera;
>>>>>>> 08202dd10ef29a0d3e639a6305b5580a0c9ac561
        return (resp);
    }
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
    public class NoHayBebidaException extends Exception{

    public NoHayBebidaException(String errorMessage) {
        super(errorMessage);
    }
}
    public class PagoIncorrectoException extends Exception{

    public PagoIncorrectoException(String errorMessage) {
        super(errorMessage);

    }
}
    public class PagoInsuficienteException extends Exception{

    public PagoInsuficienteException(String errorMessage) {
        super(errorMessage);

    }
}