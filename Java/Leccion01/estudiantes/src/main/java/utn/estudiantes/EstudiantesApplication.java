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























private boolean ejecutarOpciones(Scanner consola) {
		var opcion = Integer.parseInt(consola.nextLine());
		var salir = false;
		switch(opcion){
			case 1 -> {//Listar estudiantes
			logger.info(nl+"Listado de estudiantes: "+nl);
			List<Estudiantes2022> estudiantes = estudianteServicio.listarEstudiante();
			estudiantes.forEach((estudiante -> logger.info(estudiante.toString()+nl)));
		}
	}//Fin switch
	return salir;
}