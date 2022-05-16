package teste2;

public class Reboque {
	//atributos
		protected String numeroTransporte;
		protected int numeroServicos;
		protected boolean avariado;

		//Construtores
		//Construtor1 apenas atributos obrigat�rios
		public Reboque(String aNumeroTransporte) {
			numeroTransporte = aNumeroTransporte;
			numeroServicos = 0;
			avariado = false;
		}
		
		//m�todos
		public String trabalhar(){
			if (avariado){
				return "Eu, reboque n�mero " + numeroTransporte + " estou avariado, n�o poderei trabalhar";
			}
			else{
				numeroServicos++;
				return "Eu, reboque n�mero " + numeroTransporte + " estou a trabalhar";
			}
		}
		
		public void avariar(){
			avariado=true;
		}
		
		//opera��es
		//definir gets
		public String getNumeroTransporte() {
			return numeroTransporte;
		}

		public int getNumeroServicos() {
			return numeroServicos;
		}
		
		public boolean isAvariado() {
			return avariado;
		}
		
		//definir sets
		public void setNumeroTransporte(String aNumeroTransporte) {
			this.numeroTransporte = aNumeroTransporte;
		}
		
		public void setNumeroServicos(int aNumeroServicos) {
			this.numeroServicos = aNumeroServicos;
		}
		
		public void setAvariado(boolean aAvariado) {
			this.avariado = aAvariado;
		}
}
