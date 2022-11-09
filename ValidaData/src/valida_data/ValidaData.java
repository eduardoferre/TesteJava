package valida_data;

import java.util.Scanner;
public class ValidaData {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int dia;
		int mes;
		int ano;
		
		System.out.print("Digite o dia: ");
		dia = scanf.nextInt();
		System.out.print("Digite o mes: ");
		mes = scanf.nextInt();
		System.out.print("Digite o ano: ");
		ano = scanf.nextInt();
		
		if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
			if(dia>=1 && dia<=31) {
				System.out.println("Data Válida. A data digitada foi: "+dia+"/"+mes+"/"+ano);
			}
			else {
				System.out.println("Data Inválida");
			}
		}
		
		else if(mes==4 || mes==6 || mes==9 || mes==11) {
			if(dia>=1 && dia<=30) {
				System.out.println("Data Válida. A data digitada foi: "+dia+"/"+mes+"/"+ano);
			}
			else {
				System.out.println("Data Inválida");
			}
		}
		
		else if(mes==2) {
			if(ano%4==0 && ano%100!=0) {
				if(dia>=1 && dia<=29) {
					System.out.println("Data Válida. A data digitada foi: "+dia+"/"+mes+"/"+ano);
				}
				else {
					System.out.println("Data Inválida");
				}
			}
			
			else {
				if(dia>=1 && dia<=28) {
					System.out.println("Data Válida. A data digitada foi: "+dia+"/"+mes+"/"+ano);
				}
				else {
					System.out.println("Data Inválida");
				}
			}
		}
		
		else {
			System.out.println("Data Inválida");
		}
		
		System.out.println("Nada nao!");
		scanf.close();
		
	}

}
