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
	
//	Métodos
	
	public void nome(){
		
		String resp;
		resp = JOptionPane.showInputDialog( "Digite seu nome completo:");
		setNome(resp);
	}
	
	public void sangue(){
		
		String resp;
		resp = JOptionPane.showInputDialog( "Digite seu tipo sanguíneo:");
		setSangue(resp);
	}
	
	public void idade() {
		String resp;
		resp = JOptionPane.showInputDialog( "Digite sua idade:");
		int resposta = Integer.parseInt(resp);
		setIdade(resposta);
		
	}
	
	public void idade16(){
		
		Object[] options = {"Sim", "Não", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Você possui autorização?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			sexo();
		}
		else if(i == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null,  "Você não possui autorização. Não está apto a doar ainda...Mas quando obtiver a autorização poderá doar", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, até breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
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
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, até breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}	
	}
	
	public void func50(){
		
		Object[] options = {"Sim", "Não", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Você pesa mais de 50kg?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			funcSaude();
		}
		else if(i == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Você pesa menos de 50kg.Não está apto a doar ainda...", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, até breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
	
	public void funcSaude(){
		
		Object[] options = {"Sim", "Não", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Você está em boas condições de saúde?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Você não está em boas condições de saúde. Então não está apto a doar ainda...Aguarde a saúde melhorar ou procure um proficional da saúde antes da doação", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.YES_OPTION) {
			funcDente();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, até breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}		
	}
	
	public void funcDente(){
		
		Object[] options = {"Sim", "Não", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Você realizou extração dentária nos últimos 7 dias?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Você realizou extração dentária nos últimos 7 dias.Então não está apto a doar.Tente doar após os 7 dias.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.NO_OPTION) {
			funcTatuagem();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, até breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
	
	public void funcTatuagem(){
		
		Object[] options = {"Sim", "Não", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Você fez tatuagem ou colocou piercing nos últimos 12 meses?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "\" Você fez tatuagem ou colocou piercing nos últimos 12 meses.Então não está apto a doar.Tente doar após os 12 meses.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.NO_OPTION) {
//			funcTatuagem();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, até breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
	
	public void funcVacina(){
		
		Object[] options = {"Sim", "Não", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Você tomou vacina da COVID-19?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			setVacina(1);
		}
		else if(i == JOptionPane.NO_OPTION) {
			setVacina(2);
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, até breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}	
	}
	
	
	public void funcTransfusao(){
		
		Object[] options = {"Sim", "Não", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Você realizaou transfusão de sangue no último ano?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Você realizaou transfusão de sangue no último ano.Então ão está apto a doar.Tente doar após 12 meses.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.NO_OPTION) {
			funcJejum();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, até breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
	
	public void funcJejum(){
		
		Object[] options = {"Sim", "Não", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Você está de jejum?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Você não deve estar de Jejeum antes da doação. Então ão está apto a doar ainda...", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.NO_OPTION) {
			funcAlcool();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, até breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
	
	public void funcAlcool(){
		
		Object[] options = {"Sim", "Não", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Você ingeriu bebidas alcóolicas nas últimas 24h?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Você ingeriu bebidas alcóolicas nas últimas 24h.Então não está apto a doar ainda...Tente doar após as 24h", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.NO_OPTION) {
			funcDrogas();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, até breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
	
	public void funcDrogas(){
		
		Object[] options = {"Sim", "Não", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Você fez uso de drogas ílicitas nos ultimos 12 meses?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Você fez uso de drogas ílicitas nos ultimos 12 meses.Então não está apto a doar ainda...Tente doar após 12 meses", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.NO_OPTION) {
			funcRelacao();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, até breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
	
	public void funcRelacao(){
		
		Object[] options = {"Sim", "Não", "Cancelar"};
		int i = JOptionPane.showOptionDialog(null,"Você teve alguma relação sexual desprotegida nos últimos 12 meses?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		if(i == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, " Você teve alguma relação sexual desprotegida nos últimos 12 meses.Então não está apto a doar ainda...Tente doar após 12 meses", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
		}
		else if(i == JOptionPane.NO_OPTION) {
			funcDoar();
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema, até breve!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
	
	public void funcDoar(){
		
		System.out.println("========================================================");
		System.out.println("=                   Você Pode DOAR!!                   =");
		System.out.println("=       Encontre o posto de coleta mais próximo!!      =");
		System.out.println("========================================================");
		
		System.out.println();
		
	//	JOptionPane.showMessageDialog(null,  getNome(), "Legal, você pode ser um doador!", JOptionPane.INFORMATION_MESSAGE);
		System.out.println(getNome());
		System.out.println(getIdade());
		System.out.println(getSangue());
		System.exit(0);
		
		
	}
	
}
