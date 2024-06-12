public class Main {

    public static void main(String[] args) {
        // Tipos Primitivos:
        // Inteiros
        byte umByte = 127;       // 8 bits, de -128 a 127
        short umShort = 32767;   // 16 bits, de -32.768 a 32.767
        int umInt = 2147483647;  // 32 bits, de -2^31 a 2^31-1
        long umLong = 9223372036854775807L; // 64 bits, de -2^63 a 2^63-1

        // Ponto Flutuante
        float umFloat = 3.14f;   // 32 bits, precisão simples
        double umDouble = 3.141592653589793; // 64 bits, precisão dupla

        // Caractere
        char umChar = 'A';       // 16 bits, representa um único caractere Unicode

        // Booleano
        boolean umBoolean = true; // 1 bit, true ou false

        // Variáveis de Referência:
        // Strings
        String umaString = "Olá, Mundo!"; // Cadeia de caracteres

        // Arrays
        int[] umArray = {1, 2, 3, 4, 5}; // Array de inteiros

        // Declaração de Variáveis
        int idade; // Declaração
        idade = 25; // Inicialização
        int altura = 180; // Declaração e inicialização

        // Variáveis Constantes (final)
        final double PI = 3.14159; // Valor constante, não pode ser alterado

        // Conversão de Tipos
        double d = 10.5;
        int i = (int) d; // Conversão explícita (type casting) de double para int

        // Promoção de Tipos
        int a = 10;
        double b = a; // Promoção automática de int para double

        // Exibindo valores
        System.out.println("Byte: " + umByte);
        System.out.println("Short: " + umShort);
        System.out.println("Int: " + umInt);
        System.out.println("Long: " + umLong);
        System.out.println("Float: " + umFloat);
        System.out.println("Double: " + umDouble);
        System.out.println("Char: " + umChar);
        System.out.println("Boolean: " + umBoolean);
        System.out.println("String: " + umaString);
        System.out.println("Array: " + umArray[0]);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("PI: " + PI);
        System.out.println("Double para Int: " + i);
        System.out.println("Int para Double: " + b);
    }
}
