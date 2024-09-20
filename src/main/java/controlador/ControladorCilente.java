package controlador;

import java.util.ArrayList;
import java.util.List;

import modelo.cliente.Cliente;
import modelo.producto.Producto;

public class ControladorCilente {
    

    private List<Cliente> listaClientes;

    

    public ControladorCilente( ) {
        this.listaClientes =new ArrayList<>();

        listaClientes.add(new Cliente(1,"14525487w","andrea", "la paz 4","655489985" ,"a@gmail.com","1111"));
        listaClientes.add(new Cliente(2, "5246987u", "nicolay", "castillo 11", "689574123", "n@gmail.com", "0000"));
    }


    public void agregarLieaPedido(Producto producto, int cantidad){

        ControladorCilente controladoPedido =new ControladorCilente();
        controladoPedido.agregarLieaPedido(producto, cantidad);
        
    }

    public void registrarCliente(Cliente cliente){
        listaClientes.add(cliente);
    }

    public Cliente autenticarCliente(String email, String password){
        return listaClientes.stream().filter(cliente ->cliente.getEmail().equals(email) && cliente.getPassword().equals(password))
        .findFirst().orElse(null);
    }

    


}
