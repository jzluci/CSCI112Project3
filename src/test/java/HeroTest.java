import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    void emptyConstructor() {
        Hero h = new Hero();
        assertNotNull(h);
    }

    @Test
    void roleConstructor() {
        Hero h = new Hero("","top");
        assertEquals("top", h.getRole());
    }

    @Test
    void nameConstructor() {
        Hero h = new Hero("greg","");
        assertEquals("greg",h.getName());
    }

    @Test
    void setName() {
        Hero h = new Hero();
        h.setName("a");
        assertEquals("a",h.getName());
    }

    @Test
    void setRole() {
        Hero h = new Hero();
        h.setRole("b");
        assertEquals("b",h.getRole());
    }

    @Test
    void addStats() {
        Hero s = new Hero();
        s.addStats("0", "1", "2", "3");
        assertNotNull(s.getStats(0));
    }
}