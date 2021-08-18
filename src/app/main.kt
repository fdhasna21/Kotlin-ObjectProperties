package app
import data.bangundatar.bangunLingkaran
import data.bangundatar.bangunPersegi
import data.bangundatar.bangunPersegiPanjang
import data.hewan.hewanKucing
import data.kendaraan.kendaraanMobil
import data.gadget.gadgetLaptop

fun printNotEmpty(variable:String, prefix:String="", postfix:String=""):String{
    return if(variable.isNotEmpty()) {" $prefix $variable$postfix"}
    else{""}
}
fun main(){
    val kucing2 = hewanKucing("bi", "persia", "putih")
    kucing2.showData()

    val mobil2 = kendaraanMobil("W909RR", 2014,"toyota")
    mobil2.showData()

    val laptop2 = gadgetLaptop("GL553VD", "Asus",16, "Intel Core i7")
    laptop2.showData()

    val persegi1 = bangunPersegi(4.0)
    persegi1.luas()
    persegi1.keliling()

    val persegiPanjang1 = bangunPersegiPanjang(3.0,4.0)
    persegiPanjang1.luas()
    persegiPanjang1.keliling()

    val lingkaran1 = bangunLingkaran(14.0)
    lingkaran1.luas()
    lingkaran1.keliling()
}