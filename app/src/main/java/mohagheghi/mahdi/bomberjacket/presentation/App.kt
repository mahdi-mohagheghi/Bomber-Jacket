package mohagheghi.mahdi.bomberjacket.presentation

import android.app.Application
import mohagheghi.mahdi.bomberjacket.data.di.localModule
import mohagheghi.mahdi.bomberjacket.data.di.repoModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.logger.Level

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin()
    }

    private fun initKoin() {
        startKoin {
            androidLogger(level = Level.ERROR)
            androidContext(this@App)
            modules(localModule, repoModule)
        }
    }
}