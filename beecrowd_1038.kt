import java.util.Scanner

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var code = scan.nextInt()
    var quantity = scan.nextInt()
    var RS:Double = 0.0

    when {
        code == 1 -> RS = 4.00
        code == 2 -> RS = 4.50
        code == 3 -> RS = 5.00
        code == 4 -> RS = 2.00
        code == 5 -> RS = 1.50
    }
    var total = RS * quantity
    println("Total: R$ ${"%.2f".format(total)}")
}