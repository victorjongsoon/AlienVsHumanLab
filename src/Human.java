

public class Human extends Entity {
    private int armor;

    public Human(String name, int health, int attack, int armor) {
        super(name, health, attack);
        this.armor = armor;
    }

    // Additional methods specific to Human
    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}

