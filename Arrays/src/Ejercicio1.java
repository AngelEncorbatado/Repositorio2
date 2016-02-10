import java.util.Scanner;


public class Ejercicio1 {
	 int array1[], array2[], resultado[];
     int  numeroEnteros[];	
     Scanner sc = new Scanner(System.in);
     final int tamaño=10;
     
public int[] sumaArrays(int a1[], int a2[]){
	int rdo[]= new int[a1.length];
	for(int i=0; i<tamaño; i++){
		rdo[i]=a1[i]+a2[i];
	}
	return rdo;
}
public void muestraResultado(int a[]){
	for(int i=0; i<tamaño; i++){
		System.out.println(a[i]+"  ");
	}
	System.out.println();
}
 //metodo que recibe valores de un array por parametro y le introduce un valor    
public void introValoresArray(int elMeuArray[]){
	for(int i=0; i<elMeuArray.length; i++){
	System.out.println("Introduce el valor"+i+"del array");
	elMeuArray[i]=sc.nextInt();
	}
}	
public static void main(String[] args) {
	int opcion;
	Ejercicio1 exercicio1 = new Ejercicio1();
	exercicio1.array1= new int[exercicio1.tamaño];
	exercicio1.array2= new int[exercicio1.tamaño];
	exercicio1.resultado= new int[exercicio1.tamaño];
	do{
	opcion = exercicio1.menu();
	if (opcion<=5 && opcion>0){
	System.out.println("Has escogido la opcion "+opcion);
	}else{
		System.out.println("No has escogido una de las opciones");
		opcion = exercicio1.menu();		
	}
	}
	while(opcion<0 || opcion>5);
		
	switch(opcion){
	case 1: exercicio1.introValoresArray(exercicio1.array1);
	break;
	case 2: exercicio1.introValoresArray(exercicio1.array2);
	break;
	case 3: exercicio1.resultado=exercicio1.sumaArrays(exercicio1.array1, exercicio1.array2);
	break;
	case 4: exercicio1.muestraResultado(exercicio1.resultado);
	break;	
	}
}


//Metodo que muestra un menu i que nos devuelve la opcion escogida por el usuario
 public int menu(){
	 System.out.println("Menu de Opciones");
	 System.out.println("-----------------");
	 System.out.println("1)-Introduce array 1");
	 System.out.println("2)-Introduce array 2");
	 System.out.println("3)-Suma arrays.");
	 System.out.println("4)-Muestra resultado");
	 System.out.println("5)-ACABAR");
	 return(sc.nextInt());
}
}