package gmail.taras.shevchuk0024.Modul_2;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        contacts.put(name, phone);
    }

    public void updateContact(String name, String newPhone) {
        if (contacts.containsKey(name)) {
            contacts.put(name, newPhone);
        }
    }

    public void deleteContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
        }
    }

    public void searchContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println(name + ": " + contacts.get(name));
        } else {
            System.out.println("Контакт не знайдено. Повторіть, будь ласка, спробу ще раз. ");
        }
    }

    public void displayAllContacts() {
        contacts.forEach((name, phone) -> System.out.println(name + ": " + phone));
    }

    public String searchContactValue(String name) {
        return contacts.get(name);
    }

}
