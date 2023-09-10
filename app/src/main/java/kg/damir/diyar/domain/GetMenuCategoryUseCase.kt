package kg.damir.diyar.domain


class GetMenuCategoryUseCase (val impl:MenuRepository){
     operator fun invoke() = impl.getMenuCategoryList()
}