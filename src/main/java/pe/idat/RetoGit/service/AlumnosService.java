package pe.idat.RetoGit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import pe.idat.RetoGit.model.Alumnos;
import pe.idat.RetoGit.repository.AlumnosRepository;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AlumnosService {

    @Autowired
    AlumnosRepository alumnosRepository;

    public Alumnos guardarAlumno(Alumnos Newalumno){
        Alumnos alumno = new Alumnos(
                Newalumno.getNombre(),
                Newalumno.getApellidos(),
                Newalumno.getFechaNac(),
                Newalumno.getColegio(),
                Newalumno.getDni()
        );
        return  alumnosRepository.save(alumno);
    }

    public ArrayList<Alumnos> listarAlumnos(){
        return (ArrayList<Alumnos>) alumnosRepository.findAll();
    }

    public Alumnos obtenerPorId(Long id){
        return  alumnosRepository.findById(id).orElse(null);
    }

    public boolean eliminarAlumno(Long id){
        if (alumnosRepository.existsById(id)) {
            alumnosRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public Alumnos modificarAlumno(Long id, Alumnos alumnoActualizado){
        Optional<Alumnos> alumnoExistente = alumnosRepository.findById(id);

        if (alumnoExistente.isPresent()) {
            Alumnos alumno = alumnoExistente.get();

            if (alumnoActualizado.getNombre() != null){
                alumno.setNombre(alumnoActualizado.getNombre());
            }
            if (alumnoActualizado.getApellidos() != null){
                alumno.setApellidos(alumnoActualizado.getApellidos());
            }
            if (alumnoActualizado.getFechaNac() != null){
                alumno.setFechaNac(alumnoActualizado.getFechaNac());
            }
            if (alumnoActualizado.getColegio() != null){
                alumno.setColegio(alumnoActualizado.getColegio());
            }
            if (alumnoActualizado.getDni() != null){
                alumno.setDni(alumnoActualizado.getDni());
            }

            return alumnosRepository.save(alumno);
        } else {
            return null;
        }
    }
}
