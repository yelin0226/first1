var rw : Int = 10 //변경 가능한 변수를 생성
    get(){
        println("rw의 getter 호출")
        return field
    }
    set(value : Int){
        println("rw의 setter 호출")
        field = value
    }
var b : Boolean = true
var r : String = "Hello World"
    get(){
        if(b== true){
            return field.toUpperCase()
        }else{
            return field.toLowerCase()
        }
    }

const val constant : String = "Hi"


fun main(args:Array<String>){
    rw = 100
    println(rw)

    //b값에 의해서 r의 값이 다른 내용을 출
    b = false
    println(r)
    b = true
    println(r)

}