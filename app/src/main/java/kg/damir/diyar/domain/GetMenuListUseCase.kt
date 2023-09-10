package kg.damir.diyar.domain


class GetMenuListUseCase (val impl:MenuRepository){
     operator fun invoke() = impl.getMenuList()
}