package tarea2;

class Comprador {

    private int cantidad;
    private String tipoBebida;

    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        Bebida aux;
        try {
            aux = exp.comprarBebida(m, cualBebida);
            cantidad = exp.Vuelto();
        } catch (PagoIncorrectoException b) {
            aux = null;
            System.out.println(b.getMessage());
        } catch (PagoInsuficienteException a) {
            aux = null;
            cantidad = exp.Vuelto();
            System.out.println(a.getMessage());
        } catch (NoHayBebidaException z) {
            aux = null;
            cantidad = exp.Vuelto();
            System.out.println(z.getMessage());
        }
        if (aux != null) {
            tipoBebida = aux.Beber();
        }
    }

    public int cuantoVuelto() {
        return (cantidad);
    }

    public String queBebiste() {
        return (tipoBebida);
    }

}
