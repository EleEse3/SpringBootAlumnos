package com.tresct.demoRecord.controller;

import com.tresct.demoRecord.Service.AlumnoService;
import com.tresct.demoRecord.model.AlumnoModelo;
import com.tresct.demoRecord.model.AlumnoRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("api")
public class AlumnoController {

    private AlumnoService alumnoService;


    @GetMapping("v2/alumnos/{curso}")
    public List<Integer> alumnosSinRedundancia(@PathVariable String curso) {
        return alumnoService.alumnosSinRedundancia(curso);
    }
    @GetMapping("v1/alumnos/{curso}")
    public List<AlumnoRecord> alumnos(@PathVariable String curso) {

        return alumnoService.alumnos(curso);
    }

    @GetMapping("v1/alumnos")
    public List<AlumnoRecord> lista() {
        return alumnoService.lista();
    }
}
