package com.crud.pessoa.Controller;


import com.crud.pessoa.Model.EscolaModel;
import com.crud.pessoa.Service.EscolaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/pessoas")
public class EscolaController {
    @Autowired
    private EscolaService escolaService;

    @GetMapping
    public List<EscolaModel> listar(){
        return escolaService.listar();
    }

    @PostMapping
    public EscolaModel cadastrar(@RequestBody EscolaModel escolaModel){
        return escolaService.salvar(escolaModel);
    }
}
