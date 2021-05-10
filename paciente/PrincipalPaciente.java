package exercicio.paciente;

public class PrincipalPaciente {
	
	public static void main(String[] args) {
		
		Paciente paci = new Paciente();
		
		paci.setNome("Patrick");
		paci.setEndereco("Rua Alameda flores,230");
		paci.setRg("72.456.245-9");
		paci.setEspecialidade("Clinica Geral");
		
		paci.Exibir();
		System.out.println("\nNome: " + paci.getNome());
		System.out.println("Endereço: " + paci.getEndereco());
		System.out.println("RG: " + paci.getRg());
		System.out.println("Especialidade: " + paci.getEspecialidade());
		
		
		paci.setNome("Luana");
		paci.setEndereco("Rua Minas Gerais,800");
		paci.setRg("50.540.245-5");
		paci.setEspecialidade("Ginecologia");
		
		
		System.out.println("\nNome: " + paci.getNome());
		System.out.println("Endereço: " + paci.getEndereco());
		System.out.println("RG: " + paci.getRg());
		System.out.println("Especialidade: " + paci.getEspecialidade());
		
		
	}
}
