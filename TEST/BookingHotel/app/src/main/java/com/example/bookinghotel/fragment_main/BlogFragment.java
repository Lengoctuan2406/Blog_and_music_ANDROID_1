package com.example.bookinghotel.fragment_main;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.bookinghotel.adapter.AdapterBlog;
import com.example.bookinghotel.R;
import com.example.bookinghotel.adapter.blog;

import java.util.ArrayList;
import java.util.List;

public class BlogFragment extends Fragment {

    RecyclerView recyclerView_listBlog;
    LinearLayout linearLayout_adapter_list_blog;
    CardView adapterLayout_list_blog;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView_listBlog = (RecyclerView) view.findViewById(R.id.rvc_list_blog);
        RecyclerView.LayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView_listBlog.setLayoutManager(gridLayoutManager);

        AdapterBlog adapter_list_blog = new AdapterBlog( getListBlog());
        recyclerView_listBlog.setAdapter(adapter_list_blog);

//        linearLayout_adapter_list_blog = (LinearLayout) view.findViewById(R.id.linearLayout_adapter_list_blog);
////        img_list_blog = (ImageView) view.findViewById(R.id.img_list_blog);
//        adapterLayout_list_blog = (CardView)view.findViewById(R.id.adapterLayout_list_blog);

    }

    private List<blog> getListBlog() {
        List<blog> blog_models = new ArrayList<>();

        blog_models.add(new blog(R.drawable.image_customer_test, "Name blog", "Address","Test Des Blog"));
        blog_models.add(new blog(R.drawable.image_customer_test, "Name ne", "Address",null));
        blog_models.add(new blog(R.drawable.image_customer_test, "Name blog", "Address",null));
        blog_models.add(new blog(R.drawable.image_customer_test, "Name blog", "Address",null));


        return blog_models;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blog, container, false);
    }
}