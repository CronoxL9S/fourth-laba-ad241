package rebrin.ad241.lab4;

/**
 *  Цей клас тестує роботу класів і міні гри в цілому
 */
public class GameTest {
    public static void main(String[] args) {
        Character warrior = new Warrior("Гатс");
        Character mage = new Mage("Маг Небесного Гніву");
        Character archer = new Archer("Араш");

        System.out.println("--- Початок бою ---\n");

        warrior.attack();
        mage.attack();
        archer.attack();

        System.out.println();

        warrior.defend();
        mage.defend();
        archer.defend();

        System.out.println("\n--- Підвищення рівня ---\n");

        if (warrior instanceof Levelable) {
            ((Levelable) warrior).levelUp();
        }

        if (mage instanceof Levelable) {
            ((Levelable) mage).levelUp();
        }

        if (archer instanceof Levelable) {
            ((Levelable) archer).levelUp();
        }

        System.out.println("\n--- Бій між персонажами ---\n");

        battle(warrior, mage);

        System.out.println("Стан персонажів:");
        printStatus(warrior);
        printStatus(mage);
    }

    /**
     * Метод для симуляції бою між двома персонажами
     * @param c1, c2 це вибір двої героїв для бою
     */
    public static void battle(Character c1, Character c2) {
        System.out.println("Бій: " + c1.getName() + " проти " + c2.getName());

        c1.attack();
        c2.takeDamage(c1.getDamage());

        c2.attack();
        c1.takeDamage(c2.getDamage());

        System.out.println();
    }

    /**
     * Виведення статусу персонажа
     * @param c це сам персонаж
     */
    public static void printStatus(Character c) {
        System.out.println(c.getName() + " - Здоров'я: " + c.getHealth());
    }
}
