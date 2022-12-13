import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsTest {

    @Test
    void emptyContstructor(){
        Stats s = new Stats();
        assertNotNull(s);

    }

    @Test
    void elimsConstructor(){
        Stats s = new Stats("4","","","");
        assertEquals("4",s.getEliminations());

    }

    @Test
    void dmgConstructor(){
        Stats s = new Stats("","4","","");
        assertEquals("4",s.getDmgDealt());

    }

    @Test
    void healingConstructor(){
        Stats s = new Stats("","","4","");
        assertEquals("4",s.getHealingDone());

    }

    @Test
    void deathsConstructor(){
        Stats s = new Stats("","","","4");
        assertEquals("4",s.getDeaths());

    }

    @Test
    void setEliminations() {
        Stats s = new Stats();
        s.setEliminations("2");
        assertEquals("2",s.getEliminations());

    }

    @Test
    void setDmgDealt() {
        Stats s = new Stats();
        s.setDmgDealt("2");
        assertEquals("2",s.getDmgDealt());
    }

    @Test
    void setHealingDone() {
        Stats s = new Stats();
        s.setHealingDone("2");
        assertEquals("2",s.getHealingDone());
    }

    @Test
    void setDeaths() {
        Stats s = new Stats();
        s.setDeaths("2");
        assertEquals("2",s.getDeaths());
    }
}