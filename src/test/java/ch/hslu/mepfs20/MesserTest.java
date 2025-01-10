package ch.hslu.mepfs20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MesserTest {

    @Test
    void checkIfDefaultConstructorHasMesserArt() {
        Messer messer = new Messer();
        assertEquals("Kochmesser", messer.getMesserArt());
    }

   @Test
   void checkIfConstructorHasMesserArt(){
        Messer messer = new Messer("Käsemesser");
        assertEquals("Käsemesser", messer.getMesserArt());

   }
}