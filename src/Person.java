public class Person {
    private String name;
    private Person mutter;

    public Person(String name) {
        this.name = name;
        System.out.println(this);
        new Person(new Person(new Person(new Person(new Person(this)))));
    }

    public Person(Person kind) {
        this.name = "Mutter von " + kind.getName();
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                '}';
    }
}
