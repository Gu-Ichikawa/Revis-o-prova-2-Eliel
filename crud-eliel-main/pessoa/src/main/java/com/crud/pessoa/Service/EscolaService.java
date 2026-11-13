package com.crud.pessoa.Service;

import com.crud.pessoa.Model.EscolaModel;
import com.crud.pessoa.Repository.EscolaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EscolaService {

    @Autowired
    private EscolaRepo escolaRepo;

    public List<EscolaModel> listar(){
        return escolaRepo.findAll();
    }

    public EscolaModel salvar(EscolaModel escolaModel){
        return escolaRepo.save(escolaModel);
    }

    public void deletar(Long id){
        escolaRepo.deleteById(id);
    }

    public EscolaModel buscarPorId(Long id){
        return escolaRepo.findById(id).orElse(null);
    }

    public EscolaModel buscarPorNome(String nome){
        return escolaRepo.findByNome(nome);
    }
}
