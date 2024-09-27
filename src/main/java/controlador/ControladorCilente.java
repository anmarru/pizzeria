package controlador;

import java.util.ArrayList;
import java.util.List;

import modelo.cliente.Cliente;
import modelo.producto.Producto;

public class ControladorCilente {
    
    private static Cliente cliente_Actual;
    private List<Cliente> listaClientes;
    private ControladorPedido controladorPedido;

    

    public ControladorCilente( ) {
        this.listaClientes =new ArrayList<>();

        /* listaClientes.add(new Cliente(1,"14525487w","andrea", "la paz 4","655489985" ,"a@gmail.com","1111"));
        listaClientes.add(new Cliente(2, "5246987u", "nicolay", "castillo 11", "689574123", "n@gmail.com", "0000")); */
        cliente_Actual=null;
    }


    public void agregarLieaPedido(Producto producto, int cantidad){

        if(cliente_Actual!=null){
            this.controladorPedido.agregarLineaPedido(producto, cantidad);
        }else{
            System.out.println("NO SE PUEDE AGREGAR PEDIDO");
        }
        
    }

    public void registrarCliente(int id, String dni, String nombre, String direccion, String telefono, String email,
    String password){
        boolean clienteExistente=false;

        for (Cliente cliente2 : listaClientes) {
            if(cliente2.getDni().equals(dni)){
                clienteExistente=true;
                break;
            }
        }
        if(!clienteExistente){
            listaClientes.add(new Cliente(id,dni,nombre, direccion, telefono, email, password));
            System.out.println("CLIENTE REGISTRADO ");
        }else{
            System.out.println("EL CLIENTE YA EXISTE ");
        }
        
    }

    public void autenticarCliente(String nombre, String password, String dni){
        
        for (Cliente cliente : listaClientes) {
            if(cliente.getDni().equals(dni)&& cliente.getNombre().equals(nombre)&& cliente.getPassword().equals(password)){
                cliente_Actual=cliente;
            }
        }

        if(cliente_Actual != null){
            System.out.println("AUTENCICACION EXITOSA ");
            controladorPedido= new ControladorPedido(cliente_Actual);
        }else{
            System.out.println("EL CLIENTE NO ESTA REGISTRADO O LA INFORMACION ES INCORRECTA");
        }
    }


    public static Cliente getCliente_Actual() {
        return cliente_Actual;
    }

    


}
