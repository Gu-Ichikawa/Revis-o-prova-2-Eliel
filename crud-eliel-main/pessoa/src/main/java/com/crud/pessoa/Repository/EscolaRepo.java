package com.crud.pessoa.Repository;

import com.crud.pessoa.Model.EscolaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EscolaRepo extends JpaRepository<EscolaModel,Long> {

    EscolaModel findByNome(String nome);

}
