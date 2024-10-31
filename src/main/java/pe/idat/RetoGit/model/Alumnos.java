package pe.idat.RetoGit.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="alumnos")
public class Alumnos {

    //hola a todos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idAlumno;

    @Column(name = "nombre")
    String nombre;

    @Column(name = "apellidos")
    String apellidos;

    @Column(name = "fecha_nacimiento")
    Date fechaNac;

    @Column(name = "colegio")
    String colegio;

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

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public Alumnos(Long idAlumno, String nombre, String apellidos, Date fechaNac, String colegio) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.colegio = colegio;
    }

    public Alumnos(String nombre, String apellidos, Date fechaNac, String colegio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.colegio = colegio;
    }

    public Alumnos() {
    }
}
