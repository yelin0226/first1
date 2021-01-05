typealias str = String

fun main(args:Array<String>){

    var temp : str = "Hello Typealias"


    var msg = "Hello\nKotlin"
    println(msg)
    //이런 형태를 raw string 이라고 합니다.
    msg = """Hello
        Kotlin
    """
    println(msg)

    val n1 = 10
    var n2 = 20

    //n1 + n2 = 30 이런 형태로 출력
    //이렇게 문자열 안에 수식이나 변수를 출력하는 것
    //문자열 템플릿이라고 합니다.
    msg = "${n1} + ${n2} = ${n1 + n2}"
    println(msg)

    var ch : Char = 65.toChar()
    println(ch)
    ch = '\uD55C'
    println(ch)
    ch = '\\'
    println(ch)

    var x : Int = 20
    var y : Int = 3

    x %= y
    println("결과는 ${x}")
}