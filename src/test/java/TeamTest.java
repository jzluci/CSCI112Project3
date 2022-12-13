import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {

    @Test
    void emptyConstructor(){
        Team t = new Team();
        assertNotNull(t);
    }

    @Test
    void nameConstructor(){
        Team t = new Team("a");
        assertEquals("a",t.getName());

    }

    @Test
    void addPlayer() {
        Team t = new Team();
        t.addPlayer("a","b","c");
        assertNotNull(t.getPlayer(0));
    }

    @Test
    void addHero() {
        Team t = new Team();
        t.addPlayer("a","b","c");
        t.addHero("d","e",0);
        assertNotNull(t.getHero(0));
    }

    @Test
    void addStats() {
        Team t = new Team();
        t.addPlayer("","","");
        t.addHero("","",0);
        t.addStats(0,"","","","");
        assertNotNull(t.getPlayer(0).getMainHero().getStats(0));
    }

    @Test
    void setName() {
        Team t = new Team();
        t.setName("a");
        assertEquals("a",t.getName());
    }
}