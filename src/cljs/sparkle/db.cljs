(ns sparkle.db)

(def items-db [
  ["HEAVY_COMBO" [
        "a strange insectoid helm"
        "a rimmed round helmet"
        "a pair of riveted chainmail sleeves"
        "a pair of polioshed gold plated vambaces"
        "a sturdy pair of full leather gauntlets"
        "a pair of leather half-gauntlets"
        "a tunic of finely-crafted chain"
        "a supple tunic of finely linked chain"
        "a pair of thick gold-plated greaves"
        "a set of riveted chainmail leggings"
        "a pair of lissome leather boots with metal capped toes"
        "a pair of animal-fur boots"
    ]]
    ["MEDIUM_COMBO" [
        "a thick helmet of supple leather"
        "a pair of dyed leather armsleeves"
        "a pair of emerald-trimmed leather gloves"
        "a studded leather jerkin"
        "a set of darkly dyed leather leggings"
        "a pair of low-heeled boots"
    ]]
    ["LIGHT_COMBO" [
        "a light brown hood of finely-spun cloth"
        "a set of finely-spun cloth sleeves"
        "a fine pair of light buckskin gloves"
        "a finely-tailored white shirt"

        "a set of loose cloth breeches"

        "a pair of light well-oiled leather boots"
    ]]
    ["DODGE" [
        "a shoufa with a black veil"
        "a camouflaged hood"
        "a fine linen riding hood"
        "a golden diadem with hanging sapphie"
        "a braided leather and silver headband"
        "a white-gold diamond tiara"
        "a set of cloth sleeves"
        "a pair of dark gloves"
        "a pair of slim riding gloves"
        "a bearskin tunic"
        "a sheer satin slip"
        "a red bra of lace and silk"
        "a satin blouse"
        "a pair of earthen colored breeches"
        "a divided riding skirt"
        "a black pair of silver-tooled boots"
    ]]
    ["RINGS" [
        "a diamond wedding ring"
        "a great serpent ring"
        "an emerald and silver engagement ring"
        "a gold ring"
        "a ring of silver"
        "a cheap brass ring"
        "a heavy gold signet ring"
        "an emerald ring"
        "a jade signet ring"
        "a pearl-and-moonstone engagement ring"
        "a gold ring delicately carved with ivy"
        "a garnet adorned ring"
        "an orange coral ring"
        "a diamond ring laced with emeralds"
        "a narrow amethyst ring"
    ]]
    ["NECKS" [
        "a Kandori snowflake necklace"
        "an opal choker of fiery blue and pink beauty"
        "a necklace of dark ivy"
        "a torc inlaid with silver swords"
        "a necklace of bloody human skulls"
    ]]
    ["WRISTS" [
        "an ivy bracelet"
        "a sungwood bracelet"
        "a silver Kandori wristcuff"
    ]]

    ["BELTS" [
        "a belt with a buckle of cuendillar"
    ]]

    ["CLOAKS" [
        "a coat bearing the ancient symbol of the Aes Sedai"
        "a cloak of shifting colors"
    ]]

    ["WEAPONS" [
        "a blackened steel kris"
        "a scimitar with a hilt of twisted iron"
        "an ivory and gold-hilted longsword"
        "a blue steel trident"
        "a steel flanged mace"
        "a shining silver plated sword"
        "a razored falcata"
        "a bronze chain scourge"
        "a gargantuan gilded bastard sword"
        "a dark barbed flail"
        "a set of steel sai"
        "a curved clear dagger"
        "a sharp red stone dagger"
        "a bone club"
        "a saw-toothed axe"
        "a ruby-worked rapier"
        "a silver-winged basilard"
    ]]

    ["SHIELDS" [
        "a silver etched shield"
    ]]

    ["POTIONS" [
        "a bubbling draught"
        "a thin vial of yellow fluid"
        "a cup of thready brown tea"
        "a cup of thick syrup"
        "a vial filled with a dark red liquid"
    ]]
])



(def initial-data "20. a strange insectoid helm
47. a rimmed round helmet
something
48. a rimmed round helmet
49. a rimmed round helmet
52. a pair of emerald-trimmed leather gloves
56. a pair of emerald-trimmed leather gloves
76. a set of riveted chainmail leggings
97. a set of riveted chainmail leggings")

(def default-db
  {:name "re-frame"
   :chest-contents initial-data
;    :chest-contents ""
   :catalog items-db})
