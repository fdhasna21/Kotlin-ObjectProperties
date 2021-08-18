package data.gadget

import app.printNotEmpty

open class _Gadget(
    open var seriGadget:String="",
    open var merkGadget:String="",
    open var ramGadget:Int,
    open var processorGadget:String="",
    open var resolusiGadget:String="" ,
    open var kelompokGadget:String=""){

    open fun showData(){
        println("${kelompokGadget.capitalize()} ${merkGadget.capitalize()} $seriGadget" +
                printNotEmpty(ramGadget.toString(),"memiliki RAM"," GB") +
                printNotEmpty(processorGadget, "dengan processor") +
                printNotEmpty(resolusiGadget,"berukuran"))
    }

}