package com.kaiquematos.cursomc.Services;

import com.kaiquematos.cursomc.domain.Categoria;
import com.kaiquematos.cursomc.repositories.CategoriaRepository;
import com.kaiquematos.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        if (obj == null) {
            throw new ObjectNotFoundException("Objeto não encontrado! Id" + id
            + ", Tipo: " + Categoria.class.getName());

        }
        return obj.orElse(null);
    }
}