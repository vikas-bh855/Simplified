package com.retrofit.movies

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View


class CustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : View(
    context, attrs, defStyle
) {
    private var mPath: Path? = null
    private var mPaint: Paint? = null

    init {
        mPath = Path()
        mPaint = Paint()
        mPaint?.style = Paint.Style.STROKE
        mPaint?.strokeWidth = 5f
        mPaint?.color = Color.WHITE
    }

    override fun onDraw(canvas: Canvas?) {
        val path = Path()
        val height = measuredHeight.toFloat()
        val width = measuredWidth / height
        path.moveTo(width, height)
        path.lineTo(measuredWidth / 3.toFloat(), height)
        path.cubicTo(
            measuredWidth / 3.toFloat(),
            height - 100f,
            measuredWidth / 2.toFloat() + 200f,
            height - 100f,
            measuredWidth / 3.toFloat() + measuredWidth / 3.toFloat(),
            height
        )
        path.lineTo(measuredWidth.toFloat(), height.toFloat())
        canvas?.drawPath(path, mPaint!!)
        super.onDraw(canvas)
    }
}