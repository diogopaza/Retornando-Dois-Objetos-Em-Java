package com.diogo;

import com.diogo.controller.RetornaDoisObjetos;
import com.diogo.model.Endereco;
import com.diogo.model.Pessoa;
import com.sun.tools.javac.util.Pair;

public class App {
    public static void main(String[] args) {

        RetornaDoisObjetos retornaDosObjetos = new RetornaDoisObjetos();
        Pair<Pessoa, Endereco> pair = retornaDosObjetos.getPessoaComEndereco();

        System.out.println(String.format("A pessoa %s de idade %d anos,"
                + "mora na rua %s numero %d",
                pair.fst.getNome(), pair.fst.getIdade(),
                pair.snd.getRua(), pair.snd.getNumero()));
        System.out.println("hello");
    }
}
