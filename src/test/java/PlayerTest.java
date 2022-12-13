import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void emptyConstructor(){
        Player p = new Player();
        assertNotNull(p);
    }

    @Test
    void nameConstructor(){
        Player p = new Player("a","","");
        assertEquals("a",p.getName());
    }

    @Test
    void tagConstructor(){
        Player p = new Player("","a","");
        assertEquals("a",p.getGamertag());

    }

    @Test
    void homeConstructor(){
        Player p = new Player("","","a");
        assertEquals("a",p.getHometown());
    }

    @Test
    void addHero() {
        Player p = new Player();
        p.addHero("winston", "tank");
        assertNotNull(p.getMainHero());
    }

    @Test
    void addStats() {
        Player p = new Player();
        p.addHero("winston", "tank");
        p.addStats("1","2","3","4");
        assertNotNull(p.getStats(p.getMainHero(),0));
    }

    @Test
    void setName() {
        Player p = new Player();
        p.setName("a");
        assertEquals("a",p.getName());
    }

    @Test
    void setGamertag() {
        Player p = new Player();
        p.setGamertag("a");
        assertEquals("a", p.getGamertag());
    }

    @Test
    void setHometown() {
        Player p = new Player();
        p.setHometown("a");
        assertEquals("a", p.getHometown());
    }
}