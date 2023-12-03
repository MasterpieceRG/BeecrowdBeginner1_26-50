import java.util.Scanner

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var A = scan.nextInt()
    var B = scan.nextInt()

    if(A%B == 0 || B%A == 0)
        println("Sao Multiplos")
    else
        println("Nao sao Multiplos")
}