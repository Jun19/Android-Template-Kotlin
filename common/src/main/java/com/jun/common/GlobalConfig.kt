package com.jun.common

import android.annotation.SuppressLint
import com.jun.common.utils.Preference

/**
 * 全局配置
 *
 * @author Jun
 * @time 2022/2/18
 */
@SuppressLint("StaticFieldLeak")
object GlobalConfig {
    var temp: String by Preference(Constants.Config.TEMP, "")

}