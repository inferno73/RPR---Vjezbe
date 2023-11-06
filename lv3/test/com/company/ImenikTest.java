package com.company;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class ImenikTest {

    private static Imenik imenik = new Imenik();

    //izvrsava se jednom za citav ovaj test
    @BeforeAll
    public static void setup() {
        imenik.dodaj("Amar", new FiksniBroj(Grad.SARAJEVO, "225-556"));
        imenik.dodaj("Anes", new FiksniBroj(Grad.TUZLA, "259-956"));
        imenik.dodaj("Ana", new FiksniBroj(Grad.BRCKO, "100-600"));
        imenik.dodaj("Enar", new FiksniBroj(Grad.ZENICA, "321-556"));
        imenik.dodaj("Esma", new FiksniBroj(Grad.SARAJEVO, "665-006"));
        imenik.dodaj("Jasna", new FiksniBroj(Grad.BRCKO, "325-218"));
    }

    @org.junit.jupiter.api.Test
    void dodaj() {
    }

    @org.junit.jupiter.api.Test
    void dajBrojFound() {
        String broj = imenik.dajBroj("Esma");
        assertEquals(broj, "049/325-218");
    }
    @org.junit.jupiter.api.Test
    void dajBrojNotFound() {
        String broj = imenik.dajBroj("Esmaaa");
        assertNull(broj);
    }

    @org.junit.jupiter.api.Test
    void dodajTestPositive() {
        TelefonskiBroj br = new MobilniBroj(61, "123-345");
        imenik.dodaj("Una", br);

        String broj = imenik.dajBroj("Una");
        assertEquals(broj, "061/123-345" );
    }

    @org.junit.jupiter.api.Test
    void dodajFiksniException() {
        assertThrows(BrojException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new FiksniBroj(null, "123-123");
            }
        });
    }


}