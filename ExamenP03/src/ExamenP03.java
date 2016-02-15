
public class ExamenP03 {
	public static void main(String[] args) {
		//Declaramos los Strings
		String mensajeCodificado="APUQTI OSEE  LIT OAM SUGPA OUQ EOCONCZO";
		String mensaje="";
		String temporal="";
		//Ponemos en minúscula las letras y almacenamos en mensaje
		mensaje=mensajeCodificado.toLowerCase();
		//recorremos el String mensaje con un for de dos en dos
		for(int i=0;i<=mensaje.length();i+=2){
			//si el String mensaje esta en la ultima posicion, temporal se incrementará en ese ccarácter
			if(i+1==mensaje.length()){			
				temporal=temporal+mensaje.charAt(i);
				//si no es así a temporal se le suma el carácter y el siguiente(i + 1)
			}else{
				temporal=temporal+mensaje.charAt(i+1)+mensaje.charAt(i);
			}
		}
		//para monstrar en mensaje el temporal
		mensaje=temporal;
		System.out.println(mensaje);
	}
}
