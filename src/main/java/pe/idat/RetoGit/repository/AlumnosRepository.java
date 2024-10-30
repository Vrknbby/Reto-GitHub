package pe.idat.RetoGit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.idat.RetoGit.model.Alumnos;

@Repository
public interface AlumnosRepository extends JpaRepository<Alumnos,Long> {
}
