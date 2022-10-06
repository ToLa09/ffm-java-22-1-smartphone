import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void startRadioReturnsRadioStopped(){
        //given
        Smartphone testPhone = new Smartphone();
        //when
        boolean actual = testPhone.startRadio();
        //then
        assertTrue(actual);
    }
    @Test
    void stopRadioReturnsRadioStopped(){
        //given
        Smartphone testPhone = new Smartphone();
        //when
        boolean actual = testPhone.stopRadio();
        //then
        assertFalse(actual);
    }
    @Test
    void getPositionreturnsKoeln(){
        //given
        Smartphone testPhone = new Smartphone();
        //when
        String actual = testPhone.getPosition();
        //then
        String expected = "Köln";
        assertEquals(expected,actual);
    }
    @Test
    void getContactIndex0ReturnsMykola(){
        //given
        List<Contact> testContacts = new ArrayList<>();
        Contact mykola = new Friend("mykola","+4901761234");
        testContacts.add(mykola);
        Smartphone testPhone = new Smartphone("Model","Hersteller",testContacts);
        //when
        Contact actual = testPhone.getContact(0);
        //then
        Contact expected = mykola;
        assertEquals(expected, actual);
    }
    @Test
    void getContactByNameMykola() {
        //given
        List<Contact> testContacts = new ArrayList<>();
        Contact mykola = new Friend("mykola","+4901761234");
        testContacts.add(mykola);
        Smartphone testPhone = new Smartphone("Model","Hersteller",testContacts);
        //when
        Contact actual = testPhone.getContactByName("mykola");
        //then
        Contact expected = mykola;
        assertEquals(expected, actual);
    }
}