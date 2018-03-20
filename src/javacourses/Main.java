package javacourses;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Person> records = new ArrayList<>();

    public static void main(String[] args) {
        commandLoop();
    }

    private static void commandLoop() {
        for (; ; ) {
            String cmd = askString("cmd> ");

            switch (cmd.toLowerCase()) {
                case "exit":
                    return;
                case "create":
                    create();
                    break;
                case "list":
                    list();
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }

    private static void list() {
        for (Person p : records) {
            System.out.println(p);
        }
    }

    private static void create() {
        for (; ; ) {
            String type = askString("type: ");

            switch (type.toLowerCase()) {
                case "exit":
                    return;
                case "person":
                    createPerson();
                    return;
                default:
                    System.out.println("Unknown type");
            }
        }
    }

    private static void createPerson() {
        String firstName = askString("First Name: ");
        String lastName = askString("Last Name: ");
        String phone = askString("Phone: ");

        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setPhone(phone);

        records.add(person);
    }

    private static String askString(String message) {
        System.out.print(message);
        return scanner.next();
    }
}
