public class Main {
    public static void main(String[] args) {
        // Operador lógico E (AND) - && -- dica: os dois lados precisam ser verdadeiros
        // para retornar verdadeiro (caso tenha um lado falso, ele retornará falso)
        System.out.printf("true  && true  = %s \n", true && true);
        System.out.printf("false && false = %s \n", false && false);
        System.out.printf("true  && false = %s \n", true && false);
        System.out.printf("false && true  = %s \n", false && true);

        System.out.println("==================================");

        // Operador lógico OU (OR) - || -- dica: apenas um lado precisa ser verdadeiro
        // para retornar verdadeiro (caso ambos os lados false, ele retornará falso)
        System.out.printf("true  || true  = %s \n", true || true);
        System.out.printf("false || false = %s \n", false || false);
        System.out.printf("true  || false = %s \n", true || false);
        System.out.printf("false || true  = %s \n", false || true);

        System.out.println("==================================");

        // Operador lógico de negação (NOT) - ! -- dica: sempre será o resultado oposto
        System.out.printf("!true  = %s \n", !true);
        System.out.printf("!false = %s \n", !false);
    }
}
