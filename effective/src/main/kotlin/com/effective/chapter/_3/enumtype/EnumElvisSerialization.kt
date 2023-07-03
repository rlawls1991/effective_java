package com.effective.chapter._3.enumtype

import java.io.*


object EnumElvisSerialization {
    @JvmStatic
    fun main(args: Array<String>) {
        try {
            ObjectOutputStream(FileOutputStream("elvis.obj")).use { out -> out.writeObject(Elvis.INSTANCE) }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        try {
            ObjectInputStream(FileInputStream("elvis.obj")).use { `in` ->
                val elvis = `in`.readObject() as Elvis
                println(elvis === Elvis.INSTANCE)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
        }
    }
}
