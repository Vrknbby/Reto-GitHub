package pe.idat.RetoGit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Table
@Entity(name="Alumnos")
public class alumnos {

    Long idAlumno;
    String nombre;
    String apellidos;
    Date fechaNac;

}
