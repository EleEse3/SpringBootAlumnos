package com.tresct.demoRecord.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class AlumnoModelo {

    public List<AlumnoRecord> lista = new ArrayList<>();

    public AlumnoModelo() {
        lista.add(new AlumnoRecord("Leonardo", 9, "Java Backend"));
        lista.add(new AlumnoRecord("Rocio", 8, "Java Backend"));
        lista.add(new AlumnoRecord("Ana", 9, "Oracle"));
        lista.add(new AlumnoRecord("Mario", 9, "MySQLite"));
        lista.add(new AlumnoRecord("Angel", 7, "Oracle"));
    }
}
