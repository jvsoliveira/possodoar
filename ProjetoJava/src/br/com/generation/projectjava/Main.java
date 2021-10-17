package br.com.generation.projectjava;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

//		 Declaração de objetos

		Doador d = new Doador();
		Feminino fm = new Feminino();
		Masculino mc = new Masculino();
		Vacina vac = new Vacina();
		
		
//		 Chamada dos métodos
		
		d.nome();
		d.sangue();
		d.idade();
	
		
//		Bifurcação Idade
		
		if(d.getIdade() >= 16 && d.getIdade() <= 17) {
			d.idade16();
		}
		if(d.getIdade() >= 18 && d.getIdade() <=69) {
			d.sexo();
		}
		if(d.getIdade() < 16 || d.getIdade() > 69) {
			JOptionPane.showMessageDialog(null, "Que pena, você não pode doar =/", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
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
