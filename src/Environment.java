

import java.util.ArrayList;
import java.util.List;

public class Environment {
    private List<Entity> entities;

    public Environment() {
        this.entities = new ArrayList<>();
    }

    public void addEntity(Entity entity) {
        entities.add(entity);
    }

    public void removeEntity(Entity entity) {
        entities.remove(entity);
    }

    // Additional methods for interactions between entities in the environment
    
}
