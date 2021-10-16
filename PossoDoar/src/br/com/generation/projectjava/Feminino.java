package br.com.generation.projectjava;

public class Feminino extends Doador{
	
	public void funcFem(){
		
		System.out.println("Doou sangue nos ultimos 90 dias? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] Não");
		int dias = ler.nextInt();
		
		if(dias == 1) {
			System.out.println("Você não pode doar ainda.");
			System.exit(0);
		}
		if(dias == 2) {
			funcGravida();
		}
	}
	
	public void funcGravida(){
		System.out.println("Você está grávida? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] Não");
		int grav = ler.nextInt();
		
		if(grav == 1) {
			System.out.println("Você não pode doar ainda.");
			System.exit(0);
		}
		if(grav == 2) {
			funcParto();
		}
	}
	
	public void funcParto(){
		System.out.println("Você realizou parto normal nos últimos 90 dias? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] Não");
		int part = ler.nextInt();
		
		if(part == 1) {
			System.out.println("Você não pode doar ainda.");
			System.exit(0);
		}
		if(part == 2) {
			funcCesariana();
		}
	}
	
	public void funcCesariana(){
		System.out.println("Você realizou parto por cesariana nos últimos 180 dias? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] Não");
		int ces = ler.nextInt();
		
		if(ces == 1) {
			System.out.println("Você não pode doar ainda.");
			System.exit(0);
		}
		if(ces == 2) {
			funcAmamentar();
		}
	}
	
	public void funcAmamentar(){
		System.out.println("Você está ou esteve amamentando no último ano? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] Não");
		int ama = ler.nextInt();
		
		if(ama == 1) {
			System.out.println("Você não pode doar ainda.");
			System.exit(0);
		}
		if(ama == 2) {
			func50();
		}
	}

	
	
}
