import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Insertador {
public static void main(String[] args) {
	FileReader fileR=null;
	FileWriter fileW=null;
	File base=new File("base.txt");
	File destino=new File("destino.txt");
	//lo que queremos insertar
	String medio="SORPRESA";
	//donde lo queremos insertar
	int posicion=10;
	if(base.exists()){
		try {
			fileR=new FileReader(base);
			//para anadir al final
			fileW=new FileWriter(destino,true);
			char[] lectura=new char[posicion];
			fileR.read(lectura);
			//A veces hay problemas  de adaptacion entre metodos
			//en este caso obtengo un char array pero necesito un charsequence
			fileW.append(String.valueOf(lectura));
			//esto es la insercion
			fileW.append(medio);
			//el resto del archivo base
			int read = fileR.read();
			//aqui se trasvasa el resto del archivo
			while(read!=-1){
				fileW.append((char)read);
				read = fileR.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fileR.close();
			fileW.close();
			//solo si se han cerrado sin errores
			//procedo a cambiar el estado de los ficheros
			//lo primero es borrar el antiguo
			base.delete();
			//renombrar el nuevo para que se convierta en el antiguo
			destino.renameTo(base);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}
