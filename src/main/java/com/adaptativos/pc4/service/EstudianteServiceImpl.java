package com.adaptativos.pc4.service;

import com.adaptativos.pc4.domain.Estudiante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

    final List<Estudiante> estudiantes = new ArrayList<Estudiante>();

    @Override
    public List<Estudiante> listarEstudiantes() {

        estudiantes.clear();

        estudiantes.add(new Estudiante("Oscar Andres, Lobaton Salas","20181122K","oscar.lobaton.s@uni.pe"));
        estudiantes.add(new Estudiante("Moises Fernando, Mamani Mamani","20181003A","moises.mamani.m@uni.pe"));
        estudiantes.add(new Estudiante("Edgar Fernando, Carrion Ccoicca","20181174K", "edgar.carrion.c@uni.pe"));
        estudiantes.add(new Estudiante("Jake Robinson Anghelo, Tello Vallejo","20182502A", "jake.tello.v@uni.pe"));
        estudiantes.add(new Estudiante("Luis Valentin, Vilcabana Reyes","20184516J", "luis.vilcabana.r@uni.pe"));
        estudiantes.add(new Estudiante("Patrick David, Huillca Herrera","20181098B", "patrick.huillca.h@uni.pe"));
        estudiantes.add(new Estudiante("Juan Carlos, Garibay Fernandez","20181137H", "juan.garibay.f@uni.pe"));
        estudiantes.add(new Estudiante("Carolina, Aliaga Vasquez","20184520G ", "carolina.aliaga.v@uni.pe"));
        estudiantes.add(new Estudiante("Mauricio Antonio, Lovon Guelespe","20182556D", "mauricio.lovon.g@uni.pe"));
        estudiantes.add(new Estudiante("Angel, Quispe Apolinario","20189504J ", "angel.quispe.a@uni.pe"));


        return estudiantes;
    }
}
