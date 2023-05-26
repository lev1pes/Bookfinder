package com.example.bookfinder.presentation.result

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bookfinder.R
import com.example.bookfinder.data.model.BookInfo

class BookAdapter(
    private val bookInfo: BookInfo, private val navController: NavController
) : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val coverImageView: ImageView = itemView.findViewById(R.id.coverImageView)
        val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        val authorTextView: TextView = itemView.findViewById(R.id.authorTextView)
        val bookLayout: LinearLayout = itemView.findViewById(R.id.bookLayout)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.book_item, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = bookInfo.items?.get(position)

        Glide.with(holder.coverImageView.context).load(book?.volumeInfo?.imageLinks?.thumbnail)
            .into(holder.coverImageView)

        holder.nameTextView.text = book?.volumeInfo?.title
        holder.authorTextView.text = book?.volumeInfo?.authors?.first()

        holder.bookLayout.setOnClickListener {
            navController.navigate(ResultFragmentDirections.actionResultFragmentToBookFragment(book!!))
        }
    }

    override fun getItemCount(): Int {
        return bookInfo.items!!.size
    }
}
