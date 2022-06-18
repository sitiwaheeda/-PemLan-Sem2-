package Tugas8;

public class Healer extends Character {
    public Healer() {
        setHP(70);
        setAttack(10);
        setDefense(10);
    }

    public void heal() {
        setHP(getHP() + 25);
    }

    public boolean attack() {
        int randomRandom = (int)
                (Math.random() * 100) + 1;
        if (randomRandom <= 85) {
            return true;
        } else {
            return false;
        }
    }

    public void info() {
        super.info();
        System.out.println("Role\t= Healer");
        System.out.println("HP\t= " + getHP());
        System.out.println("Attack\t= " + getAttack());
        System.out.println("Defense\t= " + getDefense());
    }
}
