package exercicio.aviao;

public class PrincipalAviao {

	public static void main(String[] args) {

		Aviao aviao = new Aviao();

		aviao.setModelo("Sikorsky Llya Muromets");
		aviao.setVelocidade(110);
		aviao.setDistanciaKM(1000);
		aviao.setQtdLugraes("16");

		System.out.println("DADOS DOS AVIÕES");
		System.out.println("\nModelo: " + aviao.getModelo());
		System.out.println("Velocidade em km/h: " + aviao.getVelocidade());
		System.out.println("Distância permitida pra viagem (km): " + aviao.getQtdLugraes());
		System.out.println("Velocidade : " + aviao.getVelocidade());

		aviao.setModelo("Airbus 380");
		aviao.setVelocidade(1185);
		aviao.setDistanciaKM(15200);
		aviao.setQtdLugraes("850");

		System.out.println("\nModelo: " + aviao.getModelo());
		System.out.println("Velocidade em km/h: " + aviao.getVelocidade());
		System.out.println("Distância permitida pra viagem (km): " + aviao.getQtdLugraes());
		System.out.println("Velocidade : " + aviao.getVelocidade());

		aviao.checarCombustivel();
		aviao.decolar();
		aviao.pousar();
		
		aviao.acelerar(50);
		System.out.println("Velocidade Acelerada : " + aviao.getVelocidade());
		
		aviao.freiar(20);
		System.out.println("Velocidade reduzida: " + aviao.getVelocidade());
	}
}
