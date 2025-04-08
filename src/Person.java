public class Person {
    private String name;
    private Person mutter;

    public Person(String name) {
        this.name = name;
        System.out.println(this);

        this.mutter = new Person(this);
        new Person(new Person(new Person(new Person(this.mutter))));
    }

    public Person(Person kind) {
        this.name = "Mutter von " + kind.getName();
        kind.setMutter(this);
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setMutter(Person mutter) {
        this.mutter = mutter;
    }

    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                '}';
    }

    public void sagHallo() {
        System.out.println("Hallo, ich bin " + name);
    };
}
