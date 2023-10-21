

package jp.hazuki.yuzubrowser.browser.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import jp.hazuki.yuzubrowser.browser.BrowserActivity
import jp.hazuki.yuzubrowser.download.DownloadDialogModule
import jp.hazuki.yuzubrowser.legacy.di.WebViewModule

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [WebViewModule::class, DownloadDialogModule::class])
    abstract fun contributeBrowserActivity(): BrowserActivity
}
