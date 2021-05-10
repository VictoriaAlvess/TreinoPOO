package exercicio.conta;

public class PrincipalContaBancaria {
	
	public static void main(String[] args) {
		
		ContaBancaria contBanco = new ContaBancaria();
		
		contBanco.setNome("Antonio");
		contBanco.setCpf("451.873.357-85");
		contBanco.setEmail("antonio21@gmail.com");
		contBanco.setTelefone("4645-2842");
		contBanco.setNumConta("123456");
		
		contBanco.Exibir();
		System.out.println("\nNome: " + contBanco.getNome());
		System.out.println("CPF: " + contBanco.getCpf());
		System.out.println("Email: " + contBanco.getEmail());
		System.out.println("Telefone: " + contBanco.getTelefone());
		System.out.println("Número da conta: " + contBanco.getNumConta());
		
		contBanco.setNome("Joana");
		contBanco.setCpf("556.839.472-66");
		contBanco.setEmail("joanalinda@hotmail.com");
		contBanco.setTelefone("9 8124-3679");
		contBanco.setNumConta("678910");
		
		System.out.println("\nNome: " + contBanco.getNome());
		System.out.println("CPF: " + contBanco.getCpf());
		System.out.println("Email: " + contBanco.getEmail());
		System.out.println("Telefone: " + contBanco.getTelefone());
		System.out.println("Número da conta: " + contBanco.getNumConta());
		
		
	}
	
}
