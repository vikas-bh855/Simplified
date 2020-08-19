package com.architecture.simplified


import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.architecture.simplified.databinding.OnboardingActivityBinding
import com.architecture.simplified.ui.slideshow.OnBoardingViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class OnBoardingActivity : AppCompatActivity() {

    private lateinit var pagerPager: ViewPagerPager
    private lateinit var pagerTransFormer: PagerTransformer

    @Inject
    lateinit var preference: SharedPreferenceStorage
    private val viewModel: OnBoardingViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: OnboardingActivityBinding = DataBindingUtil.setContentView(
            this, R.layout.onboarding_activity
        )
        binding.apply {
            viewmodel = viewModel
            lifecycleOwner = lifecycleOwner
            pager.adapter = OnboardingAdapter(this@OnBoardingActivity)
            pagerPager = ViewPagerPager(pager, viewModel)
            pagerTransFormer = PagerTransformer()
            pager.setPageTransformer(pagerTransFormer)
            binding.buttonText = ButtonText("Next")
        }
        preference.onboardingCompleted = false
        viewModel.startButton.observe(this, Observer {
            if (binding.pager.currentItem == 2)
                startActivity(Intent(this, MainActivity::class.java))
            else
                pagerPager.advance()
        })
        viewModel.buttonText.observe(this, Observer { binding.buttonText = ButtonText(it) })

    }
}

class OnboardingAdapter(fragmentManager: FragmentActivity) : FragmentStateAdapter(fragmentManager) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return LearnLanguagesFragment()
            1 -> return BuildHabitFragment()
            else -> return GetAwardsFragment()
        }
    }
}
