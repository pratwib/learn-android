package com.pratwib.myunittest

class CuboidModel {
    private var width = 0.0
    private var length = 0.0
    private var height = 0.0

    fun getVolume(): Double = width * length * height

    fun getSurface(): Double {
        val w1 = width * length
        val w2 = width * height
        val w3 = length * height

        return 2 * (w1 + w2 + w3)
    }

    fun getCircumference(): Double = 4 * (width + length + height)

    fun save(width: Double, length: Double, height: Double) {
        this.width = width
        this.length = length
        this.height = height
    }
}