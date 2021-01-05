
fun main(args:Array<String>){
    class Person

    val person1 : Person = Person()
    val person2 : Person = Person()

    //기존 인스턴스를 이용해서 생성
    val person3 : Person = person1

    println(person1 == person2)
    println(person1 === person2)

    println(person1 == person3)
    println(person1 === person3)

    val n1 = Integer(500)
    val n2 = Integer(500)
    val n3 = n1
    println(n1 == n2)
    println(n1 === n2)

    println(n1 == n3)
    println(n1 === n3)

    val n4 = 500
    val n5 = 500
    println(n4 == n5)

    println("5 in 1..10 => ${5 in 1..10}")
    println("5 in 10..1 => ${5 in 10..1}")
    println("5 in 10 downTo 1 => ${5 in 10 downTo 1}")
    println("5 in 1..10 step 3 => ${5 in 1..10 step 3}")

    var x : Int? = 20
    println("${x?:100}")

    x = null
    println("${x?:100}")

}