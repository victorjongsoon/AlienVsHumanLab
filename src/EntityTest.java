

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EntityTest {
    @Test
    public void testEntityCreation() {
        Entity entity = new Entity("Test Entity", 100, 10);
        assertEquals("Test Entity", entity.getName());
        assertEquals(100, entity.getHealth());
        assertEquals(10, entity.getAttack());
    }
}

