
import java.util.Scanner;

public class Main {
    private final static String WELCOME_MESSAGE = "Informe seu nome";// variavel constante

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        String name = scanner.next();
        System.out.println("Nome " + name + " Armazenado com sucesso!");
        System.out.println("Agora informe sua idade");
        int age = scanner.nextInt();
        System.out.println("Idade " + age + " Armazenado com sucesso!");
        System.out.println("Prazer " + name + "! me chamo java, espero que possamos nos dar bem :)");
        System.out.printf("É bom saber que você tem %s anos %s! \n", age, name);
    }
}
