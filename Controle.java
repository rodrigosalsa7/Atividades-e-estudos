package controleremoto;

public class Controle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControleRemoto novoControle = new ControleRemoto();
		
		System.out.println("Chamando carro: " + novoControle.controlar("Carro"));
		
		System.out.println("chamando Avião: " + novoControle.controlar("Avião", true));
		
		System.out.println("Chamando Barco: " + novoControle.controlar("Barco", true, true));

	}

}
