package pokemon;

public abstract class Pokemon {
    private String name;
    private String type;
    private int level;
    private int hp;
    private int xp;


    public Pokemon(String name, String type, int level, int hp, int xp) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.hp = hp;
        this.xp = xp;
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getXp() {
        return xp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }


    public abstract void eat();

    public abstract void makeSound();

    public void levelUp() {
        level++;
        hp += 10;
        xp = 0;
        System.out.println(name + " leveled up to level " + level + "! \n - hp is now: " + hp + " \n - xp is now: " + xp + "\n");
    }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp <= 0) {
            hp = 0;
            System.out.println(name + " has passed out.");
        } else {
            System.out.println(name + " took " + damage + " damage. \n - hp is now: " + hp + "\n");
        }
    }

    public void gainExperience(int experience) {
        xp += experience;
        System.out.println(name + " gained " + experience + " experience! \n - xp is now: " + xp + "\n");
    }

    public void attack(Pokemon opponent) {
        System.out.println(name + " attacks " + opponent.getName() + " with level " + opponent.getLevel() + ".");
        System.out.println("It's a fierce fight!");
    }

}
