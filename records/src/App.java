
public class App {

    public static void main(String[] args) {
        var person = new Person("João", 12); //usada para não ter alteração de valor no objeto, vai ser como se fosse uma variavel constante
        System.out.println("person : " + person.name() + " " + person.age() + " " + person);

    }
}
