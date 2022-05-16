package teste2;

public class Barco extends Reboque{
	//atributos
			private double comprimento;
			private double largura;

		//Construtores
		//Construtor1: herda construtor pai (super) + comprimento(obrigatorio)
			public Barco(String aNumeroTransporte,double aComprimento) {
				super(aNumeroTransporte); //super chama construtor da classe pai p/ herdar atributos
				comprimento = aComprimento;
			}
		//Construtor2: herda construtor pai (super) + comprimento e largura
			public Barco(String aNumeroTransporte,double aComprimento,double aLargura) {
				super(aNumeroTransporte); //super chama construtor da classe pai p/ herdar atributos
				comprimento = aComprimento;
				largura = aLargura;
			}
				
		//m�todos (override trabalhar do Reboque)
			public String trabalhar(){
				if (avariado){
					return "Eu, barco n�mero " + numeroTransporte + " estou avariado, n�o poderei trabalhar";
				}
				else{
					numeroServicos++;
					return "Eu, barco n�mero " + numeroTransporte + " estou a trabalhar";
				}
			}
			
		//opera��es
		//definir gets
			public double getComprimento(){
				return comprimento;
			}
			
			public double getLargura(){
				return largura;
			}
		//definir sets
			public void setComprimento(double aComprimento){
				comprimento = aComprimento;
			}
			
			public void setLargura(double aLargura){
				largura = aLargura;
			}
}
