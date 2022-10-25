package tarea2;

class Comprador {

    private int cantidad;
    private String tipoBebida;

    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        Bebida aux = exp.comprarBebida(m, cualBebida);
        if (aux == null) {
            exp.ValidarBebida();
            cantidad = exp.Vuelto();
        } else {
            cantidad = exp.Vuelto();
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
