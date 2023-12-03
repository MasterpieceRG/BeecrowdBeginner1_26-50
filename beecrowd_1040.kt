import java.util.Scanner
fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var N1 = scan.nextDouble()
    var N2 = scan.nextDouble()
    var N3 = scan.nextDouble()
    var N4 = scan.nextDouble()

    var avarage = ((N1*2) + (N2*3) + (N3*4) + (N4*1))/(2 + 3 + 4 + 1)
    println("Media: %.1f".format(avarage))

    if(avarage >= 7.0) {
        println("Aluno aprovado.")
    }else if(avarage <= 6.9 && avarage >= 5.0) {
        println("Aluno em exame.")
        print("Nota do exame: ")
        var examResult = scan.nextDouble()
        var finalAvarage = (examResult + avarage) / 2

        if(finalAvarage >= 5.0) {
            println("Aluno aprovado.")
        }else if(finalAvarage <= 4.9) {
            println("Aluno reprovado.")
        }
        println("Media final: ${"%.1f".format(finalAvarage)}")

    }else if(avarage <= 4.9) {
         println("Aluno reprovado.")
    }
}