package br.com.generation.projectjava;

public class Vacina extends Doador {
	

	public void funcButantan(){
		System.out.println("Voc� tomou a vacina Coronavac da Sinovac ou do Butantan? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		int but = ler.nextInt();
		
		if(but == 1) {
			func48h();
		}
		if(but == 2) {
			funcAstrazeneca();
		}
	}
	
	public void func48h(){
		System.out.println("Passou passou 48h desde que voc� tomou a vacina? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		int temp = ler.nextInt();
		
		if(temp == 1) {
			funcTransfusao();
		}
		if(temp == 2) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
	}
	
	public void funcAstrazeneca(){
		System.out.println("Voc� tomou a vacina AstraZeneca da Sinovac ou do Butantan? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		int astra = ler.nextInt();
		
		if(astra == 1) {
			func7d();
		}
		if(astra == 2) {
			funcTransfusao();
		}
	}
	
	public void func7d(){
		System.out.println("Passou passou 7 dias desde que voc� tomou a vacina? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		int tempo = ler.nextInt();
		
		if(tempo == 1) {
			funcTransfusao();
		}
		if(tempo == 2) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
	}
}


