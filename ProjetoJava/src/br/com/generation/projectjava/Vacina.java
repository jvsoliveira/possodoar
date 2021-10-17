package br.com.generation.projectjava;

public class Vacina extends Doador {
	

	public void funcButantan(){
		System.out.println("Você tomou a vacina Coronavac? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] Não");
		int but = ler.nextInt();
		
		if(but == 1) {
			func48h();
		}
		if(but == 2) {
			funcAstrazeneca();
		}
	}
	
	public void func48h(){
		System.out.println("Passou 48h desde que você tomou a vacina? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] Não");
		int temp = ler.nextInt();
		
		if(temp == 1) {
			funcTransfusao();
		}
		if(temp == 2) {
			System.out.println("Não passou 48h desde que você tomou a vacina.Então você não esta apto a doar ainda...Tente após as 48h");
			System.exit(0);
		}
	}
	
	public void funcAstrazeneca(){
		System.out.println("Você tomou a vacina AstraZeneca? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] Não");
		int astra = ler.nextInt();
		
		if(astra == 1) {
			func7d();
		}
		if(astra == 2) {
			funcTransfusao();
		}
	}
	
	public void func7d(){
		System.out.println("Passou 7 dias desde que você tomou a vacina? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] Não");
		int tempo = ler.nextInt();
		
		if(tempo == 1) {
			funcTransfusao();
		}
		if(tempo == 2) {
			System.out.println("Não passou 7 dias desde que você tomou a vacina.Então você ão está apto a doar ainda...Tente após os 7");
			System.exit(0);
		}
	}
}


