package pokemon.types;

import pokemon.Pokemon;

public class FirePokemon extends Pokemon {
    private float temperature;
    private int flameSize;
    private int rageIndex;

    public FirePokemon(String name, float weight, float height, int level, int hp, int xp, float temperature, int flameSize, int rageIndex) {
        super(name, "Fire", weight, height, level, hp, xp);
        this.temperature = temperature;
        this.flameSize = flameSize;
        this.rageIndex = rageIndex;
    }


    public float getTemperature() {
        return temperature;
    }

    public int getFlameSize() {
        return flameSize;
    }

    public int getRageIndex() {
        return rageIndex;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setFlameSize(int flameSize) {
        this.flameSize = flameSize;
    }

    public void setRageIndex(int rageIndex) {
        this.rageIndex = rageIndex;
    }

    
    @Override
    public void eats() {
        System.out.println(getName() + " devours burning hot coals, feeling its inner fire grow stronger.");
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " crackles like a blazing campfire, sparks flying in all directions.");
    }

    public void increaseTemperature(int amount) {
        this.temperature += amount;
        System.out.println(getName() + "'s temperature raised to " + temperature + " degrees! Its attacks become more powerful.\n");
    }

    public void flameThrower() {
        System.out.println(getName() + " releases a massive burst of flames, scorching everything in its path!\n");
    }

    public void pyroBall(Pokemon opponent) {
        int damage = (int) ((flameSize + temperature) / 5);
        boolean burned = Math.random() < 0.4;

        System.out.println(getName() + " launches a massive Pyro Ball at " + opponent.getName());

        if (burned) {
            opponent.setHp(0);
            System.out.println(opponent.getName() + " is burned by the intense flames of the Pyro Ball!");
        }
        opponent.takeDamage(damage);
        levelUp();
    }
}
