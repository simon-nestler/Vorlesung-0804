public class App {
    public static void main(String[] args) throws Exception {
        Person max = new Person("Max");
        max.getUrahnin().sagHallo();

        System.out.println("------------------");

        Person p = max;
        do {
            p.sagHallo();
            p = p.getMutter();
        } while (p != null);

    }
}
