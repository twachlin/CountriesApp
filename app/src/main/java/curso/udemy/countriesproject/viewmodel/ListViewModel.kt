package curso.udemy.countriesproject.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import curso.udemy.countriesproject.Country

class ListViewModel: ViewModel() {

    val countries = MutableLiveData<ArrayList<Country>>()
    val countryLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh(){
        fetchCountries()
    }

    private fun fetchCountries() {
        val mockData = arrayListOf<Country>(Country("CountryA"),
            Country("CountryB"),
            Country("CountryC"),
            Country("CountryD"),
            Country("CountryE"),
            Country("CountryF"),
            Country("CountryG"),
            Country("CountryH"),
            Country("CountryI"),
            Country("CountryJ")
        )
        countryLoadError.value = false
        loading.value = false
        countries.value = mockData
    }
}