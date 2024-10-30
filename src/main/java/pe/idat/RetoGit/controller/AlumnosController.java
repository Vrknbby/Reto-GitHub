package pe.idat.RetoGit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.idat.RetoGit.model.Alumnos;
import pe.idat.RetoGit.repository.AlumnosRepository;

import java.util.ArrayList;

@Controller
@RequestMapping("/api/alumno")
public class AlumnosController {

    @Autowired
    AlumnosRepository alumnosRepository;




}
