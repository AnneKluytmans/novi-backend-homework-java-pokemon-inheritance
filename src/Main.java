import pokemon.types.ElectricPokemon;
import pokemon.types.FirePokemon;
import pokemon.types.GrassPokemon;
import pokemon.types.WaterPokemon;

public class Main {
    public static void main(String[] args) {
        GrassPokemon ivysaur = new GrassPokemon("Ivysaur", "Grass", 13.0f, 1.0f, 46, 48, 44, 12, 53);
        FirePokemon charmeleon = new FirePokemon("Charmeleon", "Fire", 19.0f, 1.1f, 38, 48, 50, 45f, 8, 20);
        WaterPokemon blastoise = new WaterPokemon("Blastoise", "Water", 85.5f, 1.6f, 63,60, 66, 24, 42.4f, 6);
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", "Electric", 6.0f, 0.4f, 28, 36, 33, 24, 6);

        System.out.println(ivysaur.toString());
        ivysaur.eats();
        ivysaur.speaks();

        System.out.println(charmeleon.toString());
        charmeleon.eats();
        charmeleon.speaks();

        System.out.println(blastoise.toString());
        blastoise.eats();
        blastoise.speaks();

        System.out.println(pikachu.toString());
        pikachu.eats();
        pikachu.speaks();

        System.out.println("\n---------Time to play---------------\n");

        pikachu.attack(charmeleon);
        pikachu.levelUp();


        blastoise.rainDance();

        ivysaur.photosynthesis();

        blastoise.bubbleBoost(ivysaur);

        charmeleon.pyroBall(blastoise);

        pikachu.paralyze(ivysaur);

        ivysaur.leafStorm(charmeleon);

        blastoise.absorbWater();

        ivysaur.levelUp();

        pikachu.gainExperience(6);

        charmeleon.flameThrower();

        pikachu.thunderPunch(ivysaur);
        pikachu.eats();
        pikachu.chargeUp();

        ivysaur.grow();

        charmeleon.increaseTemperature(8);
    }
}
