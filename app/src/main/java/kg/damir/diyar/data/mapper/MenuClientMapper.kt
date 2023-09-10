package kg.damir.diyar.data.mapper

import kg.damir.diyar.data.database.model.MenuCategoryDbModel
import kg.damir.diyar.data.database.model.MenuDbModel
import kg.damir.diyar.data.database.model.PriceContainerDbModel
import kg.damir.diyar.data.network.model.MenuCategoryDto
import kg.damir.diyar.data.network.model.MenuClientDto
import kg.damir.diyar.data.network.model.PriceContainerDto

class MenuClientMapper {

    fun mapMenuDbModelToMenuCategoryDto(it: MenuDbModel) = MenuCategoryDto(
        id = it.menu_category_id.menuCategoryId,
        name_en = it.menu_category_id.name_en,
        name_ru = it.menu_category_id.name_ru,
        name_ky = it.menu_category_id.name_ky,
        alias = it.menu_category_id.alias,
        sort_number = it.menu_category_id.sort_number,
        category_view = it.menu_category_id.category_view
    )

    fun mapPriceContainerDbModelToPriceContainerDto(it: MenuDbModel) = PriceContainerDto(
        id = it.price_container_id.priceId,
        price = it.price_container_id.price
    )


    fun mapMenuDbModelToMenuClientDto(
        it: MenuDbModel
    ): MenuClientDto {

        val menuCategory = mapMenuDbModelToMenuCategoryDto(it)

        val priceContainer = mapPriceContainerDbModelToPriceContainerDto(it)

        return MenuClientDto(
            id = it.menu_id,
            name_en = it.name_en,
            name_ru = it.name_ru,
            name_ky = it.name_ky,
            dish_outlet = it.dish_outlet,
            price = it.price,
            menu_category_id = menuCategory,
            description = it.description,
            menu_photo = it.menu_photo,
            price_container_id = priceContainer,
            count_container = it.count_container,
            popular = it.popular
        )
    }

    fun mapMenuClientDtoToMenuDbModel(
        it: MenuClientDto
    ): MenuDbModel {
        val menuCategoryDbModel = mapMenuCategoryDtoToMenuCategoryDbModel(it)
        val priceContainerDbModel = mapPriceContainerDtoToPriceContainerDbModel(it)
        return MenuDbModel(
            menu_id = it.id ?: 0,
            name_ru = it.name_ru ?: "",
            name_ky = it.name_ky ?: "",
            name_en = it.name_en ?: "",
            dish_outlet = it.dish_outlet ?: "",
            price = it.price ?: 0,
            menu_category_id = menuCategoryDbModel,
            description = it.description ?: "",
            menu_photo = it.menu_photo ?: "",
            price_container_id = priceContainerDbModel,
            count_container = it.count_container,
            popular = it.popular ?: false

        )
    }

    fun mapPriceContainerDtoToPriceContainerDbModel(it: MenuClientDto) = PriceContainerDbModel(
        priceId = it.price_container_id?.id ?: 0,
        price = it.price_container_id?.price ?: 0
    )


    fun mapMenuCategoryDtoToMenuCategoryDbModel(it: MenuClientDto) = MenuCategoryDbModel(
        menuCategoryId = it.menu_category_id?.id ?: 0,
        name_en = it.menu_category_id?.name_en ?: "",
        name_ru = it.menu_category_id?.name_ru ?: "",
        name_ky = it.menu_category_id?.name_ky ?: "",
        alias = it.menu_category_id?.alias ?: "",
        sort_number = it.menu_category_id?.sort_number,
        category_view = it.menu_category_id?.category_view
    )

}