package br.com.generation.projectjava;

import javax.swing.JOptionPane;

public class Vacina extends Doador {
	

	public void funcButantan(){
		Object[] options = {"Sim", "Não", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Você tomou a vacina Coronavac?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			func48h();
		}
		else if(i == JOptionPane.NO_OPTION) {
			funcAstrazeneca();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, até breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}		
	}
		
	public void func48h(){
		
		Object[] options = {"Sim", "Não", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Passou 48h desde que você tomou a vacina?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			funcTransfusao();
		}
		else if(i == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Que pena, você não pode doar =/", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, até breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}	
	}
	
	public void funcAstrazeneca(){
		
		Object[] options = {"Sim", "Não", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Você tomou a vacina AstraZeneca?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			func7d();
		}
		else if(i == JOptionPane.NO_OPTION) {
			funcTransfusao();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, até breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}	
	}
	
	public void func7d(){
		Object[] options = {"Sim", "Não", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Passou 7 dias desde que você tomou a vacina?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			funcTransfusao();
		}
		else if(i == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Que pena, você não pode doar =/", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, até breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
}
