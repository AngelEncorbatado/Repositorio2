package examenparte2;

public class examenparte2 {public static void main(String[] args) {
	  //Primero Vamos a declara los Strings
	String mensaje="Paquito es el tio mas guapo que conozco";
	String mensajeCodificado="";
	String temporal="";
	//Ponemos el mensaje en mayúsculas
	mensajeCodificado=mensaje.toUpperCase();
	//recorremos mensajeCodificado con un for pero de 2 en 2
	for(int i=0;i<mensajeCodificado.length();i+=2){
		//Si en la posicion i + 1 es la misma que en mensaje entonces mensajeCodificado en su posicion i 
		if(i+1==mensaje.length()){			
			temporal=temporal+mensajeCodificado.charAt(i);
			//si no, incrementamos el valor
		}else{
			temporal=temporal+mensajeCodificado.charAt(i+1)+mensajeCodificado.charAt(i);
		}
	}
	//igualamos mensajeCodificado a temporal y lo mostramos
	mensajeCodificado=temporal;
	System.out.println(mensajeCodificado);
}
}
