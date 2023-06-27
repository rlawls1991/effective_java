package com.effective.chapter._1

class Order {
    private var prime = false
    private var urgent = false
    private lateinit var product: Product
    private val orderStatus: OrderStatus? = null

    companion object {
        /*
            1. 이름을 가질 수 있다.
                primeOrder, urgentOrder 이름을 가질 수가 있음
        */
        fun primeOrder(product: Product): Order {
            val order = Order()
            order.prime = true
            order.product = product
            return order
        }

        fun urgentOrder(product: Product): Order {
            val order = Order()
            order.urgent = true
            order.product = product
            return order
        }

        @JvmStatic
        fun main(args: Array<String>) {
            val order = Order()
            /*
                3. 반환 타입의 하위 타입 객체를 반환할 수 있는 능력이 있다.
             */
            if (order.orderStatus === OrderStatus.DELIVERED) {
                println("delivered")
            }
        }
    }
}