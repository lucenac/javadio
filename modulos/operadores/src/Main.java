public class Main {

    public static void main(String[] args) {
        // Operadores Aritméticos
        int soma = 5 + 3;           // Adição
        int subtracao = 5 - 3;      // Subtração
        int multiplicacao = 5 * 3;  // Multiplicação
        int divisao = 5 / 3;        // Divisão (inteira)
        int resto = 5 % 3;          // Módulo (resto da divisão)

        // Operadores de Atribuição
        int a = 5;   // Atribuição simples
        a += 3;      // Atribuição com adição (a = a + 3)
        a -= 3;      // Atribuição com subtração (a = a - 3)
        a *= 3;      // Atribuição com multiplicação (a = a * 3)
        a /= 3;      // Atribuição com divisão (a = a / 3)
        a %= 3;      // Atribuição com módulo (a = a % 3)

        // Operadores de Incremento e Decremento
        int b = 5;
        b++;         // Incremento (b = b + 1)
        b--;         // Decremento (b = b - 1)
        ++b;         // Pré-incremento
        --b;         // Pré-decremento

        // Operadores Relacionais
        boolean igual = (5 == 3);   // Igualdade
        boolean diferente = (5 != 3); // Diferença
        boolean maior = (5 > 3);    // Maior que
        boolean menor = (5 < 3);    // Menor que
        boolean maiorOuIgual = (5 >= 3); // Maior ou igual a
        boolean menorOuIgual = (5 <= 3); // Menor ou igual a

        // Operadores Lógicos
        boolean e = (true && false); // E lógico
        boolean ou = (true || false); // OU lógico
        boolean nao = !true;         // NÃO lógico

        // Operador Ternário
        int idade = 18;
        String mensagem = (idade >= 18) ? "Maior de idade" : "Menor de idade";

        // Operadores Bitwise
        int bitwiseE = 5 & 3;        // E bit a bit
        int bitwiseOu = 5 | 3;       // OU bit a bit
        int bitwiseXor = 5 ^ 3;      // XOR bit a bit
        int bitwiseNot = ~5;         // NOT bit a bit
        int deslocaEsq = 5 << 1;     // Deslocamento à esquerda
        int deslocaDir = 5 >> 1;     // Deslocamento à direita
        int deslocaDirZero = 5 >>> 1; // Deslocamento à direita com zero preenchendo

        // Exibindo resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);
        System.out.println("Atribuição: " + a);
        System.out.println("Incremento: " + b);
        System.out.println("Igualdade: " + igual);
        System.out.println("Diferença: " + diferente);
        System.out.println("Maior que: " + maior);
        System.out.println("Menor que: " + menor);
        System.out.println("Maior ou igual: " + maiorOuIgual);
        System.out.println("Menor ou igual: " + menorOuIgual);
        System.out.println("E lógico: " + e);
        System.out.println("OU lógico: " + ou);
        System.out.println("NÃO lógico: " + nao);
        System.out.println("Operador Ternário: " + mensagem);
        System.out.println("Bitwise E: " + bitwiseE);
        System.out.println("Bitwise OU: " + bitwiseOu);
        System.out.println("Bitwise XOR: " + bitwiseXor);
        System.out.println("Bitwise NOT: " + bitwiseNot);
        System.out.println("Deslocamento à esquerda: " + deslocaEsq);
        System.out.println("Deslocamento à direita: " + deslocaDir);
        System.out.println("Deslocamento à direita com zero preenchendo: " + deslocaDirZero);
    }
}
