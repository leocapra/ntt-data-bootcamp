public class Main {

    // lista de keywords: https://www.w3schools.com/java/java_ref_keywords.asp
    // lista de tipos primitivos: https://www.w3schools.com/java/java_data_types.asp

    public static void main(String[] args) {

        // Tipos inteiros:

        byte smallNumber = 100; // 8 bits, de -128 a 127 (ideal para economia de memória)
        short shortNumber = 30000; // 16 bits, de -32.768 a 32.767
        int number = 1000000; // 32 bits, de -2.147.483.648 a 2.147.483.647 (mais usado)
        long bigNumber = 10000000000L; // 64 bits, precisa do 'L' no final

        // Tipos de ponto flutuante (números com vírgula):

        float price = 19.99f; // 32 bits, precisa do 'f' no final
        double pi = 3.1415926535; // 64 bits, mais preciso (padrão para decimais)

        // Tipo booleano (verdadeiro ou falso):

        boolean isJavaFun = true;
        boolean isFishTasty = false;

        // Tipo caractere (um único caractere Unicode):

        char letter = 'A'; // Usa aspas simples

        System.out.println("byte: " + smallNumber);
        System.out.println("short: " + shortNumber);
        System.out.println("int: " + number);
        System.out.println("long: " + bigNumber);
        System.out.println("float: " + price);
        System.out.println("double: " + pi);
        System.out.println("boolean 1: " + isJavaFun);
        System.out.println("boolean 2: " + isFishTasty);
        System.out.println("char: " + letter);
    }
}
