package br.com.generation.projectjava;

public class Main {

	public static void main(String[] args) {

//		 Declaração de objetos

		Doador d = new Doador();
		Feminino fm = new Feminino();
		Masculino mc = new Masculino();
		Vacina vac = new Vacina();
		
//		 Chamada dos métodos
		
		d.nome();
		d.idade();
		
//		Bifurcação Idade
		
		if(d.getIdade() >= 16 && d.getIdade() <= 17) {
			d.idade16();
		}
		else if(d.getIdade() >= 18 && d.getIdade() <=69) {
			d.sexo();
		}
		if(d.getIdade() < 16) {
			System.out.println("Que pena, você não pode doar.");
		}
		
//		Bifurcação Sexo
	
		if(d.getSexo() == 1) {
			mc.funcMasc();
		}
		if(d.getSexo() == 2) {
			fm.funcFem();
		}
	
//		Bifurcação Vacina
		
		d.funcVacina();
		
		if(d.getVacina() == 1) {
			vac.funcButantan();
		}
		if(d.getVacina() == 2) {
			d.funcTransfusao();
		}
		
	}

}
