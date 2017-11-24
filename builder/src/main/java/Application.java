import hero.Hero;
import hero.attributes.Profession;
import hero.attributes.Armor;
import hero.attributes.HairColor;
import hero.attributes.HairType;
import hero.attributes.Weapon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        Hero jackHero = new Hero.Builder(Profession.PRIEST, "Mark")
                .withArmor(Armor.CLOTHES)
                .build();

        LOGGER.info(jackHero.toString());

    }
}
