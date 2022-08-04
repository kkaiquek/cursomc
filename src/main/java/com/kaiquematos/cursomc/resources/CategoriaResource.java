package com.kaiquematos.cursomc.resources;

import com.kaiquematos.cursomc.Services.CategoriaService;
import com.kaiquematos.cursomc.domain.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

@RequestMapping(method = RequestMethod.GET)
    public String listar() {
        return "REST está funcionando!";
    }
}