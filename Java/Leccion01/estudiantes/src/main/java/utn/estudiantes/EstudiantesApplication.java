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
  String nl = System.lineSeparator();
	@Autowired
	private EstudianteServicio estudianteServicio;
	private static final Logger logger = LoggerFactory.getLogger(EstudiantesApplication.class);
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
				logger.info("Digite el id estudiante a buscar: ");
				var idEstudiante = Integer.parseInt(consola.nextLine());
				Estudiantes2022 estudiante =
						estudianteServicio.buscarEstudiantePorId(idEstudiante);
				if(estudiante != null)
					logger.info("Estudiante encontrado: "+ estudiante + nl);
				else
					logger.info("Estudiante no encontrado: "+ estudiante + nl)
			}
			case 3 -> { //Agregar estudiante
				logger.info("Agregar estudiante: "+nl);
				logger.info("Nombre: ");
				var nombre = consola.nextLine();
				logger.info("Apellido: ");
				var apellido = consola.nextLine();
				logger.info("Teléfono: ");
				var telefono = consola.nextLine();
				logger.info("Email: ");
				var email = consola.nextLine();
				// Crear el objeto estudiante sin el id
				var estudiante = new Estudiantes2022();
				estudiante.setNombre(nombre);
				estudiante.setApellido(apellido);
				estudiante.setTelefono(telefono);
				estudiante.setEmail(email);
				estudianteServicio.guardarEstudiante(estudiante);
				logger.info("Estudiante agregado: "+estudiante+nl);
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