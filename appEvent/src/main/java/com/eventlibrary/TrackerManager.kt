package com.eventlibrary

import android.app.Application
import android.content.Context
import android.content.res.Resources
import android.support.annotation.XmlRes
import android.util.Log

class TrackerManager private constructor(application: Application) {
    //private var mTracker: Tracker? = null
    private val resources: Resources

    init {
        resources = application.resources
        //mTracker = getDefaultTracker(application)
    }

    /**
     * @param Event analytics event object with lable, element, screen_name, custom dimension, etc.
     * @param prependScreenName true if we should prepend the current screen name to the event lable
     */
    fun sendUserEvent(eEvent: EEvent) {
        var eventLable = eEvent.lable
        var eventElement = eEvent.element
        var eventScreenName = eEvent.screen_name

        var events =
            "eventLable::" + eventLable + " eventElement::" + eventElement + " eventScreenName::" + eventScreenName
        Log.d(TAG, "buildUserEvent:$events")
        //Send data to big query from here
        //We can send data as to server
    }

    companion object {

        private val TAG = TrackerManager::class.java.simpleName
        var instance: TrackerManager? = null
            private set
        fun init(application: Application) {
            TrackerManager.instance = TrackerManager(application)
        }
    }
}
