import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Caracter03Clase {
	// usamos mi primer buffer
	public static void main(String[] args) {
		FileReader flujo = null;
		BufferedReader buffer = null;
		File file = new File("JuegoTronos.txt");
		// Lo primero siempre es?
		if (file.exists()) {
			// abrir flujo
			try {
				flujo = new FileReader(file);
				buffer = new BufferedReader(flujo);
				// este metodo permite leer de un buffer hasta que encuentre un
				// caracter /n
				System.out.println(buffer.readLine());
				System.out.println(buffer.readLine());
				buffer.mark(1000);
				System.out.println(buffer.readLine());
				System.out.println(buffer.readLine());
				System.out.println(buffer.readLine());
				System.out.println(buffer.readLine());
				System.out.println(buffer.readLine());
				// Se vuelve a la marca
				//reset vuelve al punto de la marca si estÃ¡ dentro del limmite
				buffer.reset();
				System.out.println(buffer.readLine());
				System.out.println(buffer.readLine());
				System.out.println(buffer.readLine());
				System.out.println(buffer.readLine());
				System.out.println(buffer.readLine());
				// mark permite marcar una punto del flujo ponemos limites en bytes
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				flujo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void metodo() throws Exception {
		// Si es un metodo podemos seguir la programcaion por contrato
		// tirando arriba el fallo y quedando el codigo más pequeño
		File file = new File("JuegoTronos.txt");
		FileReader flujo = new FileReader(file);
		BufferedReader buffer = new BufferedReader(flujo);
		buffer.readLine();
	}
}
