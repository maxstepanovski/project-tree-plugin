package com.github.maxstepanovski.projecttreeplugin.model

data class ClassWrapper(
        val constructorParameters: MutableList<ValueParameter> = mutableListOf(),
        val fields: MutableList<ValueParameter> = mutableListOf(),
        val methods: MutableList<FunctionWrapper> = mutableListOf()
) {
    var name: String = ""
}
