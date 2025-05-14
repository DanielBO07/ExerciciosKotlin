import kotlin.random.Random
fun main() {
    var i: Int = 1
    while(i <= 5){
        val a = Random.nextDouble(1.0,2.0)
        val p = Random.nextDouble(30.0,120.0)
        print("O IMC da $i pessoa é "+(p/(a*a)))
        classe(p/(a*a))
        i++
    }
}
fun classe(IMC:Double){
    if(IMC < 18.5){
        println(" Baixo do peso")
    }else if(IMC >= 18.5 && IMC < 25.0){
        println(" Peso normal")
    }else if(IMC >= 25.0 && IMC < 30.0){
        println(" Pré-obesidade")
    }else if(IMC >= 30.0 && IMC < 35.0){
        println(" Obesidade grau I")
    }else if(IMC >= 35.0 && IMC < 40.0){
        println(" Obesidade grau II")
    }else if(IMC > 40.0){
        println(" Obesidade grau III")
    }
}