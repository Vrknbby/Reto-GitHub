package pe.idat.RetoGit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pe.idat.RetoGit.model.Alumnos;
import pe.idat.RetoGit.service.AlumnosService;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnosController {
    @Autowired
    AlumnosService alumnosService;

    @GetMapping()
    public ArrayList<Alumnos> obtenerAlumnos(){
        return alumnosService.listarAlumnos();
    }

    @PostMapping()
    public Alumnos guardarAlumno(@RequestBody Alumnos alumno){
        return this.alumnosService.guardarAlumno(alumno);
    }

}
