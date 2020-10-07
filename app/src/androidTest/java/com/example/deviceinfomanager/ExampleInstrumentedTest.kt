package com.example.deviceinfomanager

import android.os.Build
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    /*@Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.deviceinfomanager", appContext.packageName)
    }*/

    @Test
    fun BOARD() {
        assertEquals("", Build.BOARD)
    }

    @Test
    fun BOOTLOADER() {
        assertEquals("", Build.BOOTLOADER)
    }

    @Test
    fun TAGS() {
        assertEquals("", Build.TAGS)
    }

    @Test
    fun DEVICE() {
        assertEquals("", Build.DEVICE)
    }

    @Test
    fun DISPLAY() {
        assertEquals("", Build.DISPLAY)
    }

    @Test
    fun FINGERPRINT() {
        assertEquals("", Build.FINGERPRINT)
    }

    @Test
    fun HARDWARE() {
        assertEquals("", Build.HARDWARE)
    }

    @Test
    fun BRAND() {
        assertEquals("", Build.BRAND)
    }

    @Test
    fun HOST() {
        assertEquals("", Build.HOST)
    }

    @Test
    fun ID() {
        assertEquals("", Build.ID)
    }

    @Test
    fun MANUFACTURER() {
        assertEquals("", Build.MANUFACTURER)
    }

    @Test
    fun MODEL() {
        assertEquals("", Build.MODEL)
    }

    @Test
    fun PRODUCT() {
        assertEquals("", Build.PRODUCT)
    }

    @Test
    fun TIME() {
        assertEquals("", Build.TIME)
    }

    @Test
    fun TYPE() {
        assertEquals("", Build.TYPE)
    }

    @Test
    fun UNKNOWN() {
        assertEquals("", Build.UNKNOWN)
    }

    @Test
    fun USER() {
        assertEquals("", Build.USER)
    }

    @Test
    fun getSerial() {
        assertEquals("", Build.getSerial())
    }
}