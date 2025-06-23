
public class App {

    public static void main(String[] args) {
        var male = new Person();
        male.setName("João");
        male.setAge(18);

        var female = new Person();
        female.setName("Maria");
        female.setAge(21);

        System.out.printf("Male name %s \n \n Female name %s \n", male.getName(), female.getAge());
    }
}
