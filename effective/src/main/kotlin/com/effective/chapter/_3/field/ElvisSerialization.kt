package com.effective.chapter._3.field

import java.io.*


object ElvisSerialization {
    @JvmStatic
    fun main(args: Array<String>) {
        try {
            ObjectOutputStream(FileOutputStream("elvis.obj")).use { out -> out.writeObject(Elvis.INSTANCE) }

            ObjectInputStream(FileInputStream("elvis.obj")).use { line ->
                val elvis3 = line.readObject() as Elvis
                println(elvis3 === Elvis.INSTANCE)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
        }
    }
}
