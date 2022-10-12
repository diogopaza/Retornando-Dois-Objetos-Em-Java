package classpair.src.main.java.com.diogo;

import com.sun.tools.javac.util.Pair;
import classpair.src.main.java.com.diogo.controller.ObjetosComClassePair;
import classpair.src.main.java.com.diogo.model.Endereco;
import classpair.src.main.java.com.diogo.model.Pessoa;

public class App {
    public static void main(String[] args) {

        ObjetosComClassePair objPair = new ObjetosComClassePair();
        Pair<Pessoa, Endereco> pair = objPair.getPessoaComEndereco();

        System.out.println(String.format("A pessoa %s de idade %d anos,"
                + "mora na rua %s numero %d",
                pair.fst.getNome(), pair.fst.getIdade(),
                pair.snd.getRua(), pair.snd.getNumero()));
        System.out.println("hello");
    }
}
