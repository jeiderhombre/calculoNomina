/*
 un programa para calcular el salario,
pide tres datos 
-1.nombre ; -2.salario ; -3.estrcto
el sigiente paso es calcular el salario, teniendo encuenta los siguientes datos
auxilio de trasportes=106000
deducion de el 8%
bonificaciones para los infro estractos:
            ->stracto -=3 el 5%
            ->stracto 4y5 el 3%
            ->stracto 6 no aplica 

 */
package alquimet;

import java.util.*;

public class alquimet {
	
	static Scanner lerr=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		int cant=0;
		boolean key=true;
		char YoN=' ';
		
		do {
		System.out.print("cuantos enpleados vas a calcular el salario\n\ncuantos: ");
		//lerr.next();
		cant=lerr.nextInt();
		
		String[] nom = new String[cant];
		double[] sala = new double[cant], salto=new double[cant];
		double[] ausi=new double[2];
		int[] strac=new int[cant];
		for(int i=0; i <cant; i++) {
			System.out.print("ingresa al trabajador #"+(i+1)+": ");
			nom[i]=lerr.next();
			System.out.print("ingresa el salario de "+nom[i]+": ");
			sala[i]=lerr.nextDouble();
			System.out.print("cual es el extracto de "+nom[i]+"\n1, 2, 3, 4, 5 o 6: ");
			strac[i]=lerr.nextInt();
			switch(strac[i]) {
				case 1:case 2: case 3:
					ausi[0]=sala[i]*0.08;
					System.out.print(ausi[0]);
					ausi[1]=sala[i]*0.05;
					System.out.print(ausi[1]);
				salto[i]= (sala[i]-ausi[0])+(106000+ausi[1]);
				break;case 4: case 5:
					ausi[0]=sala[i]*0.08;
					ausi[1]=sala[i]*0.03;
				salto[i]= (sala[i]-ausi[0])+(106000+ausi[1]);
				break;default:
					ausi[0]=sala[i]*0.08;
				salto[i]= (sala[i]-ausi[0])+106000;
			}
						
		}
		for(int i=0; i < cant; i++) {
			System.out.println("el salario de "+nom[i]+" es= "+salto[i]);
		}
		System.out.print("vas a sacar nomina para mas trabajadores/ si=y o no=n: ");
		YoN=lerr.next().charAt(0);
		switch(YoN) {
			case 'n': case 'N':key=false;
			break;case 'y':case 'Y': 
			break;default: 
				System.out.print("el caracter es diferente a Y o N, por lo tanto volvemos a enpesar. \n\n\n\n");
			
		}
		}while(key);
	}
}
