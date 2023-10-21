

package jp.hazuki.yuzubrowser.bookmark.overflow.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.transaction
import jp.hazuki.bookmark.R
import jp.hazuki.yuzubrowser.bookmark.overflow.HideMenuType
import jp.hazuki.yuzubrowser.bookmark.overflow.MenuType
import jp.hazuki.yuzubrowser.ui.app.ThemeActivity

class BookmarkOverflowMenuActivity : ThemeActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_base)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        if (savedInstanceState == null) {
            supportFragmentManager.transaction {
                replace(R.id.container,
                    BookmarkOverflowMenuFragment.create(intent?.getIntExtra(EXTRA_MENU_TYPE, MenuType.SITE)
                        ?: MenuType.SITE))
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }

    companion object {
        const val EXTRA_MENU_TYPE = "type"

        fun createIntent(context: Context, @HideMenuType type: Int): Intent {
            return Intent(context, BookmarkOverflowMenuActivity::class.java).apply {
                putExtra(EXTRA_MENU_TYPE, type)
            }
        }
    }
}
