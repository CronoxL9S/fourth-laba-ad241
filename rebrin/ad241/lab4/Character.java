package rebrin.ad241.lab4;

/**
 * Абстрактний базовий клас для всіх персонажів
 */
public abstract class Character {
    protected String name;
    protected int health;
    protected int damage;

    public Character(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    // Абстрактні методи, будуть визначатись для кожного
    // класу по різному
    public abstract void attack();
    public abstract void defend();

    // Далі звичайні методи - спільні для всіх

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) this.health = 0;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
}
