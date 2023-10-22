package utn.estudiantes.modelo;

import jakarta.persistance.Entity;
import jakarta.persistance.GeneratedValue;
import jakarta.persistance.Id;

@Entity
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstudiante;
}
