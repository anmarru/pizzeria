package modelo.pedido;

public class PagarEfectivo implements Pagable{

    @Override
    public void pagar(double cantidad) {
        System.out.println("PAGO EN EFECTIVO...");
        
    }
    
}
