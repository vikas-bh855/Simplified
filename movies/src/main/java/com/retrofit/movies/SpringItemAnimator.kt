package com.retrofit.movies

import android.view.View
import androidx.dynamicanimation.animation.SpringAnimation
import androidx.dynamicanimation.animation.SpringForce
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.RecyclerView

class SpringItemAnimator : DefaultItemAnimator() {
    private val pendingAdds = mutableListOf<RecyclerView.ViewHolder>()
    override fun animateAdd(holder: RecyclerView.ViewHolder): Boolean {
        holder.itemView.alpha = 0f
        holder.itemView.translationY = holder.itemView.bottom / 3f
        pendingAdds.add(holder)
        return true
    }
    override fun runPendingAnimations() {
        super.runPendingAnimations()
        if (pendingAdds.isNotEmpty()) {
            for (i in pendingAdds.indices.reversed()) {
                val holder = pendingAdds[i]

                val tySpring = SpringAnimation(holder.itemView, SpringAnimation.TRANSLATION_Y).apply {
                    SpringForce().apply {
                        stiffness = 350f
                        dampingRatio = 0.6f
                    }
                }
                val aSpring = SpringAnimation(holder.itemView, SpringAnimation.ALPHA).apply {
                    SpringForce().apply {
                        stiffness = 100f
                        dampingRatio = SpringForce.DAMPING_RATIO_NO_BOUNCY
                    }
                }
                dispatchAddStarting(holder)
                aSpring.animateToFinalPosition(1f)
                tySpring.animateToFinalPosition(0f)
                pendingAdds.removeAt(i)
            }
        }
    }





    override fun endAnimation(holder: RecyclerView.ViewHolder) {
        SpringAnimation(holder.itemView, SpringAnimation.TRANSLATION_Y).apply {
            SpringForce().apply {
                stiffness = 350f
                dampingRatio = 0.6f
            }
        }.cancel()
        val aSpring = SpringAnimation(holder.itemView, SpringAnimation.ALPHA).apply {
            SpringForce().apply {
                stiffness = 100f
                dampingRatio = SpringForce.DAMPING_RATIO_NO_BOUNCY
            }
        }.cancel()
        if (pendingAdds.remove(holder)) {
            dispatchAddFinished(holder)
            clearAnimatedValues(holder.itemView)
        }
        super.endAnimation(holder)
    }

    override fun endAnimations() {
        for (i in pendingAdds.indices.reversed()) {
            val holder = pendingAdds[i]
            clearAnimatedValues(holder.itemView)
            dispatchAddFinished(holder)
            pendingAdds.removeAt(i)
        }
        super.endAnimations()
    }

    override fun isRunning(): Boolean {
        return pendingAdds.isNotEmpty() || super.isRunning()
    }

    private fun dispatchFinishedWhenDone() {
        if (!isRunning) {
            dispatchAnimationsFinished()
        }
    }

    private fun clearAnimatedValues(view: View) {
        view.alpha = 1f
        view.translationY = 0f
    }
}
