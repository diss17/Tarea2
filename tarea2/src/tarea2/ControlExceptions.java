package tarea2;

public class ControlExceptions {

    public ControlExceptions() {

    }

    public void validarBebida() throws NoHayBebidaException {
        throw new NoHayBebidaException("No hay bebidas disponibles");
    }

    public void validarPagoInsuficiente() throws PagoInsuficienteException {
        throw new PagoInsuficienteException("Pago Insuficiente");
    }

    public void validarPagoIncorrecto() throws PagoIncorrectoException {
        throw new PagoIncorrectoException("Metodo pago invalido");
    }
}
