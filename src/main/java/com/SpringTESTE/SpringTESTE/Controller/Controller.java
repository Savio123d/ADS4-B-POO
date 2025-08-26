package com.SpringTESTE.SpringTESTE.Controller;

import com.SpringTESTE.SpringTESTE.Entity.Entidade;
import com.SpringTESTE.SpringTESTE.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/Entidade")
public class Controller {

    @Autowired
    private Repository repo;

    @PostMapping
    public Entidade criarEntidade(@RequestBody Entidade entidade){
        return repo.save(entidade);
    }

    @GetMapping
    public List<Entidade> listarEntidades(){
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Entidade buscarFuncionarioPorId(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Entidade atualizarFuncionario(@PathVariable Long id, @RequestBody Entidade funcionario) {
        funcionario.setId(id);
        return repo.save(funcionario);
    }

    @DeleteMapping("/{id}")
    public void deletarFuncionario(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
