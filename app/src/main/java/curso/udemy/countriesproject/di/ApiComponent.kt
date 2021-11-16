package curso.udemy.countriesproject.di

import curso.udemy.countriesproject.model.CountriesService
import curso.udemy.countriesproject.viewmodel.ListViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: CountriesService)

    fun inject(viewModel: ListViewModel)
}