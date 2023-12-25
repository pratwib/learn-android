package com.pratwib.myunittest

class MainViewModel(private val cuboidModel: CuboidModel) {
    fun getCircumference() = cuboidModel.getCircumference()

    fun getVolume() = cuboidModel.getVolume()

    fun getSurface() = cuboidModel.getSurface()

    fun save(w: Double, l: Double, h: Double) {
        cuboidModel.save(w, l, h)
    }
}