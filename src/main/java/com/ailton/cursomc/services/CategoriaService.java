package com.ailton.cursomc.services;

import com.ailton.cursomc.domain.Categoria;
import com.ailton.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria buscar(Integer id){
      Optional<Categoria> obj = repository.findById(id);
      return obj.orElse(null);
    }

}
