import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.Guideline
import androidx.recyclerview.widget.RecyclerView
import com.architecture.simplified.PagerActivity.Companion.SCALE_MIN
import com.architecture.simplified.R

class ItemAdapter(
        val parent: View,
        private val verticalGuideline: Guideline,
        private val imagesSize: Float, private val imagesMargin: Float, val list: List<Drawable?>
) :
        RecyclerView.Adapter<ItemAdapter.ItemHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_images, parent, false))
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val marginLayoutParams = holder.itemView.layoutParams as ViewGroup.MarginLayoutParams
        val layoutParams = verticalGuideline.layoutParams as ConstraintLayout.LayoutParams
        val parentMargin = layoutParams.guidePercent * parent.width
        marginLayoutParams.marginStart = imagesMargin.toInt()
        marginLayoutParams.marginEnd = imagesMargin.toInt()
        if (position == 0) {
            marginLayoutParams.marginStart = parentMargin.toInt() + 10
        } else if (position == itemCount - 1) {
            marginLayoutParams.marginEnd = (parent.width - (parentMargin + imagesSize / 2)).toInt()
        }

        if (position != 0) {
            marginLayoutParams.width = (imagesSize * SCALE_MIN).toInt()
            marginLayoutParams.height = (imagesSize * SCALE_MIN * 0.5f).toInt()
        }

        val image = holder.itemView.findViewById<ImageView>(R.id.ivItem)
        image.setImageDrawable(list[position])

        holder.itemView.requestLayout()
    }

    override fun getItemCount(): Int = 6

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}