package br.com.generation.projectjava;

import java.util.Scanner;

public class Metodos {
	
	public static Scanner ler = new Scanner(System.in);
	
	public static int idade;
	public static int autorizacao;
	public static int sexo;
	public static int dias;
	public static int peso;
	public static int gripe;
	public static int anemia;
	public static int dente;
	public static int tatuagem;
	public static int vacina;
	public static int gravida;
	public static int parto;
	public static int cesaria;
	public static int amamentar;
	public static int butantan;
	public static int tempo;
	public static int astrazeneca;
	public static int transfusao;
	public static int jejum;
	public static int alcool;
	public static int drogas;
	public static int relacao;
	

	public static void FuncIdade(){
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
	
		if(idade >= 16 && idade <= 17) {
			Func16();	
		}
		if(idade < 18) {
			System.out.println("Que pena, voc� n�o pode doar.");
		}
		if(idade >= 18 || idade <=69) {
			FuncSexo();
		}
	}
	
	public static void Func16(){
		System.out.println("Voc� possui autoriza��o: ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		autorizacao = ler.nextInt();
		
		if(autorizacao == 1) {
			FuncSexo();
		}
		else if(autorizacao == 2) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}		
	}
	
	public static void FuncSexo(){
		System.out.println("Qual seu sexo: ");
		System.out.println("[1] Masculino ");
		System.out.println("[2] Feminino");
		sexo = ler.nextInt();
		
		if(sexo == 1) {
			FuncMasc();
		}
		if(sexo == 2) {
			FuncFem();
		}
	}
	
	public static void FuncFem(){
		System.out.println("Doou sangue nos ultimos 90 dias? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		dias = ler.nextInt();
		
		if(dias == 1) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
		if(dias == 2) {
			Func90();
		}
	}
	
	public static void Func90(){
		System.out.println("Doou sangue nos ultimos 90 dias? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		peso = ler.nextInt();
		
		if(peso == 1) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
		if(peso == 2) {
			FuncGravida();
		}
	}
	
	public static void FuncGravida(){
		System.out.println("Voc� est� gr�vida? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		gravida = ler.nextInt();
		
		if(gravida == 1) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
		if(gravida == 2) {
			FuncParto();
		}
	}
	
	public static void FuncParto(){
		System.out.println("Voc� realizou parto normal nos �ltimos 90 dias? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		parto = ler.nextInt();
		
		if(parto == 1) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
		if(parto == 2) {
			FuncCesariana();
		}
	}
	
	public static void FuncCesariana(){
		System.out.println("Voc� realizou parto por cesariana nos �ltimos 180 dias? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		cesaria = ler.nextInt();
		
		if(cesaria == 1) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
		if(cesaria == 2) {
			FuncAmamentar();
		}
	}
	
	public static void FuncAmamentar(){
		System.out.println("Voc� est� ou esteve amamentando no �ltimo ano? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		amamentar = ler.nextInt();
		
		if(amamentar == 1) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
		if(amamentar == 2) {
			Func50();
		}
	}

	public static void FuncMasc(){
		System.out.println("Doou sangue nos ultimos 60 dias? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		dias = ler.nextInt();
		
		if(dias == 1) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
		if(dias == 2) {
			Func50();
		}
	}
		
	public static void Func50(){
		System.out.println("Voc� possui mais de 50kg? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		peso = ler.nextInt();
		
		if(peso == 2) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
		if(peso == 1) {
			FuncGripe();
		}
	}
	
	public static void FuncGripe(){
		System.out.println("Voc� est� com gripe, resfriado ou febre? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		gripe = ler.nextInt();
		
		if(gripe == 1) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
		if(gripe == 2) {
				FuncAnemia();
		}
	}
	
	public static void FuncAnemia(){
		System.out.println("O seu teste de anemia deu positivo?");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		anemia = ler.nextInt();
		
		if(anemia == 1) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
		if(anemia == 2) {
				FuncDente();
		}
	}
	
	public static void FuncDente(){
		System.out.println("Voc� realizou extra��o dent�ria nos �ltimos 7 dias? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		dente = ler.nextInt();
		
		if(dente == 1) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
		if(dente == 2) {
				FuncDente();
		}
	}
	
	public static void FuncTatuagem(){
		System.out.println("Voc� fez tatuagem ou colocou piercing nos �ltimos 12 meses? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		tatuagem = ler.nextInt();
		
		if(tatuagem == 1) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
		if(tatuagem == 2) {
				FuncVacina();
		}
	}
	
	public static void FuncVacina(){
		System.out.println("Voc� tomou vacina da COVID-19? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		vacina = ler.nextInt();
		
		if(vacina == 1) {
			FuncButantan();
		}
		if(vacina == 2) {
//				FuncTransfusao();
		}
	}
	
	public static void FuncButantan(){
		System.out.println("Voc� tomou a vacina Coronavac da Sinovac ou do Butantan? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		butantan = ler.nextInt();
		
		if(butantan == 1) {
			Func48h();
		}
		if(butantan == 2) {
			FuncAstrazeneca();
		}
	}
	
	public static void Func48h(){
		System.out.println("Passou passou 48h desde que voc� tomou a vacina? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		tempo = ler.nextInt();
		
		if(tempo == 1) {
			FuncTransfusao();
		}
		if(tempo == 2) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
	}
	
	public static void FuncAstrazeneca(){
		System.out.println("Voc� tomou a vacina AstraZeneca da Sinovac ou do Butantan? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		astrazeneca = ler.nextInt();
		
		if(astrazeneca == 1) {
			Func7d();
		}
		if(astrazeneca == 2) {
			FuncTransfusao();
		}
	}
	
	public static void Func7d(){
		System.out.println("Passou passou 7 dias desde que voc� tomou a vacina? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		tempo = ler.nextInt();
		
		if(tempo == 1) {
			FuncTransfusao();
		}
		if(tempo == 2) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
	}
	
	public static void FuncTransfusao(){
		System.out.println("Voc� realizaou transfus�o de sangue no �ltimo ano? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		transfusao = ler.nextInt();
		
		if(transfusao == 1) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
		if(transfusao == 2) {
			FuncJejum();
		}
	}
	
	public static void FuncJejum(){
		System.out.println("Voc� est� de jejum? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		jejum = ler.nextInt();
		
		if(jejum == 1) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
		if(jejum == 2) {
			FuncAlcool();
		}
	}
	
	public static void FuncAlcool(){
		System.out.println("Voc� ingeriu bebidas alc�olicas nas �ltimas 24h? ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		alcool = ler.nextInt();
		
		if(alcool == 1) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
		if(alcool == 2) {
			FuncDrogas();
		}
	}
	
	public static void FuncDrogas(){
		System.out.println("Voc� fez uso de drogas �licitas nos ultimos 12 meses ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		drogas = ler.nextInt();
		
		if(drogas == 1) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
		if(drogas == 2) {
			FuncRelacao();
		}
	}
	
	public static void FuncRelacao(){
		System.out.println("Voc� teve alguma rela��o sexual desprotegida nos �ltimos 12 meses ");
		System.out.println("[1] Sim ");
		System.out.println("[2] N�o");
		relacao = ler.nextInt();
		
		if(relacao == 1) {
			System.out.println("Voc� n�o pode doar ainda.");
			System.exit(0);
		}
		if(relacao == 2) {
			FuncDoar();
		}
	}
	
	public static void FuncDoar(){
		
		System.out.println("========================================================");
		System.out.println("=                   Voc� Pode DOAR!!                   =");
		System.out.println("=       Encontre o posto de coleta mais pr�ximo!!      =");
		System.out.println("========================================================");
	}
		

}
