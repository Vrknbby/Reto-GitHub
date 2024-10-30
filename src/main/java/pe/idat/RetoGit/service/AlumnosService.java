package pe.idat.RetoGit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.RetoGit.model.Alumnos;
import pe.idat.RetoGit.repository.AlumnosRepository;

import java.util.ArrayList;

@Service
public class AlumnosService {

    @Autowired
    AlumnosRepository alumnosRepository;

    public Alumnos guardarAlumno(Alumnos Newalumno){
        Alumnos alumno = new Alumnos(
                Newalumno.getNombre(),
                Newalumno.getApellidos(),
                Newalumno.getFechaNac(),
                Newalumno.getColegio()
        );
        return  alumnosRepository.save(alumno);
    }

    public ArrayList<Alumnos> listarAlumnos(){
        return (ArrayList<Alumnos>) alumnosRepository.findAll();
    }

    public boolean eliminarAlumno(Long id){
        try {
            alumnosRepository.deleteById(id);
            return true;
        } catch (Exception err){
            return false;
        }
    }
}
