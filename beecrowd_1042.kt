import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var a = scan.nextInt()
    var b = scan.nextInt()
    var c = scan.nextInt()
    var max = 0
    var mid = 0
    var min = 0

    if(a>b && a>c) {
        max = a
    }else if(b>a && b>c) {
        max = b
    }else {
        max = c
    }

    if(a<b && a<c) {
        min = a
    }else if(b<a && b<c) {
        min = b
    }else {
        min = c
    }

    if(a>b && a<c) {
        mid = a
    }else if(b>a && b<c) {
        mid = b
    }else {
        mid = c
    }

    if(max != a && min != a) {
        mid = a
    }else if(max != b && min != b) {
        mid = b
    }else {
        mid = c
    }
    println(min)
    println(mid)
    println(max)
    println()
    println(a)
    println(b)
    println(c)
}