# Retornando-Dois-Objetos-Em-Java

<p>Java não retorna vários valores por padrão através de um método.</p>
<p>Neste exemplo para retornar dois objetos é usada a classe <strong>Pair</strong>.</p> A classe Pair é importada através do pacote <em>com.sun.tools.javac.util.Pair</em>. 
<p>Para efeitos de teste são criadas duas classes dentro do pacote model, uma chamada Pessoa e outra Endereco. Essas classes possuem cada uma delas dois atributos sendo uma <em>String</em> e um <em>Integer</em>.</p>
<p>O objetivo deste trabalho é retornar dois objetos (classes instanciadas) com valores em seus respectivos atributos. Ou seja, instanciar a classe Pessoa atribuindo um nome e uma idade, instanciar a classe Endereco atribuindo uma rua e um numero, e retornar os dois objetos criados. Para isso será criada uma terceira classe no pacote controller que será responsável por ter um método retornando esses dois objetos.</p>
<p>A classe App terá o método <em>main</em> e irá receber os dois objetos através do método <em>getPessoaComEndereco</em> vindo da classe <em>RetornaDoisObjetos</em>. Para buscar os dados em cada objeto a classe <em>Pair</em> tem os métodos <em>fst</em> e <em>snd</em> representando respectivamente o primeiro e o segundo objeto passados como parâmetros.</p>

