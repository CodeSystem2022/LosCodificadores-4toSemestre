package utn.estudiantes;// paquete utn.estudiante

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication // notacion para ejecutar
public class EstudiantesApplication implements CommandLineRunner { //clase
	@Autowired
	private EstudianteServicio estudianteServicio;
	private static final Logger logger = LoggerFactory.getLogger(EstudiantesApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(EstudiantesApplication.class, args);
	}//todo esto es para poder ejecutar la aplicacion para poder ejecutar la aplicacion

	@Override
	public void run(String... args) throws Exception{

	}



































	private boolean ejecutarOpciones(Scanner consola){
		var opcion = Integer.parseInt(consola.nextLine());
		var salir = false;
		switch (opcion){
			case 1 -> { //Listar estudiantes

			}
			case 2 -> { //Buscar por id

			}
			case 3 -> { //Agregar estudiante

			}
			case 4 -> { //Modificar estudiante

			}
			case 5 -> { //Eliminar estudiante
				logger.info("Eliminar estudiante: " + nl);
				logger.info("Digite el id del estudiante: ");
				var idEstudiante = Integer.parseInt((consola.nextLine()));
				//Buscamos el id estudiante a eliminar
				var estudiante = estudianteServicio.buscarEstudiantePorId(idEstudiante);
				if(estudiante != null){
					estudianteServicio.eliminarEstudiante(estudiante);
					logger.info("estudiante eliminado: " + estudiante+nl);
				}
				else{
					logger.info("Estudiante no encontrado por id: " + estudiante + nl);
				}
			}
			case 6 -> { //Salir
				logger.info("Hasta pronto!!"+nl+nl);
				salir = true;
			}
			default -> logger.info("Opcion no reconocida: "+ opcion + nl);
		}//Fin switch
		return salir;
	}//Fin metodo ejecutarOpciones
}
