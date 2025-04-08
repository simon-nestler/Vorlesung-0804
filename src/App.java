public class App {
    public static void main(String[] args) throws Exception {
        Person[] personen = new Person[10];

        personen[0] = new Person("Max");
        personen[1] = new Person("Peter");
        personen[2] = new Person("Anna");

        for (int i = 0; i < personen.length; i++) {
            if (personen[i] != null) {
                personen[i].sagHallo();
            }
        }
    }
}
