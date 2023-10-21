package kg.damir.diyar.di

import kg.damir.diyar.domain.GetMenuCategoryUseCase
import kg.damir.diyar.domain.GetMenuListUseCase
import kg.damir.diyar.domain.LoadDateUseCase
import org.koin.dsl.module

val domainModule = module {
    factory<GetMenuListUseCase> { GetMenuListUseCase(get()) }
    factory<LoadDateUseCase> { LoadDateUseCase(get()) }
    factory<GetMenuCategoryUseCase> { GetMenuCategoryUseCase(get()) }
}