package com.olmedo.laboratorio5.Service;

import com.olmedo.laboratorio5.Domain.Estudiante;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface EstudianteService {
    public List<Estudiante> findAll() throws DataAccessException;

    public Estudiante findOne(Integer code) throws DataAccessException;

    public void insertEstudiante(Estudiante estudiante) throws DataAccessException;

    public void eliminarEstudiante(Integer code) throws DataAccessException;
}
