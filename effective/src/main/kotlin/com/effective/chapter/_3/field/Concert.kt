package com.effective.chapter._3.field


class Concert(private val elvis: IElvis) {
    private var isLightsOn = false
    private var isMainStageOpen = false

    fun perform() {
        isMainStageOpen = true
        isLightsOn = true
        elvis.sing()
    }
}
