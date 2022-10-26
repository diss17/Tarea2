package tarea2;

class Expendedor {

    private int cantidadBebidas;
    private int precioBebidas;
    private int aux_Bebida;
    private Deposito CocaCola;
    private Deposito Sprite;
    private Deposito Fanta;
    private Moneda Pago;
    private Bebida gaseosa;

    public Expendedor(int numBebidas, int valorBebidas) {
        cantidadBebidas = numBebidas;
        precioBebidas = valorBebidas;
        CocaCola = new Deposito();
        Sprite = new Deposito();
        Fanta = new Deposito();

        for (int i = 0; i < cantidadBebidas; i++) {
            CocaCola.addBebida(new CocaCola(i+100));
            Sprite.addBebida(new Sprite(i+200));
            Fanta.addBebida(new Fanta(i+300));
        }
    }

    public Bebida comprarBebida(Moneda m, int aux_b) throws PagoIncorrectoException, PagoInsuficienteException, NoHayBebidaException {
        Pago = m;
        if (Pago != null) {
            if (Pago.getValor() >= precioBebidas) {
                aux_Bebida = Pago.getValor() - precioBebidas;
                switch (aux_b) {
                    case 1:
                        Bebida aux2=CocaCola.getBebida();
                        if (aux2 == null) {
                            aux_Bebida = Pago.getValor();
                            throw new NoHayBebidaException("No hay bebidas disponibles");
                        } else {
                            return aux2;
                        }
                    case 2:
                        Bebida aux3=Sprite.getBebida();
                        if (aux3 == null) {
                            aux_Bebida = Pago.getValor();
                            throw new NoHayBebidaException("No hay bebidas disponibles");
                        } else {
                            return aux3;
                        }
                    case 3:
                        Bebida aux4=Fanta.getBebida();
                        if (Fanta.getBebida() == null) {
                            aux_Bebida = Pago.getValor();
                            throw new NoHayBebidaException("No hay bebidas disponibles");
                        } else {
                            return aux4;
                        }
                    default:
                        return null;
                }
            } else {
                aux_Bebida = Pago.getValor();
                throw new PagoInsuficienteException("Pago Insuficiente");
            }
        } else {
            throw new PagoIncorrectoException("Metodo pago invalido");
        }
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

}
