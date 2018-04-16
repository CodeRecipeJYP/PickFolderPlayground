package com.asuscomm.yangyinetwork.pickfolderplayground

import com.asuscomm.yangyinetwork.pickfolderplayground.Colors.AMBER500
import com.asuscomm.yangyinetwork.pickfolderplayground.Colors.BLUE500
import com.asuscomm.yangyinetwork.pickfolderplayground.Colors.BLUE_GREY500
import com.asuscomm.yangyinetwork.pickfolderplayground.Colors.BROWN500
import com.asuscomm.yangyinetwork.pickfolderplayground.Colors.CYAN500
import com.asuscomm.yangyinetwork.pickfolderplayground.Colors.DEEP_ORANGE500
import com.asuscomm.yangyinetwork.pickfolderplayground.Colors.DEEP_PURPLE500
import com.asuscomm.yangyinetwork.pickfolderplayground.Colors.GREEN500
import com.asuscomm.yangyinetwork.pickfolderplayground.Colors.GREY500
import com.asuscomm.yangyinetwork.pickfolderplayground.Colors.INDIGO500
import com.asuscomm.yangyinetwork.pickfolderplayground.Colors.LIGHT_BLUE500
import com.asuscomm.yangyinetwork.pickfolderplayground.Colors.LIGHT_GREEN500
import com.asuscomm.yangyinetwork.pickfolderplayground.Colors.LIME500
import com.asuscomm.yangyinetwork.pickfolderplayground.Colors.ORANGE500
import com.asuscomm.yangyinetwork.pickfolderplayground.Colors.TEAL500
import com.asuscomm.yangyinetwork.pickfolderplayground.Colors.YELLOW500


object Colors {
    const val BLUE500: String = "BLUE500"
    const val INDIGO500: String = "INDIGO500"
    const val DEEP_PURPLE500: String = "DEEP_PURPLE500"

    const val LIGHT_BLUE500: String = "LIGHT_BLUE500"
    const val CYAN500: String = "CYAN500"
    const val TEAL500: String = "TEAL500"

    const val GREEN500: String = "GREEN500"
    const val LIGHT_GREEN500: String = "LIGHT_GREEN500"
    const val LIME500: String = "LIME500"

    const val YELLOW500: String = "YELLOW500"
    const val AMBER500: String = "AMBER500"
    const val ORANGE500: String = "ORANGE500"

    const val DEEP_ORANGE500: String = "DEEP_ORANGE500"
    const val BROWN500: String = "BROWN500"
    const val GREY500: String = "GREY500"

    const val BLUE_GREY500: String = "BLUE_GREY500"
}


val FOLDER_COLOR: Map<String, Int> = HashMap<String, Int>()
        .apply {
            put(BLUE500, 0xFF362020.toInt())
            put(INDIGO500, 0xFF3F51B5.toInt())
            put(DEEP_PURPLE500, 0xFF673AB7.toInt())

            put(LIGHT_BLUE500, 0xFF03A9F4.toInt())
            put(CYAN500, 0xFF00BCD4.toInt())
            put(TEAL500, 0xFF009688.toInt())

            put(GREEN500, 0xFF4CAF50.toInt())
            put(LIGHT_GREEN500, 0xFF8BC34A.toInt())
            put(LIME500, 0xFFCDDC39.toInt())

            put(YELLOW500, 0xFFFFEB3B.toInt())
            put(AMBER500, 0xFFFFC107.toInt())
            put(ORANGE500, 0xFFFF9800.toInt())

            put(DEEP_ORANGE500, 0xFFFF5722.toInt())
            put(BROWN500, 0xFF795548.toInt())
            put(GREY500, 0xFF9E9E9E.toInt())

            put(BLUE_GREY500, 0xFF607D8B.toInt())
        }
