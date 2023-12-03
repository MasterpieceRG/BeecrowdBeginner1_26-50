import java.util.Scanner
fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var X = scan.nextDouble()
    var Y = scan.nextDouble()

    when {
        X + Y == 0.0 -> println("Origem")
        X == 0.0 -> println("Eixo Y")
        Y == 0.0 -> println("Eixo X")
        X > 0 && Y > 0 -> println("Q1")
        X < 0 && Y > 0 -> println("Q2")
        X < 0 && Y < 0 -> println("Q3")
        X>0 && Y<0 -> println("Q4")
    }
}