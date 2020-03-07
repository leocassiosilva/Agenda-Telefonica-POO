package br.ifrn;
import java.util.Scanner;
public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		//Variavel tipo bool para ser usada na estrutura de repetição
		int cont = 100;
		boolean repeticao = true; 
		String nomes[] = new String[cont];
		String emails[] = new String[cont];
		String dataNascimento[] = new String[cont];
		String telefone[] = new String [cont];
		int i = 0;
		int aux = 0;
		//Menu
		while(repeticao == true) {
			
			System.out.println("Agenda de Contato");
			System.out.println("1 - Cadastrar\n2 - Listar\n3 - Exluir\n4 - Sair");
			int op = Integer.parseInt(ler.nextLine());
			
			switch (op) {
			case 1:
				System.out.println("Cadastrar");
				i = cadastrando(nomes, emails, dataNascimento, telefone, cont, i); 
				break;
			case 2:
				System.out.println("Listar");
				listar(nomes, emails,dataNascimento, telefone, cont);
				break;
			case 3:
				int x = excluir(nomes, emails,dataNascimento,telefone, cont);
				i = x+2;
				break;
			case 4:
				System.out.println("Sair");
				repeticao=false;
				break;
			default:
				System.out.println("Erro");
				break;
			}
		}
		
		
	}
	
	//Função para cadastrar pessoas
	public static int cadastrando(String nomes[], String emails[], String dataNascimento[], String telefone[], int cont, int i) {
		Scanner ler = new Scanner(System.in); 
		
			int j = 0;
			j = i;
			if (i >= 5) {
				System.out.println("Vetor cheio");
			}else {
			do {
				System.out.println("Digite o nome  da : " + j + "° pessoa: ");
				nomes[j] = ler.next().toUpperCase();
				System.out.println("Digite o email  da : " + j + "° pessoa: ");
				emails[j] = ler.next().toUpperCase();
				System.out.println("Digite o Data Nascimento  da : " + j + "° pessoa: ");
				dataNascimento[j] = ler.next().toUpperCase();
				System.out.println("Digite o Telefone  da : " + j + "° pessoa: ");
				telefone[j] = ler.next().toUpperCase();
				i++;
				
				break;
				
			} while (j < cont);
			
			}
		
		return j+1;
	}
	
	//Função para listar as pessoas 
	public static void listar(String nomes[],String emails[], String dataNascimento[],String telefone[], int cont){
		for (int i = 0; i < cont; i++) {
			if(nomes[i] != null) {
				System.out.println("-------------------------------------------------------");
				System.out.println("Nome: " + i + " : " + nomes[i]);
				System.out.println("Email: " + i + " : " + emails[i]);
				System.out.println("Data Nascimento: " + i + " : " + dataNascimento[i]);
				System.out.println("Telefone: " + i + " : " + telefone[i]);
				System.out.println("-------------------------------------------------------");
			}
		}
	}
	
	//Função para exlusão de um elemento de um vetor
	public static int excluir(String nomes [], String emails[],String dataNascimento[],String telefone[], int cont) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o email para exluir o usuario: ");
		String email = ler.nextLine().toUpperCase();
		int i = 0;
		for (i = 0; i < emails.length -1; i++) {
			 if(emails[i].equals(email)){
	                nomes[i] = null;
	                nomes[i] = nomes[i+1];
	                nomes[i+1] = null;
	                
	                emails[i] = null;
	                emails[i] = emails[i+1];
	                emails[i+1] = null;
	                
	                dataNascimento[i] = null;
	                dataNascimento[i] = dataNascimento[i+1];
	                dataNascimento[i+1] = null;
	                
	                telefone[i] = null;
	                telefone[i] = telefone[i+1];
	                telefone[i+1] = null;
	                i--;
	                break;
			 }
		}
		
		return i;
	}
}
	
