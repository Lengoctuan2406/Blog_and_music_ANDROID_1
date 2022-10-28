package com.example.bookinghotel.fragment_room_history;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bookinghotel.R;
import com.example.bookinghotel.adapter.AdapterBlog;
import com.example.bookinghotel.adapter.AdapterRoomHistory;
import com.example.bookinghotel.adapter.room_history;

import java.util.ArrayList;
import java.util.List;

public class DoingFragment extends Fragment {

    RecyclerView recyclerView_doingHistory;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView_doingHistory = (RecyclerView) view.findViewById(R.id.rvc_list_doing);
        RecyclerView.LayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView_doingHistory.setLayoutManager(gridLayoutManager);

        AdapterRoomHistory adapter_room_history = new AdapterRoomHistory(getListRoomHistory());
        recyclerView_doingHistory.setAdapter(adapter_room_history);

    }

    private List<room_history> getListRoomHistory() {
        List<room_history> room_history_models = new ArrayList<>();

        room_history_models.add(new room_history(R.drawable.image_blog_1, "Name Hotel", 200, 1, "Single beds", 2, 1, 2, "Da Nang"));
        room_history_models.add(new room_history(R.drawable.image_blog_1, "Name Hotel", 200, 1, "Single beds", 2, 1, 2, "Da Nang"));

        return room_history_models;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_doing, container, false);
    }
}