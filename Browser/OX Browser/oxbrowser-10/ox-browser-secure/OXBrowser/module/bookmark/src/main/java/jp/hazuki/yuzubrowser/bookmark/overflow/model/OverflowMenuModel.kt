

package jp.hazuki.yuzubrowser.bookmark.overflow.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import jp.hazuki.bookmark.BR

class OverflowMenuModel(val id: Int, enable: Boolean, val title: String) : BaseObservable() {

    @get:Bindable
    var enable: Boolean = enable
        set(value) {
            field = value
            notifyPropertyChanged(BR.enable)
        }


    fun itemClick() {
        enable = !enable
    }
}
