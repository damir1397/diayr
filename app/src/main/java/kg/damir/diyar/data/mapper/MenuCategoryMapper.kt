package kg.damir.diyar.data.mapper

import kg.damir.diyar.data.database.model.MenuCategoryDbModel
import kg.damir.diyar.data.network.model.MenuCategoryDto

class MenuCategoryMapper {

     fun mapMenuCategoryDbModelToMenuCategoryDto(it: MenuCategoryDbModel) =
        MenuCategoryDto(
            id = it.menuCategoryId,
            name_en = it.name_en,
            name_ru = it.name_ru,
            name_ky = it.name_ky,
            alias = it.alias,
            create_time = it.create_time,
            sort_number = it.sort_number,
            category_view = it.category_view,
        )
    fun mapMenuMenuCategoryDtoToCategoryDbModel(it: MenuCategoryDto) =
        MenuCategoryDbModel(
            menuCategoryId = it.id,
            name_en = it.name_en,
            name_ru = it.name_ru,
            name_ky = it.name_ky,
            alias = it.alias,
            create_time = it.create_time,
            sort_number = it.sort_number,
            category_view = it.category_view,
        )
}