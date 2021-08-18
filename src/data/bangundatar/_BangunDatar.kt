package data.bangundatar

open class _BangunDatar(
    var sisi1:Double=0.0,
    var sisi2:Double=0.0,
    open var luas:Double=0.0,
    open var keliling:Double=0.0,
    open var stringBentuk:String="",
    open var stringUkuran:String =""){
    
    open fun luas(){
        luas = when(stringBentuk){
            "persegi"   -> sisi1*sisi2
            "lingkaran" -> Math.pow(sisi1,2.0)*3.14
            else        -> 0.0
        }
        printData("Luas", stringUkuran, luas.toString())
    }

    open fun keliling(){
        keliling = when(stringBentuk){
            "persegi"   -> (2*sisi1)+(2*sisi2)
            "lingkaran" -> 2*sisi1*3.14
            else        -> 0.0
        }
        printData("Keliling", stringUkuran, keliling.toString())
    }

    fun printData(jenisData:String, stringUkuran:String, nilaiData:String){
        println("$jenisData dari ${stringUkuran.decapitalize()} adalah $nilaiData")
    }
}