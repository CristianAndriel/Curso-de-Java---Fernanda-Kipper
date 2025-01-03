// tem que ter ao menos uma classe com o nome da classe igual ao nome do arquiv
// a classe que for publica tem que ser a classe que tem o mesmo nome do arquivo

public class Main {

    public static void main(String[] args ) {
/* Como declaramos uma variável no Java?
// tipo | nome da variável | valor
        int minhaIdade = 20;

// Alterando o valor da variável
        minhaIdade = 22;

// No tipo 'var', o Java entende o tipo da variável pelo valor definido
        var nomeVariavel = "Cristian";

// Tipos primitivos

// Números inteiros
Exemplos: 100, 255, 120

        byte => 8 bits => -128 a 127
        short => 16 bits => -32.768 a 32.767
        int => 32 bits => -2.147.483.648 a 2.147.438.647 // Geralmente é o mais usado
        long => 64 bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 // Números gigantes

// String: Representa palavras e frases
        String minhaString = "Olá, mundo!";

// char: Representa um único caractere, como 'a', 'b', 'c'
        char meuChar = 'a';

// Atenção: No 'char', usamos aspas simples, não duplas
        meuChar = "a"; // Isso não será permitido, pois 'char' utiliza aspas simples

// boolean: Representa valores true ou false
        boolean meuBoolean = true;
*/

        byte b = 100;         // Declara uma variável do tipo byte com o valor 100
        short s = 10000;      // Declara uma variável do tipo short com o valor 10.000
        int i = 100000;       // Declara uma variável do tipo int com o valor 100.000
        long l = 1000000L;    // Declara uma variável do tipo long com o valor 1.000.000 (sufixo 'L' indica um long)
        float f = 10.5f;      // Declara uma variável do tipo float com o valor 10,5 (sufixo 'f' indica um float)
        double d = 20.5;      // Declara uma variável do tipo double com o valor 20,5
        char c = 'C';         // Declara uma variável do tipo char com o caractere 'C'
        String str = "Cristian"; // Declara uma variável do tipo String com o texto "Cristian"
        boolean bool = true;  // Declara uma variável do tipo boolean com o valor true

        if(bool) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }


        if(str.isBlank()) {
            System.out.println("Sim");

        } else if (str == "Cristian") {
                System.out.println("Ok!");

        } else  {
            System.out.println("Não");
        }
    }
}