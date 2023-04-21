package com.solids.springdemokotlin.utils

import java.net.MalformedURLException
import java.net.URISyntaxException
import java.net.URL

fun isValidUrl(url: String?): Boolean {
    return try {
        URL(url).toURI()
        true
    } catch (e: MalformedURLException) {
        false
    } catch (e: URISyntaxException) {
        false
    }
}