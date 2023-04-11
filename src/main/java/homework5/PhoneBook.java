package homework5;
/* Задача №1
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов. */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, ArrayList<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        ArrayList<String> numbers = phoneBook.getOrDefault(name, new ArrayList<>());
        numbers.add(phoneNumber);
        phoneBook.put(name, numbers);
    }

    public ArrayList<String> getNumbers(String name) {
        return phoneBook.get(name);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Иван Иванов", "9185001010");
        phoneBook.addContact("Иван Иванов", "9282003020");
        phoneBook.addContact("Светлана Петрова", "9114561232");
        phoneBook.addContact("Светлана Петрова", "9288002020");
        phoneBook.addContact("Кристина Белова", "9185403020");
        phoneBook.addContact("Кристина Белова", "9315020204");
        phoneBook.addContact("Анна Мусина", "9175006030");
        phoneBook.addContact("Анна Крутова", "9184002010");
        phoneBook.addContact("Анна Крутова", "9885006030");

        for (Map.Entry<String, ArrayList<String>> entry : phoneBook.phoneBook.entrySet()) {
            String name = entry.getKey();
            ArrayList<String> numbers = entry.getValue();
            System.out.printf("Контакт: %s\nНомера телефонов: %s\n\n", name, numbers);
        }
    }
}