package com.adaptativos.pc4;

import com.adaptativos.pc4.domain.Estudiante;
import com.adaptativos.pc4.service.EstudianteServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Pc4AdaptativesApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test1(){

        Estudiante estudiante = new Estudiante("Roberto", "2005205R", "roberto@abierto.com");

        Assertions.assertEquals(estudiante.getName(),"Roberto");


    }

    @Test
    public void test2(){

        EstudianteServiceImpl estudianteService = new EstudianteServiceImpl();

        final List<Estudiante> list = estudianteService.listarEstudiantes();

        Assertions.assertEquals(((Object) list).getClass().getSimpleName(), ArrayList.class.getSimpleName());

    }

    @Test
    public void test3(){

        Estudiante estudiante = new Estudiante();

        Assertions.assertNotEquals(estudiante.getName(), "Roberto");


    }

}
