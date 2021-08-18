package data

class tugasMenu(){
    var header:String=""
    var takeInput = "Pilihan yang anda inginkan : "
    var falseInput = "Pilihan yang anda masukkan salah, silahkan masukkan kembali"

    fun checkInputMenu():String{
        val input:String = readLine()!!
        return input
    }

    fun printPad(data:String):String{
        val padLength = (60-data.length)/2
        val padChar = " "
        return padChar.plus("\n").padEnd(padLength,'-')
            .plus(data).plus(padChar.padStart(padLength,'-').plus("\n"))

    }

    fun mainMenu():String{
        header = " Menghitung Luas dan Keliling Bangun Datar "
        val option = listOf<String>(
            printPad(header),
            "1. Menghitung luas\n",
            "2. Menghitung keliling\n",
            "3. Keluar\n",
            takeInput
        )
        for(i in option){print(i)}
        return checkInputMenu()
    }

    fun menuLuas():String{
        header = " Menghitung Luas Bangun Datar "
        val option = listOf<String>(
            printPad(header),
            "1. Menghitung luas persegi \n",
            "2. Menghitung luas persegi panjang\n",
            "3. Menghitung luas lingkaran\n",
            takeInput
        )
        for(i in option){print(i)}
        when(checkInputMenu()){
            "1"   -> return "luas persegi"
            "2"   -> return "luas persegi panjang"
            "3"   -> return "luas lingkaran"
            else    ->
            {
                println(falseInput)
                return menuLuas()}
        }
    }

    fun menuKeliling():String{
        header = " Menghitung Keliling Bangun Datar "
        val option = listOf<String>(
            printPad(header),
            "1. Menghitung keliling persegi\n",
            "2. Menghitung keliling persegi panjang\n",
            "3. Menghitung keliling lingkaran\n",
            takeInput
        )
        for(i in option){print(i)}
        when(checkInputMenu()){
            "1"   -> return "keliling persegi"
            "2"   -> return "keliling persegi panjang"
            "3"   -> return "keliling lingkaran"
            else    ->
            {
                println(falseInput)
                return menuKeliling()}
        }
    }
}