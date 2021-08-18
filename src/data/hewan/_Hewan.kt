package data.hewan
import app.printNotEmpty

open class _Hewan(
    open var namaHewan:String,
    open var rasHewan:String="",
    open var warnaHewan:String="",
    open var kelompokHewan:String=""){

    open fun showData(){
        println("${namaHewan.capitalize()} adalah seekor $kelompokHewan ${rasHewan.decapitalize()}" +
                printNotEmpty(warnaHewan.decapitalize(),"berwarna"))
    }
}
