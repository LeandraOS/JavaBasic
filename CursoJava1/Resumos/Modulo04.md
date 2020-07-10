## Índice

# :computer: Introdução à Programação

## Algoritmos
Sequência lógica de passos do programa, que pode ser expressa em qualquer linguagem de programação.

<img>
Existem várias formas informais para se escrever rascunhos de códigos, dentre as mais utilizadas encontram-se:

- **Descrição narrativa**: que é uma representação textual simples das instruções do algoritmo.
Esta forma é **pouco** utilizada, pois, as instruções podem ser ambíguas e de difícil representação em uma linguagem de programação.

- **Diagramas de Chapin**: são uma representação gráfica das instruções de um algoritmo de forma *hierárquica e estruturada*. São pouco usados em desenvolvimento de programas, mas bastante representativos.

- **Fluxogramas**: também conhecidos como diagrama de blocos, que utilizam figuras geométricas para identificar tipos diferentes de instruções.
São bastante utilizados para representar algoritmos, inclusive em outras áreas além da programação.

<img>

- **Pseudocódigo**: também conhecido como ***português estruturado*** ou portugol. É uma representação de algoritmos baseada nas regras da linguagem [pascal]().
Esta forma de representação, junto com os fluxogramas, são uma das mais utilizadas para se representar algoritmos em programação.

<img>

## Escrevendo algoritmos em pseudocódigo
Todo algoritmo em pseudocódigo deve ser escrito utilizando uma estrutura básica, mostrada abaixo:

<img>

## Variáveis

A memória de um computador pode ser vista como um conjunto de células, onde dados de diversos tipos podem ser armazenados.
Cada uma das células de memória é identificada por um **endereço númerico**.
    Assim, para acessar um determinado dado na memória, seria necessário conhecer a posição inicial deste dado na mémoria e quantos bytes foram usados para armazená-lo.

Para facilitar que os programadores acessem esses dados de forma facilitada, criou-se o conceito de **variável**.
:warning: Cada variável representa uma ou mais posições de memória onde um determinado dado encontra-se armazenado.
<img>

### Definição de nome da variável

Toda variável possui um nome que tem a função de diferencia-la das demais.
Cada linguagem de programação estabelece as suas próprias regras de formação de nomes de variáveis.
    
As regras mais adotadas são as seguintes:
- [X] Nome de variável deve necessariamente começar com uma letra ou sublinhado.
- [X] Um nome de variável não deve conter nenhum símbolo especial, exceto o sublinhado.
- [X] Após o primeiro caractere podem ser empregados dígitos numéricos.
- [X] Não pode haver espaços em branco entre os caracteres, para substituí-los use o sublinhado.
- [X] Devem ser evitadas letras com acentuação.

**Exemplos**:

Variável| Corretude
:---:|:---:
salario|:heavy_check_mark:
1ano| :x:
ano1|:heavy_check_mark:
a casa| :x:
sal/hora|:x:
sal_hora|:heavy_check_mark:
_desconto|:heavy_check_mark:

### Tipos de variáveis 

O tamanho de uma variável é definido pelo seu tipo. O tipo de uma variável define quais dados podemos atribuir a ela. Mas quais tipos podemos associar a uma variável ?

A maioria das linguagens de programação de alto nível trabalham com cinco tipos de dados básicos, chamados **tipos primitivos**.

Tipo| Definição
:---:| :---
**inteiro**| Todos os números positivos, negativos e o zero.
**real**| Números com parte fracionária.
**lógico**| Valores verdadeiros (true) ou falsos (false).
**caractere**| Símbolos alfanúmericos, letras, algarismos, sinais de pontuação e qualquer outro símbolo válido. São representados entre aspas simples (' ').
**literal**| Também chamado de cadeia de caractere ou **string**. Armazena uma sequência de caracteres alfanúmericos. Devem ser representados entre aspas duplas (" ").
