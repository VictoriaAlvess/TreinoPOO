package exercicio.cliente;

public class PrincipalCliente {
	
	public static void main(String[] args) {
		
		Cliente cli = new Cliente();
		
		cli.setNome("Antonio");
		cli.setCpf("451.873.357-85");
		cli.setEmail("antonio21@gmail.com");
		cli.setTelefone("4645-2842");
		
		System.out.println("DADOS DOS CLIENTES");
		System.out.println("\nNome: " + cli.getNome());
		System.out.println("CPF: " + cli.getCpf());
		System.out.println("Email: " + cli.getEmail());
		System.out.println("Telefone: " + cli.getTelefone());
		
		cli.setNome("Joana");
		cli.setCpf("556.839.472-66");
		cli.setEmail("joanalinda@hotmail.com");
		cli.setTelefone("9 8124-3679");
		
		System.out.println("\nNome: " + cli.getNome());
		System.out.println("CPF: " + cli.getCpf());
		System.out.println("Email: " + cli.getEmail());
		System.out.println("Telefone: " + cli.getTelefone());
		
		cli.fazerPedido();
		cli.cadastro();
		cli.pagar();
	}
	
	
}
