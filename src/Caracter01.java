import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Caracter01 {
	private static final String ruta = "datos.txt";
	private static final int tamano = 280;

	// En esta clase vamos a abrir un fichero de caracteres para lectura
	public static void main(String[] args) {
		// Aqui se declara el flujo
		// Simempre se declara el flujo antes de crearlo porque la creacion te
		// pedira un try
		FileReader archivo = null;
		// el destino del flujo
		char[] uno = new char[tamano];
		// El identificador del archivo
		File identificador = new File(ruta);
		// el file me permite comprobar ciertas condiciones
		if (identificador.exists()) {
			// se crea el flujo se debe tratar con try porque abrir un fichero
			// puede estar prohibido para el programa
			try {
				archivo = new FileReader(identificador);
				// leemos de un archivo
				// en la variable lectura se almacena el numero de carcateres
				// leido en uno se almacenan los caracteres que se pueden leer del
				// flujo
				int lectura=archivo.read(uno);
				System.out.println("lectura de "+lectura+" caracteres");
//				Pasamos a un String lo leido en el fichero
				String dos=new String(uno);
				System.out.println(dos);
				//Siempre se debe cerrar
				archivo.close();
				/*
				 * Siempre que trabajeis con un flujo hay tres pasos a seguir
				 * 1² abrir el flujo
				 * 2² trabajar con el flujo
				 * 3² cerrar el flujo
				 */
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("no existe el archivo");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("error de acceso de lectura");
			}
		}

	}

}
