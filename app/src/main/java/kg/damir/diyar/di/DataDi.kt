package kg.damir.diyar.di

import kg.damir.diyar.data.repository.MenuRepositoryImpl
import org.koin.dsl.module

val dataModule = module {
    single<MenuRepositoryImpl> {
        MenuRepositoryImpl(application = get())
    }
}