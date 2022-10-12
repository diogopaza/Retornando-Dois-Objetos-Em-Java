package classpair.src.main.java.com.diogo.controller;

import com.sun.tools.javac.util.Pair;
import classpair.src.main.java.com.diogo.model.Endereco;
import classpair.src.main.java.com.diogo.model.Pessoa;


public class ObjetosComClassePair {   
   
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
