package com.twenk11k.pokeapibasic.binding

import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object ViewBinding {

    @JvmStatic
    @BindingAdapter("gone")
    fun bindGone(view: View, isGone: Boolean) {
        view.visibility = if (isGone) {
            View.GONE
        } else {
            View.VISIBLE
        }
    }

    @JvmStatic
    @BindingAdapter("toast")
    fun bindToast(view: View, text: String?) {
        text?.let {
            Toast.makeText(view.context, it, Toast.LENGTH_SHORT).show()
        }
    }

    @JvmStatic
    @BindingAdapter("loadImage")
    fun bindLoadImage(
        view: ImageView,
        url: String?
    ) {
        Glide.with(view.context)
            .load(url)
            .centerCrop()
            .into(view)
    }

}