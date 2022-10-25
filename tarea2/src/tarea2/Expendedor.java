package tarea2;

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
            CocaCola.addBebida(new CocaCola(i + 100));
            Sprite.addBebida(new Sprite(i + 200));
            Fanta.addBebida(new Fanta(i + 300));
        }
    }

    public Bebida comprarBebida(Moneda m, int aux_b) {
        Pago = m;
        if (Pago != null) {
            if (Pago.getValor() >= precioBebidas) {
                aux_Bebida = Pago.getValor() - precioBebidas;
                switch (aux_b) {
                    case 1:
                        return CocaCola.getBebida();
                    case 2:
                        return Sprite.getBebida();
                    case 3:
                        return Fanta.getBebida();
                    default:
                        return null;
                }
            } else {
                aux_Bebida = Pago.getValor();
            }
        } else {
            aux_Bebida = 0;
            return null;
        }
        return null;
    }

    public Moneda getVuelto() {
        if (aux_Bebida == 0) {
            Pago = null;
            return Pago;
        } else {

            while (aux_Bebida != 0) {
                aux_Bebida = aux_Bebida - 100;
            }
            return (new Moneda100());
        }
    }

    public int Vuelto() {
        int vuelto = aux_Bebida;
        return (vuelto);
    }

    public void ValidarBebida() {
        ControlExceptions h = new ControlExceptions();
        if (cantidadBebidas <= 0) {
            try {
                h.validarBebida();
            } catch (NoHayBebidaException b) {
                System.out.println("Error: " + b.getMessage());
            }
        }
    }
}
