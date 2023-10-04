

public class Alien extends Entity {
    private boolean canRegenerate;

    public void setCanRegenerate(boolean canRegenerate) {
        this.canRegenerate = canRegenerate;
    }

    public Alien(String name, int health, int attack, boolean canRegenerate) {
        super(name, health, attack);
        this.canRegenerate = canRegenerate;
    }

    // Additional methods specific to Alien
        public boolean isCanRegenerate() {
        return canRegenerate;
    }
}
