package br.com.generation.projectjava;

import java.util.Scanner;

public class Doador implements Interface{
	
	Scanner ler = new Scanner(System.in);
	

//	Atributos
	
	private String nome;
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
		System.out.println("\nDigite seu nome completo: ");
		setNome(ler.next());
	}
	
	public void idade() {
		System.out.println("Digite sua idade: ");
		setIdade(ler.nextInt());
	}
	
	public void idade16(){
		
		System.out.println("Você possui autorização: ");
		System.out.println("[1] Sim ");
		System.out.println("[2] Não");
		int aut = ler.nextInt();
		
		if(aut == 1) {
			sexo();
		}
		else if(aut == 2) {
			System.out.println("Você não pode doar ainda.");
			System.exit(0);
		}
	}
	
	public void sexo(){
		System.out.println("Qual seu sexo: ");
		System.out.println("[1] Masculino ");
		System.out.println("[2] Feminino");
		setSexo(ler.nextInt());
		
	}
	
	public void func50(){
		System.out.println("Você possui mais de 50kg? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] Não");
		int peso = ler.nextInt();

	
		if(peso == 2) {
			System.out.println("Você não pode doar ainda.");
			System.exit(0);
		}
		if(peso == 1) {
			funcGripe();
		}
	}
	
	public void funcGripe(){
		
		System.out.println("Você está com gripe, resfriado ou febre? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] Não");
		int grip = ler.nextInt();
		
		if(grip == 1) {
			System.out.println("Você não pode doar ainda.");
			System.exit(0);
		}
		if(grip == 2) {
				funcAnemia();
		}
	}
	
	public void funcAnemia(){
		System.out.println("O seu teste de anemia deu positivo?");
		System.out.println("[1] Sim ");
		System.out.println("[2] Não");
		int anem = ler.nextInt();
		
		if(anem == 1) {
			System.out.println("Você não pode doar ainda.");
			System.exit(0);
		}
		if(anem == 2) {
				funcDente();
		}
	}
	
	public void funcDente(){
		System.out.println("Você realizou extração dentária nos últimos 7 dias? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] Não");
		int dent = ler.nextInt();
		
		if(dent == 1) {
			System.out.println("Você não pode doar ainda.");
			System.exit(0);
		}
		if(dent == 2) {
				funcTatuagem();
		}
	}
	
	public void funcTatuagem(){
		System.out.println("Você fez tatuagem ou colocou piercing nos últimos 12 meses? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] Não");
		int tatu = ler.nextInt();
		
		if(tatu == 1) {
			System.out.println("Você não pode doar ainda.");
			System.exit(0);
		}
		if(tatu == 2) {
//				funcVacina();
		}
	}
	
	public void funcVacina(){
		System.out.println("Você tomou vacina da COVID-19? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] Não");
		setVacina(ler.nextInt());
		
	}
	
	
	public void funcTransfusao(){
		System.out.println("Você realizaou transfusão de sangue no último ano? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] Não");
		int transf = ler.nextInt();
		
		if(transf == 1) {
			System.out.println("Você não pode doar ainda.");
			System.exit(0);
		}
		if(transf == 2) {
			funcJejum();
		}
	}
	
	public void funcJejum(){
		System.out.println("Você está de jejum? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] Não");
		int jejum = ler.nextInt();
		
		if(jejum == 1) {
			System.out.println("Você não pode doar ainda.");
			System.exit(0);
		}
		if(jejum == 2) {
			funcAlcool();
		}
	}
	
	public void funcAlcool(){
		System.out.println("Você ingeriu bebidas alcóolicas nas últimas 24h? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] Não");
		int alcool = ler.nextInt();
		
		if(alcool == 1) {
			System.out.println("Você não pode doar ainda.");
			System.exit(0);
		}
		if(alcool == 2) {
			funcDrogas();
		}
	}
	
	public void funcDrogas(){
		System.out.println("Você fez uso de drogas ílicitas nos ultimos 12 meses ");
		System.out.println("[1] Sim ");
		System.out.println("[2] Não");
		int droga = ler.nextInt();
		
		if(droga == 1) {
			System.out.println("Você não pode doar ainda.");
			System.exit(0);
		}
		if(droga == 2) {
			funcRelacao();
		}
	}
	
	public void funcRelacao(){
		System.out.println("Você teve alguma relação sexual desprotegida nos últimos 12 meses ");
		System.out.println("[1] Sim ");
		System.out.println("[2] Não");
		int rel = ler.nextInt();
		
		if(rel == 1) {
			System.out.println("Você não pode doar ainda.");
			System.exit(0);
		}
		if(rel == 2) {
			funcDoar();
		}
	}
	
	public void funcDoar(){
		
		System.out.println("========================================================");
		System.out.println("=                   Você Pode DOAR!!                   =");
		System.out.println("=       Encontre o posto de coleta mais próximo!!      =");
		System.out.println("========================================================");
		System.exit(0);
	}
	
}
