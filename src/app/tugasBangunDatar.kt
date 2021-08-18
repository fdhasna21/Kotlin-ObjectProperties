package app
import data.bangundatar._BangunDatar
import data.bangundatar.bangunPersegi
import data.bangundatar.bangunPersegiPanjang
import data.tugasMenu
import kotlin.system.exitProcess

fun inputData(data:String):Double{
    print(data)
    return readLine()!!.toDouble()
}

fun main(){
    var show = tugasMenu()
    while(true){
        val x = when(show.mainMenu()){
            "1"   -> show.menuLuas()
            "2"   -> show.menuKeliling()
            "3"   -> exitProcess(0)
            else   -> "Pilihan yang anda masukkan salah\n"
        }
        //print(x)

        when(x){
            "luas persegi"          -> {
                show.printPad(" Menghitung Luas Persegi ")
                val sisi = inputData("Masukkan nilai sisi dari persegi : ")
                //ketika sisi bukan double atau null, tetep muter
                val a = bangunPersegi(sisi)
                a.luas()
            }
            "luas persegi panjang"  ->{
                val sisi1 = inputData("Masukkan nilai panjang dari persegi panjang : ")
                val sisi2 = inputData("\nMasukkan nilai lebar dari persegi panjang : ")
                val b = bangunPersegiPanjang(sisi1,sisi2)
            }
            else                -> break
        }
    }
}