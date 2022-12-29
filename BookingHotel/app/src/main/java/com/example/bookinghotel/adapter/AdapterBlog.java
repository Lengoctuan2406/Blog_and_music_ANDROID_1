package com.example.bookinghotel.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookinghotel.BlogDetail;
import com.example.bookinghotel.R;
import com.example.bookinghotel.database.blog;

import java.util.List;

public class AdapterBlog extends RecyclerView.Adapter<AdapterBlog.ListBlog> {
    private List<blog> blogList;

    public AdapterBlog(List<blog> blogList) {
        this.blogList = blogList;
    }

    @Override
    public int getItemCount() {
        if (blogList != null) {
            return blogList.size();
        }
        return 0;
    }

    public static class ListBlog extends RecyclerView.ViewHolder {
        private ImageView _140;
        private TextView _141, _142;
        private CardView adapterLayout_list_blog;
        private blog blog;

        public ListBlog(@NonNull View itemView) {
            super(itemView);
            _140 = itemView.findViewById(R.id._140);
            _141 = itemView.findViewById(R.id._141);
            _142 = itemView.findViewById(R.id._142);
            adapterLayout_list_blog = itemView.findViewById(R.id.adapterLayout_list_blog);
        }
    }

    @NonNull
    @Override
    public ListBlog onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_blog, parent, false);
        return new ListBlog(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListBlog holder, int position) {

        final blog blog1 = blogList.get(position);
        if (blog1 == null) {
            return;
        }
        holder._140.setImageResource(blog1.getImgBlog());
        holder._141.setText(blog1.getNameBlog());
        holder._142.setText(blog1.getAddressBlog());
        holder.adapterLayout_list_blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), BlogDetail.class);
                i.putExtra("img", blog1.getImgBlog());
                i.putExtra("name", blog1.getNameBlog());
                i.putExtra("address", blog1.getAddressBlog());
                i.putExtra("des", blog1.getDesBlog());
                v.getContext().startActivity(i);
            }
        });
    }
}