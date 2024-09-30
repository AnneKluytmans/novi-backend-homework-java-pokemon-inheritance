package pokemon.types;

import pokemon.Pokemon;

public class WaterPokemon extends Pokemon {
    private int hydrationLevel;
    private float swimSpeed;
    private int waterPressure;

    public WaterPokemon(String name, float weight, float height, int level, int hp, int xp, int hydrationLevel, float swimSpeed, int waterPressure) {
        super(name, "Water", weight, height, level, hp, xp);
        this.hydrationLevel = hydrationLevel;
        this.swimSpeed = swimSpeed;
        this.waterPressure = waterPressure;
    }


    public int getHydrationLevel() {
        return hydrationLevel;
    }

    public float getSwimSpeed() {
        return swimSpeed;
    }

    public int getWaterPressure() {
        return waterPressure;
    }

    public void setHydrationLevel(int hydrationLevel) {
        this.hydrationLevel = hydrationLevel;
    }

    public void setSwimSpeed(float swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public void setWaterPressure(int waterPressure) {
        this.waterPressure = waterPressure;
    }


    @Override
    public void eats() {
        System.out.println(getName() + " drinks pure water from the ocean, recharging its watery power.");
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " roars like crashing waves against rocky shores.");
    }

    public void rainDance() {
        this.waterPressure += 20;
        System.out.println(getName() + " summons a rainstorm! Water attacks are now more powerful. \n- water pressure is now: " + waterPressure + "\n");
    }

    public void bubbleBoost(Pokemon opponent) {
        int damage = waterPressure / 2;
        this.swimSpeed += 5.25f;
        System.out.println(getName() + " creates a powerful stream of water bubbles increasing its speed to " +
                swimSpeed + " and attacking " + opponent.getName() + ".");
        opponent.takeDamage(damage);
        levelUp();
    }

    public void absorbWater() {
        this.hydrationLevel += 10;
        System.out.println(getName() + " absorbs water, increasing its hydration level to " + hydrationLevel + ".\n");
    }

}
