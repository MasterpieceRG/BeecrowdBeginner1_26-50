import java.util.Scanner
fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var A = scan.nextDouble()
    var B = scan.nextDouble()
    var C = scan.nextDouble()

    if(B+C > A && A+C > B && A+B > C) {
        var perimetro = A + B + C
        println("Perimetro = ${"%.1f".format(perimetro)}")
    } else {
        var area = (A+B) * 0.5 * C
        println("Area = ${"%.1f".format(area)}")
    }
}