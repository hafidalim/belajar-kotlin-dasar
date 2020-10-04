fun main() {

    val name : Array<String> = arrayOf("hafid","ali","mustaqim")
    name.set(0,"Presdir")
    println(name.get(0))
    println(name.size)
    println(name.get(0))

    val absen : Array<Int?> = arrayOfNulls(5)
    absen[0] = 10

    println(absen[0])

}
