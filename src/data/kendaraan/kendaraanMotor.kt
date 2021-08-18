package data.kendaraan

class kendaraanMotor(nomor:String, tahun:Int, merk:String, jenis:String="", warna:String=""):
    _Kendaraan(nomor, tahun, merk, jenis, warna,
        kelompokKendaraan = "motor"){
}