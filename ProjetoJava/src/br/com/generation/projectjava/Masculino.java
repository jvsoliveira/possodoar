package br.com.generation.projectjava;

import javax.swing.JOptionPane;

public class Masculino extends Doador{
	
	public void funcMasc(){
		
		Object[] options = {"Sim", "Não", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Doou sangue nos ultimos 60 dias?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Que pena, você não pode doar =/", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.NO_OPTION) {
			func50();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, até breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}	
	}
}