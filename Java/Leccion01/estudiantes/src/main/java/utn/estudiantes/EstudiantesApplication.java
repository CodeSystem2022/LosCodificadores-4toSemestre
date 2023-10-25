package utn.estudiantes;// paquete utn.estudiante

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // notacion para ejecutar
public class EstudiantesApplication { //clase

	
	
	
	
	
	
	
	
	
	
	
	String nl = System.lineSeparator(); 

	public static void main(String[] args) {
		logger.info("Iniciando la aplicacion...");
		//Levantar la fabrica de Spring
		SpringApplication.run(EstudiantesApplication.class, args);
		logger.info("Aplicacion Finalizada!");
	}

	@Override
	public void run(String...args) throws Exception {
		logger.info("Ejecutando el metodo run de Spring...");
	}

}
