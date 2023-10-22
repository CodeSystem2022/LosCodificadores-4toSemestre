package utn.estudiantes;// paquete utn.estudiante

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
}
