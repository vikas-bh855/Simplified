package com.retrofit.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.helper.widget.Carousel
import androidx.fragment.app.Fragment
import com.retrofit.movies.databinding.FragmentCarouselBinding

class FragmentRotate : Fragment() {
    private lateinit var binding: FragmentCarouselBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCarouselBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        /*binding.motionCarousel.setAdapter(object : Carousel.Adapter {
            override fun onNewItem(p0: Int) {

            }

            override fun count(): Int {
                return 5
            }

            override fun populate(p0: View?, p1: Int) {
            }
        })*/
    }





}