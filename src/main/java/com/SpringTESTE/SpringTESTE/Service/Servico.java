package com.SpringTESTE.SpringTESTE.Service;

import com.SpringTESTE.SpringTESTE.Entity.Entidade;
import com.SpringTESTE.SpringTESTE.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Servico {

    @Autowired
    private Repository Repository;

    public List<Entidade> entidade(){
        return Repository.findAll();
    }

    public Optional<Entidade> entidade(Long id){
        return Repository.findById(id);
    }

    public Entidade save(Entidade entidade){
        return Repository.save(entidade);
    }

    public void delete(Long id){
        Repository.deleteById(id);

    }
}
