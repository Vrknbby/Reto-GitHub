package pe.idat.RetoGit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @PutMapping("/edit/{id}")
    public ResponseEntity<Alumnos> modificarAlumno(@PathVariable Long id, @RequestBody Alumnos alumnoActualizado){
        Alumnos alumno = this.alumnosService.modificarAlumno(id, alumnoActualizado);
        if (alumno != null){
            return ResponseEntity.ok(alumno);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarAlumno(@PathVariable("id") Long id){
        boolean eliminado = this.alumnosService.eliminarAlumno(id);

        if (eliminado) {
            return ResponseEntity.ok("Alumno eliminado correctamente");
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se pudo eliminar al Alumno, ID no encontado");
        }
    }

}
