package tarea2;

import java.util.ArrayList;

class Deposito {

    private ArrayList b;

    public Deposito() {
        b = new ArrayList();
    }

    public void addBebida(Bebida num) {
        b.add(num);
    }

    public Bebida getBebida() {
        if (b.size() <= 0) {
            return null;
        } else {
            Bebida a = (Bebida) b.remove(0);
            return a;
        }
    }
}
