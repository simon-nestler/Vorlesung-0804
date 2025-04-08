public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                '}';
    }

    public void sagHallo() {
        System.out.println("Hallo, ich bin " + name);
    }
}
