package tarea2;
public class Tarea2 {


    public static void main(String[] args) {
        System.out.println("main");
    }
    
}

abstract class Bebida {
    private int num;
    public void setSerie(int serie){
        this.num=serie;
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
    public void setSerie(String serie){
        this.serie=serie;
    }
    public String getSerie() {
        return "Moneda de " + serie;
    }
    public void setValor(int valor){
        this.valor=valor;
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
    public String toString(){
        return "Moneda de $1500/n°Serie: "+getSerie();
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
    public String toString(){
        return "Moneda de $1000/n°Serie: "+getSerie();
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
    public String toString(){
        return "Moneda de $500/n°Serie: "+getSerie();
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
    public String toString(){
        return "Moneda de $100/n°Serie: "+getSerie();
    }
}



