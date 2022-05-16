package teste2;


public class Main {
	public static void main(String[] args) {
	
		//Instanciar a nossa Empresa
		Empresa javaReboques = new Empresa("Java Reboques Lda");
		
		//cria instâncias (2 carros e 2 barcos)
		Carro volvo = new Carro("001",742.7,2);
		Barco java = new Barco("002",9.6,2.8);
		Carro mercedes = new Carro("003",350.0);
		Barco javascript = new Barco("004",12.3);
		
		//associar os reboques criados à empresa
		javaReboques.compraReboque(volvo);
		javaReboques.compraReboque(java);
		javaReboques.compraReboque(mercedes);
		javaReboques.compraReboque(javascript);
		
		//obter o número total de reboques quea empresa tem
		System.out.println("A " + javaReboques.getId() + " tem " + javaReboques.getNumeroReboques() + " reboques");
		
		//colocar os reboques a trabalhar
		System.out.println("Todos os reboques devem trabalhar!");
		for(Reboque reb: javaReboques.getReboques()){ 	//for each: for(tipo/classe NomeDadoAgora : lista)
			System.out.println(reb.trabalhar());
			}
		//defenir que um deles está avariado e voltar a manda-los trabalhar, os preguiçosos! hehe
		mercedes.avariar();
		System.out.println("Atenção: um dos seus reboques avariou! Talvez seja boa ideia enviar outro reboque seu para o ir buscar...");
		System.out.println("Todos os reboques devem trabalhar!");
		for(Reboque reb: javaReboques.getReboques()){ 	//for each: for(tipo/classe NomeDadoAgora : lista)
			System.out.println(reb.trabalhar());
			}
		
		//obter o número de serviços de dois reboques (um avariado e um nao avariado)
		System.out.println("O reboque número " + volvo.getNumeroTransporte() + " já efetuou " + volvo.getNumeroServicos() + " serviços");
		System.out.println("O reboque número " + mercedes.getNumeroTransporte() + " já efetuou " + mercedes.getNumeroServicos() + " serviços");
		
	}
	
}