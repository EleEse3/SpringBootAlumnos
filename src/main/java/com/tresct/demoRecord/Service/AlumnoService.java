package com.tresct.demoRecord.Service;

import com.tresct.demoRecord.model.AlumnoRecord;
import com.tresct.demoRecord.model.AlumnoModelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlumnoService {
    @Autowired
    private AlumnoModelo alumnoModelo;

    @GetMapping("v2/alumnos/{curso}")
    public List<Integer> alumnosSinRedundancia(@PathVariable String curso) {
        return alumnoModelo.lista.stream()
                .filter(alumno -> alumno.curso().equals(curso))
                .map(alumno -> alumno.calif())
                .collect(Collectors.toList());
    }
    @GetMapping("v1/alumnos/{curso}")
    public List<AlumnoRecord> alumnos(@PathVariable String curso) {

        return alumnoModelo.lista.stream().filter(alumno -> alumno.curso().equals(curso)).collect(Collectors.toList());
    }

    @GetMapping("v1/alumnos")
    public List<AlumnoRecord> lista() {
        return alumnoModelo.lista;
    }
}
