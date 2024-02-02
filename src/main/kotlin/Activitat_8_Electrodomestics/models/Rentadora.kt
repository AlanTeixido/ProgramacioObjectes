package org.example.Activitat_8_Electrodomestics.models
import org.example.Activitat_8_Electrodomestics.models.*


class Rentadora(
    preuBase: Int,
    color: String = "blanc",
    consum: String = "G",
    pes: Int = 5,
    var carrega: Int = 5
) : Electrodomestic(preuBase, color, consum, pes) {

    override fun preuFinal(): Int {
        var preuFinal = super.preuFinal()

        // Incremento del precio en función de la carga
        when (carrega) {
            in 6..7 -> preuFinal += 55
            8 -> preuFinal += 70
            9 -> preuFinal += 85
            10 -> preuFinal += 100
        }

        return preuFinal
    }

    override fun toString(): String {
        return """
            Rentadora:
            Preu base: $preuBase€
            Color: $color
            Consum: $consum
            Pes: $pes kg
            Càrrega: $carrega kg
            Preu final: ${preuFinal()}€
        """.trimIndent()
    }
}


