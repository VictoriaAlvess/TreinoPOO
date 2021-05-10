package exercicio.eletronico;

public class PrincipalEletronicos {
	
	public static void main(String[] args) {
		
		ProdutoEletronico eletro = new ProdutoEletronico();
		
		eletro.setTipo("Celular");
		eletro.setMarca("Samsung");
		eletro.setModelo("Galaxy A51");
		eletro.setPreco(1799.90);
		eletro.setAnosGarantia("1 ano");
		
		System.out.println("DADOS DOS ELETRÔNICOS");
		System.out.println("\nTipo: " + eletro.getTipo());
		System.out.println("Marca: " + eletro.getMarca());
		System.out.println("Modelo: " + eletro.getModelo());
		System.out.println("Preço: " + eletro.getPreco());
		System.out.println("Anos de Garantia: " + eletro.getAnosGarantia());
		
		eletro.setTipo("Notebook");
		eletro.setMarca("Dell");
		eletro.setModelo("Gamer G3 i5");
		eletro.setPreco(5579.10);
		eletro.setAnosGarantia("2 anos");
		
		System.out.println("\nTipo: " + eletro.getTipo());
		System.out.println("Marca: " + eletro.getMarca());
		System.out.println("Modelo: " + eletro.getModelo());
		System.out.println("Preço: " + eletro.getPreco());
		System.out.println("Anos de Garantia: " + eletro.getAnosGarantia());
	}
}
