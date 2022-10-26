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
            CocaCola.addBebida(new CocaCola(i));
            Sprite.addBebida(new Sprite(i));
            Fanta.addBebida(new Fanta(i));
        }
    }

    public Bebida comprarBebida(Moneda m, int aux_b) throws PagoIncorrectoException, PagoInsuficienteException, NoHayBebidaException {
        Pago = m;
        if (Pago != null) {
            if (Pago.getValor() >= precioBebidas) {
                aux_Bebida = Pago.getValor() - precioBebidas;
                switch (aux_b) {
                    case 1:
                        if (CocaCola.getBebida() == null) {
                            aux_Bebida = Pago.getValor();
                            throw new NoHayBebidaException("No hay bebidas disponibles");
                        } else {
                            
                            return CocaCola.getBebida();
                        }
                    case 2:
                        if (Sprite.getBebida() == null) {
                            aux_Bebida = Pago.getValor();
                            throw new NoHayBebidaException("No hay bebidas disponibles");
                        } else {
                            return CocaCola.getBebida();
                        }
                    case 3:
                        if (Fanta.getBebida() == null) {
                            aux_Bebida = Pago.getValor();
                            throw new NoHayBebidaException("No hay bebidas disponibles");
                        } else {
                            return CocaCola.getBebida();
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
