package com.stc.movie.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.stc.domain.entity.discover.MovieEntity
import com.stc.movie.BR
import com.stc.movie.R
import com.stc.movie.databinding.LoadingItemCellBinding
import com.stc.movie.databinding.MovieItemCellBinding

/**
 * by malek hamad
 * An adapter for displaying a list of movies with pagination support.
 *
 * @constructor Creates a [MoviePagingAdapter] instance.
 */
class MoviePagingAdapter :
    PagingDataAdapter<MovieEntity, RecyclerView.ViewHolder>(MovieComparator()) {

    companion object {
        private const val ITEM_VIEW_TYPE_MOVIE = 0
        private const val ITEM_VIEW_TYPE_LOADING = 1

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            ITEM_VIEW_TYPE_MOVIE -> {
                val binding: MovieItemCellBinding =
                    DataBindingUtil.inflate(inflater, R.layout.movie_item_cell, parent, false)
                MovieViewHolder(binding)
            }

            ITEM_VIEW_TYPE_LOADING -> {
                val loadingBinding: LoadingItemCellBinding =
                    DataBindingUtil.inflate(inflater, R.layout.loading_item_cell, parent, false)
                LoadingViewHolder(loadingBinding)
            }

            else -> throw IllegalArgumentException("Invalid viewType: $viewType")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (getItemViewType(position)) {
            ITEM_VIEW_TYPE_MOVIE -> {
                val movieViewHolder = holder as MovieViewHolder
                getItem(position)?.let { movieViewHolder.bind(it) }
            }

            ITEM_VIEW_TYPE_LOADING -> {
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (position < itemCount && getItem(position) != null) {
            ITEM_VIEW_TYPE_MOVIE
        } else {
            ITEM_VIEW_TYPE_LOADING
        }
    }

    inner class MovieViewHolder(private val binding: MovieItemCellBinding) :
        RecyclerView.ViewHolder(binding.root) {

        /**
         *
         * @param item The movie entity to bind.
         */
        fun bind(item: MovieEntity) {
            binding.setVariable(BR.movie, item)
            binding.executePendingBindings()
        }
    }

    /**
     * View holder for loading items.
     *
     * @param binding The data binding for the loading item.
     */
    inner class LoadingViewHolder(private val binding: LoadingItemCellBinding) :
        RecyclerView.ViewHolder(binding.root)
}

/**
 * A [DiffUtil.ItemCallback] implementation for comparing movie entities.
 */
class MovieComparator : DiffUtil.ItemCallback<MovieEntity>() {
    override fun areItemsTheSame(oldItem: MovieEntity, newItem: MovieEntity): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: MovieEntity, newItem: MovieEntity): Boolean {
        return oldItem == newItem
    }
}
