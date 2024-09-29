package pokemon;

public abstract class Pokemon {
    private String name;
    private String type;
    private float weight;
    private float height;
    private int level;
    private int hp;
    private int xp;


    public Pokemon(String name, String type, float weight, float height, int level, int hp, int xp) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.height = height;
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

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
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

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setHeight(float height) {
        this.height = height;
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


    public abstract void eats();

    public abstract void speaks();

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
        int damage = (int) (Math.random() * level * 5);

        System.out.println(name + " attacks " + opponent.getName() + " with level " + opponent.getLevel() + ".");
        System.out.println("It's a fierce fight! " + name + " brings " + damage + " damage to " + opponent.getName() + " with level " + opponent.getName() + ".");
        opponent.takeDamage(damage);
        if (opponent.getHp() < 10) {
            System.out.println(opponent.getName() + " is barely holding on!");
        }

        if (opponent.getHp() <= 0) {
            System.out.println(opponent.getName() + " has passed out.");
        }
        System.out.println("The fight is over! \n Hp of " + opponent.getName() + " is now: " + opponent.getHp() + ".");
    }

}
