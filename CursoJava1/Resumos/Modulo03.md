## índice

- [Classificação dos softwares](#pencil-classificação-dos-softwares)
- [Como um programa é construído?](#como-um-programa-é-construído)
- [Compilação](#compilação)
- [Interpretação](#interpretação)
- [Compilação vs interpretação](#compilação-vs-interpretação)
- [Fazendo programas em Java funcionar](#arrow_forward-fazendo-programas-em-java-funcionar)
- [Compilar o código-fonte do programa](#page_facing_up-compilar-o-código-fonte-do-programa)
- [Resumo do processo utilizado por java](#coffee-resumo-do-processo-utilizado-por-java)

# :bookmark_tabs: O software

## :pencil: Classificação dos softwares
 A maioria dos autores os classificam da seguinte forma:
  - :clipboard: **Softwares de sistema**: são os que fornecem suporte para a execução de outros programas.
  - :bar_chart: **Aplicativos**: são os que funcionam com o apoio de softwares de sistema e fornecem alguma funcionalidade.
  - :chart_with_downwards_trend: **Softwares embarcados**: são programas gravados diretamente em um chip. Exemplos incluem a BIOS(Basic Input Output System) e alguns
  softwares utilizados para controle, principalmente na indústria.
  
## Como um programa é construído?

As linguagens de programação. Através delas é possível criar um programa usando palavras e símbolos.
As CPUs, entendem somente a linguagem de máquina. Logo é necessário um processo de tradução, onde o texto em linguagem de programação é convertido para a linguagem de máquina da CPU.

![traducao](https://github.com/LeandraOliveiraS/JavaBasic/blob/master/CursoJava1/imagens/5-traducao.png?raw=true")

Nas linguagens de alto nível este processo pode ser realizado de duas formas diferentes: utilizando **compilação** ou **interpretação**.

## Compilação

Na compilação, o programa escrito em linguagem de alto nível é **transformado de uma só vez** em um *programa de linguagem de máquina*.
O programa gerado pode ser armazenado em um meio permanente como o disco rígido, e executado sempre que necessário pela CPU, sem passar pelo processo novamente.
**A compilação** é um processo bastante complexo, sendo realizada por programas específicos chamados: *compiladores*.

![compilacao](https://github.com/LeandraOliveiraS/JavaBasic/blob/master/CursoJava1/imagens/6-compilacao.png?raw=true)


Ao programa escrito em linguagem de programação dá-se o nome de `código-fonte`.
O código-fonte, então é submetido ao compilador a fim de gerar o programa em linguagem de máquina, que é chamado de *programa executável*. Este programa pode ser enviado à CPU para execução.

## Interpretação
Ao contrário do que ocorre na **compilação**, o processo de interpretação lê **cada instrução do programa-fonte**, transforma-o em código de máquina e o executa. Nenhum programa executável é gerado.
O responsável por realizar esse processo é um programa chamado: *interpretador*.
 
![intepretacao](https://github.com/LeandraOliveiraS/JavaBasic/blob/master/CursoJava1/imagens/10-interpretacao.png?raw=true)

## Compilação vs Interpretação

A vantagem da tradução por [compilação](#Compilação) é que a execução do programa é mais **rápida**, pois não é necessário executar o interpretador e transformar as instruções em linguagem de máquina a cada execução do programa.
Por outro lado, os compiladores costumam **gerar códigos de máquinas específicos** para determinados processadores.
Logo, se o programa deve ser executado em processadores diferentes, então deve ser compilado para cada um deles.
Por isso é comum haver várias versões do mesmo programa para download em cada sistema operacional.

O processo de [interpretação](#Interpretação), neste caso, apresenta uma vantagem, pois não é necessário gerar uma versão do programa para processadores e sistemas operacionais diferentes.
Instala-se a versão apropriada do interpretador em cada computador e copia-se o `código-fonte` do programa.
Com isso, basta executá-lo diretamente, através do interpretador. Um exemplo, são os programas escritos na linguagem JavaScript e interpretado pelo Node.js.

Algumas linguagens tentaram explorar o melhor dos dois mundos.                                                                                                         O exemplo mais conhecido é o da linguagem Java. Programas em java são compilados para uma linguagem intermediária chamada de **bytecode**.
    O bytecode por sua vez, é executado por um interpretador chamado de JVM(Java Virtual Machine).
    
   Como o bytecode é interpretado mais rapidamente do que o código-fonte java do programa, assim, consegue-se um desempenho próximo ao de um programa compilado com a vantagem de poder executá-lo em qualquer computador que possua a JVM instalada.
 
### :arrow_forward: Fazendo programas em Java funcionar

- O nome do arquivo .java deve ter o **mesmo** nome da classe utilizada no código-fonte.
- Javac, é o compilador Java.
- java, a JVM em linha de comando para a execução de programas compilados em bytecode.

## :page_facing_up: Compilar o código-fonte do programa

`javac nomeDaClasse.java`

:warning: Após essa compilação, o Javac gera um arquivo **nomeDaClasse.class**. Ele contém os bytecodes que serão enviados para o interpretador.

Com o código do programa em bytecode gerado pelo compilador(*Javac*), pode-se **executar o programa** utilizando a JVM, através deste comando:

`java nomeDaClasse`

Esse comando faz com que o interpretador de bytecode do java, a JVM, traduza as instruções do programa para a CPU.

### :coffee: Resumo do processo utilizado por java

 <img src="https://github.com/LeandraOliveiraS/JavaBasic/raw/master/CursoJava1/imagens/java.png?raw=true" alt="diagrama" width= "30%;" height= "30%">

 

 
 
