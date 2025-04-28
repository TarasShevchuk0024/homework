package gmail.taras.shevchuk0024.Modul_2;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Тарас", "+471609345837");
        phoneBook.addContact("Володимир", "+471606754968");
        phoneBook.addContact("Вадим", "+471600954386");
        phoneBook.addContact("Ростислав", "+471602340684");
        phoneBook.addContact("Микола", "+47160995462");

        phoneBook.updateContact("Вадим", "+380976547687");

        phoneBook.deleteContact("Ростислав");

        System.out.println("Пошук номеру телефона:");
        phoneBook.searchContact("Ніна");
        System.out.println(" ");
        System.out.println("Номер знайдено:");
        phoneBook.searchContact("Тарас");
        System.out.println(" ");

        System.out.println("Список всіх номерів телефону: ");
        phoneBook.displayAllContacts();

    }
}
