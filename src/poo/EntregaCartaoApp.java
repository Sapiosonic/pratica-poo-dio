package poo;

import poo.model.Cliente;
import poo.model.Endereco;

public class EntregaCartaoApp {
	
	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		// dados do endereço
		
		Cliente cliente = new Cliente();
		//dados do cliente
		
		cliente.enderecos.add(endereco);
		
	}

}
