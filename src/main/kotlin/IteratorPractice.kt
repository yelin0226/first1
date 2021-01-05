fun main(args:Array<String>){
    for( idx in 1..9){
        println("image${idx}.png")

        var ar = arrayOf<String>(
            "프로그래밍 언어","자료구조와 알고리즘", "데이터베이스")
        var list = listOf<String>(
            "기본문법", "SDK에 대한 이해", "프레임뭐크")

        for(idx in ar.indices){
            println(idx)
        }

        for(idx in list.withIndex()){
            println(idx)
        }

    }
}
