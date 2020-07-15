# :coffee: Introdução à linguagem Java

## Estrutura básica de um programa Java

`public class`
- Esta linha define uma classe pública.Sendo assim, essa classe pode ser acessada fora do arquivo onde foi definida e pela máquina virtual.

`public static void main(String[] args)`

- Este é o método que a máquina virtual espera encontrar as instruções do programa para **execução**.

## Variáveis e tipos de dados em Java

Java é uma linguagem altamente **tipada**.

O que significa que cada variável deve ter o seu tipo declarado antes do uso. Sem isso, o código não irá ser compilado.

### Tipos de dados em Java

#### Inteiro:

Se é desejado escrever valores de outros tipos inteiros, é preciso acrescentar letras ao final do número, para informar a java qual tipo queremos utilizar.
- Para o tipo byte, é utilizado a letra B
- Para o tipo short, é utilizado a letra S
- Para o tipo long, é utilizado a letra L.

Tipo|Tamanho|Exemplo
:---:|:---:| :---:
byte| 8 bits| 12B
short|16 bits|345S
int|32 bits|578
long|64 bits|1000001L

#### Real:

Para designar que um valor seja interpretado como `float`, é necessário acrescentar o F ao final do número.

Tipo|Tamanho|Exemplo
:---:|:---:|:---:
float| 32 bits| 3.456F
double| 64 bits| 86.987

#### Lógico
Os valores do tipo **boolean** utilizam as palavras em inglês `true` e `false` (em letras minúsculas).

#### Literal

- Valores do tipo `char` devem ser escritos entre aspas simples ('').

- Os valores do tipo `String` devem ser escritos entre aspas duplas ("").

## Entrada de dados

Neste curso,orientação a objetos não está sendo ensinado. Logo, a entrada não utiliza o objeto Scanner, a entrada de dados é feita dessa maneira:
 
`System.console.readLine()`

A sua função é ler entradas diretamente do console.

:warning:Obs: Todas as entradas, são recebidas como String, por isso, é necessário o método de conversão de tipos.

Converte de String para|Método
:---:| :---
**boolean**|Boolean.parseBoolean(variavel)
**byte**   |    Byte.parseByte(variavel)
**double** | Double.parseDouble(variavel)
**float**  |  Float.parseFloat(variavel)
**int**|  Integer.parseInt(variavel)
**long**   | Long.parseLong(variavel)
**short**  |Short.parseShort(variavel)

:warning: Note que não existe um método de conversão para o tipo **char**.
 
Para fazer a leitura desse tipo de dado, pode-se fazer a leitura de um valor String e depois extrair o primeiro caractere dessa String, utilizando o método charAt, como mostrado:

`System.console.readLine.charAt(0);`

## Expressões

Símbolo| Operação
:---:| :---:
+|Adição
-|Subtração
*|Multiplicação
/|Divisão
/|Divisão inteira
%|Resto da divisão (mod)

:warning: **Divisão inteira:**
- Quando houver pelo menos um valor double ou float envolvido em uma divisão, o resultado será do tipo double ou float e uma divisão normal será efetuada.
- Quando dois valores inteiros estiverem envolvidos na divisão o resultado será um valor inteiro, logo, ocorre uma **divisão inteira**.

## Saída de dados

Existem três tipos de comandos que realizam a função de produzir saída de dados, são eles:

Comando| Funcionalidade
:---:|:---
System.out.println| Posiciona o cursor de saída no início da próxima linha na janela de comando do terminal.
System.out.print| Posiciona o cursor de saída logo na mesma linha.
System.printf| Possibilita se fazer uma saída de dados formatada.

> :warning: Para que o cursor seja posicionado no início da próxima linha utilizando o **System.out.print**, utilizamos o caractere especial de ***nova linha***, representado por `\n`.

## Formatação de String

Como mencionado anteriormente, o comando `System.out.printf` permite que façamos uma saída de dados formatada.

Qualquer sequência de caracteres começando com `%` será substituída pelo **valor** de uma variável ou expressão especificado logo após a String.

Deve haver variáveis e/ou expressões para cada padrão com `%` que aparece no valor String.

**Há padrões de especificação de formato `%` para vários tipos de dados, são eles:**

Formato| Funcionalidade
:---:|:---
"%%"|Mostra um sinal de **%**
"%d"|Permite mostrar valores **inteiros**.
"%f"|Permite mostrar valores **reais**.
"%.2f"| **.2** especifica a quantidade de casas decimais do número real, neste exemplo, o número possuirá duas.
"%b"|Permite exibir um valor **lógico**.
"%c"| Permite mostrar um valor **caractere**.
"%s"|Permite exibir um valor do tipo **String**.



> No caso da formatação que especifica a quantidade de casas decimais `%.2f`.
> - Se o número tiver **menos** casas do que é especificado, será **completado** com zeros à **direita**. 
>- Se tiver **mais** dígitos do que o especificado, será **arredondado** para o número de dígitos desejado.

#### Exemplo:
```
String frase = "ótimo dia"
System.out.printf("Desejamos um %s para você!", frase)
```
**Saída:**

>Desejamos um ótimo dia para você!

## Comentários em Java

Tipos| Funcionalidade
:---:|:---
//| Comentário de uma única linha.
/* */|Comentário de múltiplas linhas.
 
