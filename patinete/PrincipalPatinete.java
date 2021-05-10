package exercicio.patinete;

public class PrincipalPatinete {
	
	public static void main(String[] args) {
		
		Patinete pati =  new Patinete();
		
		pati.setTecnologia("Manual");
		pati.setTipo("INFANTIL");
		pati.setMarca("Skatenet Kid");
		pati.setModelo("Brink+");
		pati.setPreco(260.99);
		
		pati.exibirTitulo();
		System.out.println("\nTecnologia (Manual ou Eletrico): " + pati.getTecnologia());
		System.out.println("Tipo (Infantil ou Adulto): " + pati.getTipo());
		System.out.println("Marca: " + pati.getMarca());
		System.out.println("Modelo: " + pati.getModelo());
		System.out.println("Preço: " + pati.getPreco());
		
		pati.setTecnologia("Eletrico");
		pati.setTipo("ADULTO");
		pati.setMarca("Xiaomi");
		pati.setModelo("M365");
		pati.setPreco(5000.00);
		
		System.out.println("\nTecnologia (Manual ou Eletrico): " + pati.getTecnologia());
		System.out.println("Tipo (Infantil ou Adulto): " + pati.getTipo());
		System.out.println("Marca: " + pati.getMarca());
		System.out.println("Modelo: " + pati.getModelo());
		System.out.println("Preço: " + pati.getPreco());
		
		
		
		
		
		
		
		
		
	}
}
