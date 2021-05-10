package exercicio.funcionario;

public class PrincipalFuncionario {
	
	 public static void main(String[] args) {
		 
		Funcionario funci = new Funcionario();
		
		funci.setNome("Carolina Macedo");
		funci.setCpf("451.873.357-85");
		funci.setDepartamento("Financeiro");
		funci.setSalario(1590.99);
		funci.setTelefone("4645-2842");
		
		System.out.println("DADOS DOS FUNCIONÁRIOS");
		System.out.println("\nNome: " + funci.getNome());
		System.out.println("CPF: " + funci.getCpf());
		System.out.println("Departamento: " + funci.getDepartamento());
		System.out.println("Salário: " + funci.getSalario());
		System.out.println("Telefone: " + funci.getTelefone());
		funci.AumentoSalario(100);
		System.out.println("Salário com aumento anual de R$100,00 : " + funci.getSalario());
		
		funci.setNome("Victória Alves");
		funci.setCpf("555.666.777-10");
		funci.setDepartamento("TI");
		funci.setSalario(4500.0);
		funci.setTelefone("4645-2842");
		
		System.out.println("\nNome: " + funci.getNome());
		System.out.println("CPF: " + funci.getCpf());
		System.out.println("Departamento: " + funci.getDepartamento());
		System.out.println("Salário: " + funci.getSalario());
		System.out.println("Telefone: " + funci.getTelefone());
		System.out.println("Salário com aumento anual de R$100,00 : " + funci.getSalario());
		
		funci.AumentoSalario(100);
	}
}
