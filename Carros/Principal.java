
public class Principal {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.potencia = 10;
		c1.nome = "Corola";
		c1.velocidade = 0;
		
		Carro c2 = new Carro();
		c2.potencia = 15;
		c2.nome = "Gol";
		c2.velocidade = 0;
		
		Carro c3 = new Carro();
		c3.potencia = 10;
		c3.nome = "Corola";
		c3.velocidade = 0;
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.frear();
		c2.acelerar();
		
		
		
		c1.imprimir();
		c2.imprimir();
		c3.imprimir();

	}

}
