package teste2;

public class Carro extends Reboque{
	//atributos
		private int numeroLugaresSentados;
		private double pesoMaximoRebocavel;

	//Construtores
	//Construtor1: herda construtor pai (super) + peso maximo(obrigatorio)
		public Carro(String aNumeroTransporte,double aPesoMaximoRebocavel) {
			super(aNumeroTransporte); //super chama construtor da classe pai p/ herdar atributos
			pesoMaximoRebocavel = aPesoMaximoRebocavel;
		}
	//Construtor2: herda construtor pai (super) + peso maximo e numero lugares
		public Carro(String aNumeroTransporte,double aPesoMaximoRebocavel,int aNumeroLugaresSentados) {
			super(aNumeroTransporte); //super chama construtor da classe pai p/ herdar atributos
			pesoMaximoRebocavel = aPesoMaximoRebocavel;
			numeroLugaresSentados = aNumeroLugaresSentados;
		}
			
	//métodos (override trabalhar do Reboque)
		public String trabalhar(){
			if (avariado){
				return "Eu, carro número " + numeroTransporte + " estou avariado, não poderei trabalhar";
			}
			else{
				numeroServicos++;
				return "Eu, carro número " + numeroTransporte + " estou a trabalhar";
			}
		}
		
	//operações
	//definir gets
		public int getNumeroLugaresSentados(){
			return numeroLugaresSentados;
		}
		
		public double getPesoMaximoRebocavel(){
			return pesoMaximoRebocavel;
		}
	//definir sets
		public void setNumeroLugaresSentados(int aNumeroLugaresSentados){
			numeroLugaresSentados = aNumeroLugaresSentados;
		}
		
		public void setPesoMaximoRebocavel(double aPesoMaximoRebocavel){
			pesoMaximoRebocavel = aPesoMaximoRebocavel;
		}
}
