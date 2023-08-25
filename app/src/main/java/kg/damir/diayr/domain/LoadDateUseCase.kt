package kg.damir.diayr.domain


class LoadDateUseCase (
    private val repository: MenuRepository
    ) {
    operator fun invoke() = repository.loadData()
}