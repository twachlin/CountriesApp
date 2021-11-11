package curso.udemy.countriesproject.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import curso.udemy.countriesproject.Country
import curso.udemy.countriesproject.R
import curso.udemy.countriesproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //lateinit var viewModel: ListViewModel
    private val countries = listOf(
        Country("CountryA"),
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
    lateinit var countriesAdapter: CountryListAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        initRecycler()
    }

    private fun initRecycler() {
        binding.countriesList.layoutManager = LinearLayoutManager(this)
        countriesAdapter = CountryListAdapter(countries)
        binding.countriesList.adapter = countriesAdapter
    }
}