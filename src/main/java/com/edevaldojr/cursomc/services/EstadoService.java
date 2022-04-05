package com.edevaldojr.cursomc.services;

import java.util.List;

import com.edevaldojr.cursomc.domain.Estado;
import com.edevaldojr.cursomc.repositories.EstadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoService {
 
    @Autowired
    private EstadoRepository repo;
    
    public List<Estado> findAll() {
        return repo.findAllByOrderByNome();
    }
}
