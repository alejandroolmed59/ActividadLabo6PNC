package com.olmedo.laboratorio5.Service;

import com.olmedo.laboratorio5.Dao.EstudianteDAO;
import com.olmedo.laboratorio5.Domain.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class EstudianteServiceImp implements  EstudianteService{

    @Autowired
    EstudianteDAO estudianteDAO;


    public List<Estudiante> findAll() throws DataAccessException {
        return estudianteDAO.findAll();
    }


    public Estudiante findOne(Integer code) throws DataAccessException {
        return  estudianteDAO.findOne(code);
    }


    @Transactional
    public void insertEstudiante(Estudiante estudiante) throws DataAccessException {
        estudianteDAO.insertEstudiante(estudiante);
    }
    @Transactional
    public void eliminarEstudiante(Integer code) throws DataAccessException {
        estudianteDAO.eliminarEstudiante(code);
    }

}
