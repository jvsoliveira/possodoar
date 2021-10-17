package br.com.generation.projectjava;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Doador implements Interface{
	
	Scanner ler = new Scanner(System.in);
	

//	Atributos
	
	private String nome, sangue;
	private int idade, sexo, vacina;

	
	public int getVacina() {
		return vacina;
	}
	public void setVacina(int vacina) {
		this.vacina = vacina;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSangue() {
		return sangue;
	}
	public void setSangue(String sangue) {
		this.sangue = sangue;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	
//	M�todos
	
	public void nome(){
		
		String resp;
		resp = JOptionPane.showInputDialog( "Digite seu nome completo:");
		setNome(resp);
	}
	
	public void sangue(){
		
		String resp;
		resp = JOptionPane.showInputDialog( "Digite seu tipo sangu�neo:");
		setSangue(resp);
	}
	
	public void idade() {
		String resp;
		resp = JOptionPane.showInputDialog( "Digite sua idade:");
		int resposta = Integer.parseInt(resp);
		setIdade(resposta);
		
	}
	
	public void idade16(){
		
		Object[] options = {"Sim", "N�o", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Voc� possui autoriza��o?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			sexo();
		}
		else if(i == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null,  "Voc� n�o possui autoriza��o. N�o est� apto a doar ainda...Mas quando obtiver a autoriza��o poder� doar", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, at� breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}	
	}
	
	public void sexo(){
		
		Object[] options = {"Masculino", "Feminino", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Qual seu sexo?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			setSexo(1);
		}
		else if(i == JOptionPane.NO_OPTION) {
			setSexo(2);
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, at� breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}	
	}
	
	public void func50(){
		
		Object[] options = {"Sim", "N�o", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Voc� pesa mais de 50kg?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			funcSaude();
		}
		else if(i == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Voc� pesa menos de 50kg.N�o est� apto a doar ainda...", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, at� breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
	
	public void funcSaude(){
		
		Object[] options = {"Sim", "N�o", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Voc� est� em boas condi��es de sa�de?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Voc� n�o est� em boas condi��es de sa�de. Ent�o n�o est� apto a doar ainda...Aguarde a sa�de melhorar ou procure um proficional da sa�de antes da doa��o", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.YES_OPTION) {
			funcDente();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, at� breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}		
	}
	
	public void funcDente(){
		
		Object[] options = {"Sim", "N�o", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Voc� realizou extra��o dent�ria nos �ltimos 7 dias?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Voc� realizou extra��o dent�ria nos �ltimos 7 dias.Ent�o n�o est� apto a doar.Tente doar ap�s os 7 dias.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.NO_OPTION) {
			funcTatuagem();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, at� breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
	
	public void funcTatuagem(){
		
		Object[] options = {"Sim", "N�o", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Voc� fez tatuagem ou colocou piercing nos �ltimos 12 meses?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "\" Voc� fez tatuagem ou colocou piercing nos �ltimos 12 meses.Ent�o n�o est� apto a doar.Tente doar ap�s os 12 meses.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.NO_OPTION) {
//			funcTatuagem();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, at� breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
	
	public void funcVacina(){
		
		Object[] options = {"Sim", "N�o", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Voc� tomou vacina da COVID-19?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			setVacina(1);
		}
		else if(i == JOptionPane.NO_OPTION) {
			setVacina(2);
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, at� breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}	
	}
	
	
	public void funcTransfusao(){
		
		Object[] options = {"Sim", "N�o", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Voc� realizaou transfus�o de sangue no �ltimo ano?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Voc� realizaou transfus�o de sangue no �ltimo ano.Ent�o �o est� apto a doar.Tente doar ap�s 12 meses.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.NO_OPTION) {
			funcJejum();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, at� breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
	
	public void funcJejum(){
		
		Object[] options = {"Sim", "N�o", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Voc� est� de jejum?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Voc� n�o deve estar de Jejeum antes da doa��o. Ent�o �o est� apto a doar ainda...", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.NO_OPTION) {
			funcAlcool();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, at� breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
	
	public void funcAlcool(){
		
		Object[] options = {"Sim", "N�o", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Voc� ingeriu bebidas alc�olicas nas �ltimas 24h?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Voc� ingeriu bebidas alc�olicas nas �ltimas 24h.Ent�o n�o est� apto a doar ainda...Tente doar ap�s as 24h", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.NO_OPTION) {
			funcDrogas();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, at� breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
	
	public void funcDrogas(){
		
		Object[] options = {"Sim", "N�o", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Voc� fez uso de drogas �licitas nos ultimos 12 meses?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Voc� fez uso de drogas �licitas nos ultimos 12 meses.Ent�o n�o est� apto a doar ainda...Tente doar ap�s 12 meses", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.NO_OPTION) {
			funcRelacao();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, at� breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
	
	public void funcRelacao(){
		
		Object[] options = {"Sim", "N�o", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Voc� teve alguma rela��o sexual desprotegida nos �ltimos 12 meses?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, " Voc� teve alguma rela��o sexual desprotegida nos �ltimos 12 meses.Ent�o n�o est� apto a doar ainda...Tente doar ap�s 12 meses", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.NO_OPTION) {
			funcDoar();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, at� breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
	
	public void funcDoar(){
		
		System.out.println("========================================================");
		System.out.println("=                   Voc� Pode DOAR!!                   =");
		System.out.println("=       Encontre o posto de coleta mais pr�ximo!!      =");
		System.out.println("========================================================");
		
		System.out.println();
		
	//	JOptionPane.showMessageDialog(null,  getNome(), "Legal, voc� pode ser um doador!", JOptionPane.INFORMATION_MESSAGE);
		System.out.println(getNome());
		System.out.println(getIdade());
		System.out.println(getSangue());
		System.exit(0);
		
		
	}
	
}
