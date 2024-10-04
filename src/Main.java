import pokemon.types.ElectricPokemon;
import pokemon.types.FirePokemon;
import pokemon.types.GrassPokemon;
import pokemon.types.WaterPokemon;

public class Main {
    public static void main(String[] args) {
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur",13.0f, 1.0f, 18, 48, 198, 60, 153);
        FirePokemon charmander = new FirePokemon("Charmander", 19.0f, 1.1f, 12, 39, 100, 185f, 8, 20);
        WaterPokemon blastoise = new WaterPokemon("Blastoise",85.5f, 1.6f, 52,60, 492, 24, 42.4f, 6);
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu",6.0f, 0.4f, 22, 55, 200, 1000, 6);

        System.out.println(bulbasaur.toString());
        bulbasaur.eats();
        bulbasaur.speaks();

        System.out.println(charmander.toString());
        charmander.eats();
        charmander.speaks();

        System.out.println(blastoise.toString());
        blastoise.eats();
        blastoise.speaks();

        System.out.println(pikachu.toString());
        pikachu.eats();
        pikachu.speaks();

        System.out.println("\n---------Time to play---------------\n");

        pikachu.attack(charmander);
        pikachu.levelUp();


        blastoise.rainDance();

        bulbasaur.photosynthesis();

        blastoise.bubbleBoost(bulbasaur);

        charmander.pyroBall(blastoise);

        pikachu.paralyze(bulbasaur);

        bulbasaur.leafStorm(charmander);

        blastoise.absorbWater();

        bulbasaur.levelUp();

        pikachu.gainExperience(6);

        charmander.flameThrower();

        pikachu.thunderPunch(bulbasaur);
        pikachu.eats();
        pikachu.chargeUp();

        bulbasaur.grow();

        charmander.increaseTemperature(8);
    }
}
