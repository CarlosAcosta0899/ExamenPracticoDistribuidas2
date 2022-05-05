package pe.upeu.exabanc;

public class HiloCliente implements Runnable{
    Cuenta cuenta;
    int cantidad;

    public HiloCliente(Cuenta cuenta, int cantidad) {
        this.cuenta = cuenta;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
       
        for (int i=0; i<100; i++){
            cuenta.hacerMovimiento(cantidad);
        }
    }
}
