package estudiantes.servicio;

import
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.estudiantes.modelo.Estudiantes2022;

import java.util.List;

@Service

public class EstudianteServicio implements IEstudianteServicio{
    @Autowired
    private EstudianteRepositorio estudianteRepositorio;

    @Override
    public List<Estudiantes2022> listarEstudiantes() {
        List<Estudiantes2022> estudiantes = estudianteRepositorio.findAll;
        return estudiantes;
    }

    @Override
    public Estudiantes2022 buscarEstudiantePorId(Integer idestudiante2022) {
        return null;
    }

    @Override
    public void guardarEstudiante(Estudiantes2022 estudiante) {

    }

    @Override
    public void eliminarEstudiante(Estudiantes2022 estudiante) {

    }
}
