package com.effective.chapter._3.field


class Concert(private val paramIElvis: IElvis) {
    private var isLightsOn = false
    private var isMainStageOpen = false
    private val elvis = paramIElvis

    fun perform() {
        isMainStageOpen = true
        isLightsOn = true
        elvis.sing()
    }

    fun isLightsOn(): Boolean {
        return isLightsOn
    }

    fun isMainStageOpen(): Boolean {
        return isMainStageOpen
    }

    fun getElvis(): IElvis {
        return elvis
    }
}
