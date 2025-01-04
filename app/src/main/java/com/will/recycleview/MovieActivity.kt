package com.will.recycleview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.will.recycleview.adapter.MovieAdapter
import com.will.recycleview.model.ModelMovie

class MovieActivity : AppCompatActivity() {

    private var recyleView: RecyclerView? = null
    private var movieAdapter: MovieAdapter? = null
    private var movieList =  mutableListOf<ModelMovie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_movie)

        movieList = ArrayList()
        recyleView = findViewById(R.id.rv_movie)
        movieAdapter = MovieAdapter(this,movieList)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(
            this,2
        )
        recyleView!!.layoutManager = layoutManager
        recyleView!!.adapter = movieAdapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        prepareMovieList()

    }

    private fun prepareMovieList() {
        var movie = ModelMovie("Avatar",R.drawable.avatar)
        movieList.add(movie)
        movie = ModelMovie("Batman",R.drawable.batman)
        movieList.add(movie)
        movie = ModelMovie("Nisekoi",R.drawable.chitoge)
        movieList.add(movie)
        movie = ModelMovie("Lucy",R.drawable.lucy)
        movieList.add(movie)
        movie = ModelMovie("Avengers Endgame",R.drawable.end_game)
        movieList.add(movie)
        movie = ModelMovie("Hulk",R.drawable.hulk)
        movieList.add(movie)
        movie = ModelMovie("Jumanji",R.drawable.jumanji)
        movieList.add(movie)
        movie = ModelMovie("Jurassic World",R.drawable.jurassic_world)
        movieList.add(movie)
        movie = ModelMovie("Spider Man",R.drawable.spider_man)
        movieList.add(movie)
        movie = ModelMovie("Venom",R.drawable.venom)
        movieList.add(movie)
        movieAdapter!!.notifyDataSetChanged()
    }
}