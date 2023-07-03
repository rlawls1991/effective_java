package com.effective.chapter._3.serialization

import java.io.*


class SerializationExample {
    private fun serialize(book: Book) {
        try {
            ObjectOutputStream(FileOutputStream("book.obj")).use { out -> out.writeObject(book) }
        } catch (e: IOException) {
            throw RuntimeException(e)
        }
    }

    private fun deserialize(): Book {
        try {
            ObjectInputStream(FileInputStream("book.obj")).use { `in` -> return `in`.readObject() as Book }
        } catch (e: IOException) {
            throw RuntimeException(e)
        } catch (e: ClassNotFoundException) {
            throw RuntimeException(e)
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
//        Book book = new Book("12345", "이팩티브 자바 완벽 공략", "백기선",
//                LocalDate.of(2022, 3, 21));
//        book.setNumberOfSold(200);
            val example = SerializationExample()
            //        example.serialize(book);
            val deserializedBook = example.deserialize()

//        System.out.println(book);
            System.out.println(deserializedBook)
        }
    }
}