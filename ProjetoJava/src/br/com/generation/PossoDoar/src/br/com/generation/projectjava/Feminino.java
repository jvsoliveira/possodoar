package br.com.generation.projectjava;

public class Feminino extends Doador{
	
	public void funcFem(){
		
		System.out.println("Doou sangue nos ultimos 90 dias? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		int dias = ler.nextInt();
		
		if(dias == 1) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
		if(dias == 2) {
			funcGravida();
		}
	}
	
	public void funcGravida(){
		System.out.println("Voc� est� gr�vida? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		int grav = ler.nextInt();
		
		if(grav == 1) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
		if(grav == 2) {
			funcParto();
		}
	}
	
	public void funcParto(){
		System.out.println("Voc� realizou parto normal nos �ltimos 90 dias? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		int part = ler.nextInt();
		
		if(part == 1) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
		if(part == 2) {
			funcCesariana();
		}
	}
	
	public void funcCesariana(){
		System.out.println("Voc� realizou parto por cesariana nos �ltimos 180 dias? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		int ces = ler.nextInt();
		
		if(ces == 1) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
		if(ces == 2) {
			funcAmamentar();
		}
	}
	
	public void funcAmamentar(){
		System.out.println("Voc� est� ou esteve amamentando no �ltimo ano? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		int ama = ler.nextInt();
		
		if(ama == 1) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
		if(ama == 2) {
			func50();
		}
	}

	
	
}
