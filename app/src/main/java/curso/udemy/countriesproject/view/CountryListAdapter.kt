package curso.udemy.countriesproject.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import curso.udemy.countriesproject.Country
import curso.udemy.countriesproject.R
import curso.udemy.countriesproject.util.getProgressDrawable
import curso.udemy.countriesproject.util.loadImage

class CountryListAdapter(var countries: ArrayList<Country>) :
    RecyclerView.Adapter<CountryListAdapter.CountryViewHolder>() {

    fun updateCountries(newCountries: ArrayList<Country>){
        countries.clear()
        countries.addAll(newCountries)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_country, parent, false)

        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val item = countries[position]

        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return countries.size
    }

    class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val countryName: TextView = itemView.findViewById(R.id.country_name)
        private val countryCapital: TextView = itemView.findViewById(R.id.country_capital)
        private val countryFlag: ImageView = itemView.findViewById(R.id.country_flag)
        private val progressDrawable = getProgressDrawable(itemView.context)

        fun bind (item: Country){
            countryName.text = item.countryName
            countryCapital.text = item.capital
            countryFlag.loadImage(item.flag, progressDrawable)
        }
    }
}