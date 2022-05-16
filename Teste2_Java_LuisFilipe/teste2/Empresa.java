package teste2;

import java.util.List;
import java.util.ArrayList;

public class Empresa implements EmpresaInterface{
	//atributos : lista trabalhadores, lista divisoes (tudo c/ letra minuscula, p/ não confundir com classes)
			private String id;
			private List<Reboque> reboques;

		//Construtores
		//Construtor1: todos os atributos
			public Empresa(String aId) {
				id = aId;
				reboques = new ArrayList<Reboque>();
			}
				//metodos  (ver na Empresa Interface)	
			public int getNumeroReboques() {
				int total=0;
				for(Reboque reb: reboques){ 	//for each: for(tipo/classe NomeDadoAgora : lista)
					total++;
					}
				return total;
			}
			
			public int getNumeroReboquesAvariados() {
				int total=0;
				for(Reboque reb: reboques){ 	//for each: for(tipo/classe NomeDadoAgora : lista)
					if(reb.avariado){
					total++;
					}
				}
				return total;
			}
			
			//método adicionado para facilitar o Main
			public void compraReboque(Reboque aReboque){
				reboques.add(aReboque);
			}
			
		//operações
		//definir gets
			public String getId() {
				return id;
			}
			
			public List<Reboque> getReboques() {
				return reboques;
			}
				
		//definir sets
			public void setId(String aId) {
				id = aId;
			}

			public void setReboques(List<Reboque> aReboques) {
				this.reboques = aReboques;
			}

}
