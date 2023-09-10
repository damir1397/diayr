package kg.damir.diyar.domain


class LoadDateUseCase (
    private val repository: MenuRepository
    ) {
    operator fun invoke() = repository.loadData()
}