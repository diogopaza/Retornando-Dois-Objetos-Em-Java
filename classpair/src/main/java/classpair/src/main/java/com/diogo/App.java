package classpair.src.main.java.com.diogo;

import com.sun.tools.javac.util.Pair;

import classpair.src.main.java.com.diogo.controller.ObjetosComClassePair;
import classpair.src.main.java.com.diogo.model.Endereco;
import classpair.src.main.java.com.diogo.model.Pessoa;


public class App {
    public static void main(String[] args) {

        ObjetosComClassePair objPair = new ObjetosComClassePair();
        Pair<Pessoa, Endereco> pair = objPair.getPessoaComEndereco();

        System.out.println(String.format("A pessoa %s mora na rua %s",
                pair., pair.getValue().getRua()));

        System.out.println("hello");
    }
}
