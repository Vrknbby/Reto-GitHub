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

    public Long getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Long idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public alumnos(Long idAlumno, String nombre, String apellidos, Date fechaNac) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
    }

    public alumnos(String nombre, String apellidos, Date fechaNac) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
    }

    public alumnos() {
    }
}
