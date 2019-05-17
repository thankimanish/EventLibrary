package com.eventlibrary


class EEvent {
    var lable: String? = null
    var element: String? = null
    var screen_name: String? = null
    constructor(category: String, action: String, label: String) {
        this.lable = category
        this.element = action
        this.screen_name = label
    }
}
