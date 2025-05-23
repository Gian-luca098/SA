package trabalhoEquipe5;
import java.util.*;
	public class SA { 
		static Scanner entrada = new Scanner (System.in);
		static ArrayList<Integer> setores = new ArrayList<>();
		static ArrayList<Integer> maquinas = new ArrayList<>();
		static ArrayList<String> tipoFerramenta = new ArrayList<>();
		//-----------------------------------------------------------------
		public static int cadastrarSetor() {
			int setor = 0;
			System.out.println("Digite o numero para o setor: ");
			setor = entrada.nextInt();
			setores.add(setor);
			System.out.println("setor registrado");
			return 0;		
		}
		//--------------------------------------------------------------------
		public static int cadastrarMaquina() {
			if (setores.size()==0) {
				System.out.println("nao pode cadastrar maquina sem setores");
			}
			else {
			int maquina = 0;
			System.out.println("Digite o numero para a maquina: ");
			maquina = entrada.nextInt();
			maquinas.add(maquina);
			System.out.println("maquina registrada");
			}
			return 0;
			}
		//-----------------------------------------------------------------------	
			public static int ferramentas() {
			int alicate;
			int martelo;
			int chaveFenda;
			/////
			do {
			System.out.println("Registrar  a Quantidade de Alicates: ");
			alicate= entrada.nextInt();
			if(alicate<0 ){
				 System.out.println("Quantidade Invalida! ");	
			 }
			}while(alicate <0);					 
//////////////////////////////////////////	
			do {
			System.out.println("Cadastrar a Quantidade de Martelos:");
			martelo= entrada.nextInt();
			if(martelo <0) {
				 System.out.println("Quantidade Invalida!");
			 	}
			 }while(martelo <0);
///////////////////////////////////////////	
			do {
			System.out.println("Cadastrar a Quantidade de Chaves de Fendas: ");
			chaveFenda= entrada.nextInt();
			 if(chaveFenda <0) {
				 System.out.println("Quantidade Invalida!");
			  }
			 }while(chaveFenda <0);		 			 
/////////////////////////////////////////////////////////////
			 System.out.println("Ferramentas cadastradas");
			 return 0;
		}
	//----------------------------------------------------------------------------			
		public static int[][] registrarquatidade() {
			
			int i =maquinas.size();
		System.out.println("digite a quantidade de ferramentas por dia na semana ");
		int[][] matriz = new int [i][5];
		for (int k = 0;k < matriz.length; k ++ ) {
			for (int j = 0;j<matriz[k].length;j++) {
				System.out.println("elemento:"+k+j);
				matriz[k][j] = entrada.nextInt();  
			}
		
		}
		return matriz;
		}
			
			 public static void mostrarMatriz(int[][] matriz) {
			        for (int k = 0; k < matriz.length; k++) {
			            for (int j = 0; j < matriz[k].length; j++) {
			                System.out.print(matriz[k][j] + " ");
			            }
			            System.out.println();
			        
			 }
			       
			 }
			 
			 
	//----------------------------------------------------------------------	
		
		
	public static void main(String[] args) {
		int opcao = 0;
		while (opcao !=6) {
		System.out.println("-----MENU-----");
		System.out.println("1- Cadastrar setores");
		System.out.println("2- Cadastrar máquinas e definir ferramenta por máquina");
		System.out.println("3- Cadastrar quantidade de ferramentas produzidas");
		System.out.println("4- Mostrar relatório");
		System.out.println("5- Verificar máquinas inativas");
		System.out.println("6- Encerrar sistema");
			opcao = entrada.nextInt();
			if (opcao<1 || opcao>6) {
				System.out.println("Numero invalido");
			}
			switch (opcao) {
			
			case 1:
				cadastrarSetor();
				break;
			case 2:
				cadastrarMaquina();
				break;
			case 3:
				registrarquatidade();
				break;
			case 4:
				
				break;
			case 5:
				
				break;
				default:
					System.out.println("Saindo. . .");
				
			}
			
		}
		
	entrada.close();
		}
	}
