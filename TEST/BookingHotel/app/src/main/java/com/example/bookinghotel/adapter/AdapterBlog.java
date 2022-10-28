package com.example.bookinghotel.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookinghotel.R;

import java.util.List;

public class AdapterBlog extends RecyclerView.Adapter<AdapterBlog.ListBlog> {

    private List<blog> blogModel;

    public AdapterBlog(List<blog> blogModel) {
        this.blogModel = blogModel;
    }

    @NonNull
    @Override
    public ListBlog onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_blog, parent, false);
        return new ListBlog(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListBlog holder, int position) {

        final blog blog1 = blogModel.get(position);
        if(blog1 == null){
            return;
        }
        holder.img_list_blog.setImageResource(blog1.getImgBlog());
        holder.name_list_blog.setText(blog1.getNameBlog());
        holder.address_list_blog.setText(blog1.getAddressBlog());
    }

    @Override
    public int getItemCount() {
        if(blogModel != null) {
            return blogModel.size();
        }
        return 0;
    }

    public class ListBlog extends RecyclerView.ViewHolder {

        private ImageView img_list_blog;
        private TextView name_list_blog, address_list_blog;
        private CardView adapterLayout_list_blog;

        public ListBlog(@NonNull View itemView) {
            super(itemView);

            img_list_blog = itemView.findViewById(R.id.img_list_blog);
            name_list_blog = itemView.findViewById(R.id.name_list_blog);
            address_list_blog = itemView.findViewById(R.id.address_list_blog);
            adapterLayout_list_blog = itemView.findViewById(R.id.adapterLayout_list_blog);
        }
    }
}
