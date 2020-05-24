package com.olmedo.laboratorio5.Domain;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(schema="public",name="estudiante")
public class Estudiante {
    @Id
    @Column(name="c_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoEstudiante;

    @Column(name="nombre")
    @NotEmpty(message = "El nombre del estudiante no puede estar vacio")
    private String Nombre;


    @Column(name="apellido")
    @NotEmpty(message = "El apellido del estudiante no puede estar vacio")
    private String Apellido;

    @Column(name = "carne")
    @NotEmpty(message = "El carnet del estudiante no puede estar vacio")
    private String Carne;

    @Column(name = "carrera")
    @NotEmpty(message = "La carrera del estudiante no puede estar vacio")
    private String Carrera;

    public Estudiante() {
    }

    public Integer getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(Integer codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCarne() {
        return Carne;
    }

    public void setCarne(String carne) {
        Carne = carne;
    }


    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

}
