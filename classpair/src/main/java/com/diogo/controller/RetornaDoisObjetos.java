package com.diogo.controller;

import com.diogo.model.Endereco;
import com.diogo.model.Pessoa;
import com.sun.tools.javac.util.Pair;


public class RetornaDoisObjetos {   
   
    public Pair<Pessoa,Endereco> getPessoaComEndereco(){
        //definido os objetos para retornar
        Pessoa p = new Pessoa();
        p.setNome("Diogo Paza");
        p.setIdade(39);
        Endereco e = new Endereco();
        e.setRua("Avenida Brasil");
        e.setNumero(880);

        return new Pair<Pessoa,Endereco>(p,e);
    }
}
