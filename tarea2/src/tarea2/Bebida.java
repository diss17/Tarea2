package tarea2;

abstract class Bebida {

    private int num;

    public Bebida(int serie) {
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

    public Sprite(int s) {
        super(s);
    }

    @Override
    public String Beber() {
        return super.Beber() + "Sprite";
    }

}

class CocaCola extends Bebida {

    public CocaCola(int c) {
        super(c);
    }

    @Override
    public String Beber() {
        return super.Beber() + "Cocacola";
    }
}

class Fanta extends Bebida {

    public Fanta(int f) {
        super(f);
    }

    @Override
    public String Beber() {
        return super.Beber() + "Fanta";
    }
}
