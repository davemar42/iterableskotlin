class Main {
    companion object{
        @JvmStatic fun main(vararg args:String ){
            var miarray= arrayOf("tonto ","estupido ","lamentable ","fornido ")
            print(miarray[1])
            miarray.forEach {
                print(it.toString())
            }
        }
    }
}