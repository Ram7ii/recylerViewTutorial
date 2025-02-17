  package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ActivityMainBinding

  class MainActivity : AppCompatActivity() {

    lateinit var myRecyclerView : RecyclerView
    lateinit var newsArrayList :ArrayList<News>
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var newsImageArray = arrayOf(
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5


        )
        var newsHeadingArray = arrayOf(
            "Nayanthara's Birthday Wish For Husband Vignesh Shivan Is Love, Actually",
            "Delhi High Court Permits Ashneer Grover, Wife To Travel To Doha And UK",
            "Afghanistan Bounce Back vs Zimbabwe to Level Series After Rashid-Naveen's Heroics",
            "India Women Name Squads for West Indies Series, Kashyap Earns Call-Up",
            "Supreme Court Considers Pleas to Review Judgment Upholding States' Right to Sub-Classify Scheduled Castes"
        )

        // to set hav bhav of items inside recycler view, vertical scrolling , horizonatal scrolilng , uniform grid  






    }
}