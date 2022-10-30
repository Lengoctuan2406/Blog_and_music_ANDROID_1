package com.example.bookinghotel.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookinghotel.R;

import java.util.List;

public class AdapterReview  extends RecyclerView.Adapter<AdapterReview.ListReview> {
    private List<review> reviews;

    public AdapterReview(List<review> reviews) {
        this.reviews = reviews;
    }

    @NonNull
    @Override
    public AdapterReview.ListReview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_review, parent, false);
        return new ListReview(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterReview.ListReview holder, int position) {
        review review = reviews.get(position);
        if(review == null) {
            return;
        }
        holder.avatar.setImageResource(review.getAvatar());
        holder.name.setText(review.getCreate_by());
        holder.content.setText(review.getContent());
    }

    @Override
    public int getItemCount() {
        if(reviews != null){
            return reviews.size();
        }
        return 0;
    }

    public class ListReview extends RecyclerView.ViewHolder {
        private ImageView avatar;
        private TextView name, content;


        public ListReview(@NonNull View itemView) {
            super(itemView);

            avatar = itemView.findViewById(R.id.img_review);
            name = itemView.findViewById(R.id.name_review);
            content = itemView.findViewById(R.id.content_review);
        }
    }
}
