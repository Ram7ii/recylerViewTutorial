  package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
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
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_4,
            R.drawable.img_5

        )
        var newsHeadingArray = arrayOf(
            "UK offers peacekeeping troops to Ukraine as Europeans hold emergency summit",
            "BAFTA 2025: 'All We Imagine As Light' loses award to 'Emilia Perez'",
            "Xi Jinping offers support to Jack Ma, other private sector leaders in China",
            "Airbus struggles to raise A350 output on delays in fuselage parts arrival",
            "Russia wheat export prices rise for 4th consecutive week, shipments decline"
        )

        // to set hav bhav of items inside recycler view, vertical scrolling , horizonatal scrolilng , uniform grid

        myRecyclerView.layoutManager=LinearLayoutManager(this)
        newsArrayList= arrayListOf<News>()

        for( i in newsImageArray.indices){
            val news = News(newsHeadingArray[i],newsImageArray[i])
            newsArrayList.add(news)
        }

        myRecyclerView.adapter = MyAdapter(newsArrayList,this)



    }
}