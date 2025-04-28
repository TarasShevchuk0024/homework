package gmail.taras.shevchuk0024.Modul_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    @Test
    void shouldAddContact() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        // when
        phoneBook.addContact("Тарас", "471609345837");
        // then
        assertEquals("471609345837", phoneBook.searchContactValue("Тарас"));
    }
    @Test
    void shouldUpdateContact() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Вадим", "+471600954386");
        // when
        phoneBook.updateContact("Вадим", "380976547687");
        // then
        assertEquals("380976547687", phoneBook.searchContactValue("Вадим"));
    }
    @Test
    void shouldFindContact() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Тарас", "+471609345837");
        // when
        String result = phoneBook.searchContactValue("Тарас");
        // then
        assertEquals("+471609345837", result);
    }
    @Test
    void shouldDeleteContact() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Ростислав", "+471602340684");
        // when
        phoneBook.deleteContact("Ростислав");
        // then
        assertNull(phoneBook.searchContactValue("Ростислав"));
    }

}