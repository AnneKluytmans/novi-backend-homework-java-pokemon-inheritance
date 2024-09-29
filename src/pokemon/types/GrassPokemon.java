package pokemon.types;

import pokemon.Pokemon;

public class GrassPokemon extends Pokemon {
    private float chlorofylLevel;
    private int amountOfLeaves;

    public GrassPokemon(String name, String type, float weight, float height, int level, int hp, int xp, float chlorofylLevel, int amountOfLeaves) {
        super(name, type, weight, height, level, hp, xp);
        this.chlorofylLevel = chlorofylLevel;
        this.amountOfLeaves = amountOfLeaves;
    }


    public float getChlorofylLevel() {
        return chlorofylLevel;
    }

    public int getAmountOfLeaves() {
        return amountOfLeaves;
    }

    public void setChlorofylLevel(float chlorofylLevel) {
        this.chlorofylLevel = chlorofylLevel;
    }

    public void setAmountOfLeaves(int amountOfLeaves) {
        this.amountOfLeaves = amountOfLeaves;
    }


    @Override
    public void eats() {
        System.out.println(getName() + " absorbs sunlight and grazes on fresh grass and tree leaves.");
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " whooshes, like leaves and grass in stormy weather");
    }


    public void photosynthesis() {
        int healthRecovered = 20;
        setHp(getHp() + healthRecovered);
        System.out.println(getName() + " absorbs sunlight and restores " + healthRecovered + " hp! \n - hp is now: " + getHp());
    }

    public void grow() {
        amountOfLeaves += 10;
        System.out.println(getName() + " grows and has now " + amountOfLeaves + " leaves.");
    }

    public void leafStorm(Pokemon opponent) {
        int damage = amountOfLeaves / 5;
        System.out.println(getName() + " starts a wild and heavy Leaf Storm on " + opponent.getName() + "! " +
                "It will gradually drain its health.");
        opponent.takeDamage(damage);
    }
}
