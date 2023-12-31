package utn.tienda_libros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import utn.tienda_libros.vista.libroFrom;


import java.awt.EventQueue;

@SpringBootApplication
public class TiendaLibrosApplication {

	public static void main(String[] args) {

		//SpringApplication.run(TiendaLibrosApplication.class, args);





				.headless(false)
				.web(WebApplicationType.NONE)
				.run(args);

		//Ejecutamos el código para cargar el formulario
		EventQueue.invokeLater(() -> { //Método Lambda
			//Obtenemos el objeto from a través del spring
			LibroFrom libroFrom = contextoSpring.getBean(LibroFrom.class);
			libroFrom.setVisible(true);
		});
	}
}
