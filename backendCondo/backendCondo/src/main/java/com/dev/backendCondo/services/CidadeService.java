package com.dev.backendCondo.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backendCondo.entity.Cidade;
import com.dev.backendCondo.repository.CidadeRepository;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public List<Cidade> buscarTodos(){
        return cidadeRepository.findAll();
    }

    public Cidade inserir(Cidade cidade){
        cidade.setDataCriacao(new Date());
        Cidade cidadenova = cidadeRepository.saveAndFlush(cidade);
        return cidadenova;
    }

    public Cidade alterar(Cidade cidade){
         cidade.setDataAtualizacao(new Date());
        return cidadeRepository.saveAndFlush(cidade);
    }

    public void excluir(Long id){
        Cidade estado = cidadeRepository.findById(id).get();
        cidadeRepository.delete(estado);
    }
    
}
