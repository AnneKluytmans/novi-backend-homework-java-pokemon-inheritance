package pokemon.types;

import pokemon.Pokemon;

public class ElectricPokemon extends Pokemon {
    private int voltageLevel;
    private int batteryLife;

    public ElectricPokemon(String name, float weight, float height, int level, int hp, int xp, int voltageLevel, int batteryLife) {
        super(name, "Electric", weight, height, level, hp, xp);
        this.voltageLevel = voltageLevel;
        this.batteryLife = batteryLife;
    }


    public int getVoltageLevel() {
        return voltageLevel;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setVoltageLevel(int voltageLevel) {
        this.voltageLevel = voltageLevel;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }


    @Override
    public void eats() {
        System.out.println(getName() + " absorbs lightning from a storm, to boost its energy!");
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " lets out a high-intense roar, like a bolt of lightning striking.");
    }


    public void chargeUp() {
        voltageLevel += 20;
        System.out.println(getName() + " charges up! \nVoltage level is now: " + voltageLevel + " volts\n");
    }

    public void thunderPunch(Pokemon opponent) {
        int damage = voltageLevel / 2;
        System.out.println(getName() + " unleashes Thunder Punch on " + opponent.getName());
        opponent.takeDamage(damage);
        levelUp();
    }

    public void paralyze(Pokemon opponent) {
        voltageLevel -= 20;
        System.out.println(getName() + " uses Paralyze on " + opponent.getName() + "! \n" + opponent.getName() +
                " is paralyzed for a few moments and may not be able to move. \n- Voltage level of " + getName() +
                " is now: " + voltageLevel + " volts\n");
    }
}
