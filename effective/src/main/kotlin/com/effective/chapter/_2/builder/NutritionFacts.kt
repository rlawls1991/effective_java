package com.effective.chapter._2.builder

// 코드 2-3 빌더 패턴 - 점층적 생성자 패턴과 자바빈즈 패턴의 장점만 취했다. (17~18쪽)
data class NutritionFacts(
    val servingSize: Int,
    val servings: Int,
    val calories: Int = 0,
    val fat: Int = 0,
    val sodium: Int = 0,
    val carbohydrate: Int = 0
)

fun main() {
    val cocaCola = NutritionFacts(
        servingSize = 240,
        servings = 8,
        calories = 100,
        sodium = 35,
        carbohydrate = 27
    )
}