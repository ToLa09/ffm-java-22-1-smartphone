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
        String actual = testPhone.startRadio();
        //then
        String expected = "Radio started";
        assertEquals(expected,actual);
    }
    @Test
    void stopRadioReturnsRadioStopped(){
        //given
        Smartphone testPhone = new Smartphone();
        //when
        String actual = testPhone.stopRadio();
        //then
        String expected = "Radio stopped";
        assertEquals(expected,actual);
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
    void getContactReturnsMykola(){
        //
        List<Contact> testContacts = new ArrayList<>();
        Contact mykola = new Friend("mykola",1234);
        testContacts.add(mykola);
        Smartphone testPhone = new Smartphone("Model","Hersteller",testContacts);
        //when
        Contact actual = testPhone.getContact(0);
        //then
        Contact expected = mykola;
        assertEquals(expected, actual);
    }
}