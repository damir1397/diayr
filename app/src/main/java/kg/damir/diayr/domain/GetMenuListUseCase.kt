package kg.damir.diayr.domain


class GetMenuListUseCase (val impl:MenuRepository){
     operator fun invoke() = impl.getMenuList()
}