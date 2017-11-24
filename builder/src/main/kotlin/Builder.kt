import org.slf4j.LoggerFactory


/**
 * Builder is not needed in Kotlin
 */

val LOGGER = LoggerFactory.getLogger(String())

class Hero(
        private val profession: Profession? = null,
        private val name: String? = null,
        private val hairType: HairType? = null,
        private val hairColor: HairColor? = null,
        private val armor: Armor? = null,
        private val weapon: Weapon? = null
) {
    override fun toString(): String {
        return "Hero{" +
                "profession=" + profession +
                ", name='" + name + '\'' +
                ", hairType=" + hairType +
                ", hairColor=" + hairColor +
                ", armor=" + armor +
                ", weapon=" + weapon +
                '}'
    }
}


enum class Profession {
    WARRIOR,
    THIEF,
    MAGE,
    PRIEST
}


enum class HairType(val title: String) {
    BALD("bald"),
    SHORT("short"),
    CURLY("curly"),
    LONG_STRAIGHT("long straight"),
    LONG_CURLY("long curly")
}


enum class HairColor {
    WHITE,
    BLOND,
    RED,
    BROWN,
    BLACK
}

enum class Armor(val armor: String) {
    CLOTHES("clothes"),
    LEATHER("leather"),
    CHAIN_MAIL("chain mail"),
    PLATE_MAIL("plate mail")
}

enum class Weapon {
    DAGGER,
    SWORD,
    AXE,
    WARHAMMER,
    BOW
}


fun main(args: Array<String>) {

    val simpleHero = Hero(Profession.MAGE,"Jack", HairType.BALD, HairColor.BLACK)

    LOGGER.info(simpleHero.toString())

}