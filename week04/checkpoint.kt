const val HERO_NAME = "Madrigal" //

fun main() {
    println("The hero announces her presence to the World.")
    
    println(HERO_NAME)

    var playerLevel = 1
    println(playerLevel)

    if (playerLevel == 1) {
        println("Meet Mr. Bubbles in the Land of Soft Things.")
    } else if (playerLevel <= 5) {
        println("Save the town from the barbarian invasions.")
    } else if (playerLevel == 6) {
        println("Locate the enchanted sword")
    } else if (playerLevel == 7) {
        println("Recover the long-lost artifact of creation.")
    } else if (playerLevel == 8) {
    println("Defeat Nogartse, bringer of death and eater of worlds.")
    }

    else {
        println("There are no quests right now.")
    }

    println("Time passes...")
    println("The hero returns from her quest.")

    playerLevel += 1
    println(playerLevel)
}