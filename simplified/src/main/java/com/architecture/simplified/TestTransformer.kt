import android.view.View
import android.widget.ImageView
import androidx.core.view.ViewCompat
import androidx.viewpager2.widget.ViewPager2
import com.architecture.simplified.R


class TestTransformer : ViewPager2.PageTransformer {
    override fun transformPage(view: View, position: Float) {
        val view = view as ViewPager2
        val imageLearn = view.findViewById<ImageView>(R.id.iv_learn)
        if (position < -1) {
            imageLearn.setAlpha(MIN_FADE)
        } else if (position < 0) {
            imageLearn.setAlpha(1 + position * (1 - MIN_FADE))
            imageLearn.translationX = -500f
            ViewCompat.setTranslationZ(view, position)
            val scaleFactor = (MIN_SCALE
                    + (MAX_SCALE - MIN_SCALE) * (1 - Math.abs(position)))
            imageLearn.setScaleX(scaleFactor)
            imageLearn.setScaleY(scaleFactor)
        } else if (position == 0f) {
            imageLearn.setAlpha(1f)
            imageLearn.translationX = -500f
            imageLearn.setScaleX(MAX_SCALE)
            ViewCompat.setTranslationZ(imageLearn, 0f)
            imageLearn.setScaleY(MAX_SCALE)
        } else if (position <= 1) {
            ViewCompat.setTranslationZ(imageLearn, -position)
            imageLearn.setAlpha(1 - position * (1 - MIN_FADE))
            imageLearn.translationX = -500f
            val scaleFactor = (MIN_SCALE
                    + (MAX_SCALE - MIN_SCALE) * (1 - Math.abs(position)))
            imageLearn.setScaleX(scaleFactor)
            imageLearn.setScaleY(scaleFactor)
        } else {
            imageLearn.translationX = -500f
            imageLearn.setAlpha(MIN_FADE)
        }
    }

    companion object {
        private const val MIN_SCALE = 0.5f
        private const val MAX_SCALE = 0.8f
        private const val MIN_FADE = 0.2f
    }
}