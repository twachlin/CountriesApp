package curso.udemy.countriesproject.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import curso.udemy.countriesproject.Country
import curso.udemy.countriesproject.R
import curso.udemy.countriesproject.databinding.ActivityMainBinding
import curso.udemy.countriesproject.viewmodel.ListViewModel

class MainActivity : AppCompatActivity() {

    private val countries = arrayListOf<Country>(
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.countriesList)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = CountryListAdapter(countries)

        recyclerView.adapter = adapter
    }
}