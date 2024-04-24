package com.google.jitpacktest

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.AttrRes

/**
 * @author ll
 * @date 2022/2/10 0010
 * @description 最小宽度tablayout
 */
class MinSpacingTabLayout : SimpleTabLayout {

    constructor(context: Context) : super(context) {
        initMinWidth()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        initMinWidth()
    }

    constructor(context: Context, attrs: AttributeSet?, @AttrRes defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        initMinWidth()
    }

    private fun initMinWidth() {
        try {
            val field = SimpleTabLayout::class.java.getDeclaredField("scrollableTabMinWidth")
            field.isAccessible = true
            // 设定最小的间距
            field.set(this, 10)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
