

package jp.hazuki.yuzubrowser.bookmark.overflow

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import jp.hazuki.yuzubrowser.bookmark.overflow.model.OverflowMenuModel
import jp.hazuki.yuzubrowser.bookmark.overflow.view.OverflowMenuAdapter

@BindingAdapter("bind:viewmodels")
internal fun RecyclerView.setViewModels(overflowMenuModels: List<OverflowMenuModel>?) {
    if (overflowMenuModels != null) {
        val adapter = adapter as OverflowMenuAdapter
        adapter.list.run {
            clear()
            addAll(overflowMenuModels)
        }
        adapter.notifyDataSetChanged()
    }
}
