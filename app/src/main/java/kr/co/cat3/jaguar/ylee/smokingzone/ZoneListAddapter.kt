package kr.co.cat3.jaguar.ylee.smokingzone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import kr.co.cat3.jaguar.ylee.smokingzone.databinding.CustomListContainerBinding

class ZoneListAddapter()
    : ListAdapter<String, ZoneListAddapter.ViewHolder>(InfoDiffCallBack) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = CustomListContainerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.viewBind(item)
    }

    class ViewHolder(binding: CustomListContainerBinding)
        : RecyclerView.ViewHolder(binding.root) {

        val title: TextView
        val btn : ImageView
        val infoFrame : ConstraintLayout
        val info: TextView

        init {
            title = binding.customListTitle
            btn = binding.customListDropDownBtn
            infoFrame = binding.customListContentContainter
            info = binding.customListContent
//            TODO(2개 단계에 대해서 보다 간단하게 처리할 수 있는 방법으로 변경하기)
            btn.setOnClickListener {
                if (infoFrame.visibility == View.GONE) {
                    it.setBackgroundResource(R.drawable.ic_baseline_arrow_drop_up_24)
                    infoFrame.visibility = View.VISIBLE
                } else {
                    it.setBackgroundResource(R.drawable.ic_baseline_arrow_drop_down_24)
                    infoFrame.visibility = View.GONE
                }
            }
        }

        fun viewBind(item: String) {
            val firstString = item.split(",")
            title.text = firstString[0]
            info.text = firstString[1]
        }
    }
}

object InfoDiffCallBack : DiffUtil.ItemCallback<String>() {
    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem === newItem
    }
}