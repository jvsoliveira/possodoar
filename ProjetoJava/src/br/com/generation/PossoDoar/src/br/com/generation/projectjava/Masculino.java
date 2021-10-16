package br.com.generation.projectjava;

public class Masculino extends Doador{
	
	public void funcMasc(){
		System.out.println("Doou sangue nos ultimos 60 dias? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] Não");
		int dias = ler.nextInt();
		
		if(dias == 1) {
			System.out.println("Você não pode doar ainda.");
			System.exit(0);
		}
		if(dias == 2) {
			func50();
		}
	}
}