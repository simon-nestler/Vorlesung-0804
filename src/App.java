public class App {
    public static void main(String[] args) throws Exception {
        Object[] personen = new Object[10];

        personen[0] = new Person("Max");
        personen[1] = new Person("Peter");
        personen[2] = new Person("Anna");

        for (int i = 0; i < personen.length; i++) {
            if (personen[i] != null) {
                System.out.println(personen[i]);
            }
        }
    }
}
