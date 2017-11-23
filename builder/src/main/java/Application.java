import hero.Hero;
import hero.attributes.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        Hero jackHero = new Hero.Builder(Profession.WARRIOR, "Jack")
                .withArmor(Armor.CLOTHES)
                .withHairColor(HairColor.BLACK)
                .withHairType(HairType.SHORT)
                .withWeapon(Weapon.BOW)
                .build();

        LOGGER.info(jackHero.toString());

    }
}
