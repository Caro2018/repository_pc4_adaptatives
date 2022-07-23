package com.adaptativos.pc4.domain;
import java.io.Serializable;



public class Estudiante implements Serializable {

    private String name;

    private String code;

    private String email;

    public Estudiante() {
    }

    public Estudiante(String name, String code, String email) {
        this.name = name;
        this.code = code;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
