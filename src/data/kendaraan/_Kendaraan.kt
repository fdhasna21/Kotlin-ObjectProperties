package data.kendaraan

import app.printNotEmpty

open class _Kendaraan(
    open var noKendaran:String,
    open var tahunKendaraan:Int,
    open var merkKendaraan:String="",
    open var jenisKendaraan:String="",
    open var warnaKendaran:String="",
    open var kelompokKendaraan:String=""){

    open fun showData(){
        println("$noKendaran adalah sebuah $kelompokKendaraan" +
                printNotEmpty(jenisKendaraan.decapitalize()) +
                printNotEmpty(merkKendaraan.capitalize(),"dari") +
                printNotEmpty(tahunKendaraan.toString(), "produksi tahun") +
                printNotEmpty(warnaKendaran.decapitalize(), "berwarna"))
    }
}