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
import com.example.bookinghotel.adapter.AdapterRoomHistoryDone;
import com.example.bookinghotel.adapter.room_history;

import java.util.ArrayList;
import java.util.List;

public class DoneFragment extends Fragment {

    RecyclerView recyclerView_done;
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView_done = (RecyclerView) view.findViewById(R.id.recyclerView_done);
        GridLayoutManager gridLayoutManager_done = new GridLayoutManager(getActivity(), 1);
        recyclerView_done.setLayoutManager(gridLayoutManager_done);

        AdapterRoomHistoryDone adapterRoomHistory_done = new AdapterRoomHistoryDone(getListRoom_Done());
        recyclerView_done.setAdapter(adapterRoomHistory_done);
//        AdapterBlog adapter_list_blog = new AdapterBlog(getListRoom_Doing());
//        recyclerView_doing.setAdapter(adapter_list_blog);
    }

    private List<room_history> getListRoom_Done() {
        List<room_history> room_histories = new ArrayList<>();

        room_histories.add(new room_history(R.drawable.image_customer_test,"Name hotel done", 25, 0, "2N - 1D", "Single beds", "Da Nang"));
        room_histories.add(new room_history(R.drawable.image_customer_test,"Name hotel ne", 30, 0, "2N - 1D", "Single beds", "Hoi An"));
        room_histories.add(new room_history(R.drawable.image_customer_test,"Name hotel", 14, 0, "2N - 1D", "Single beds", "Da Nang"));
        room_histories.add(new room_history(R.drawable.image_customer_test,"Name hotel", 15, 0, "2N - 1D", "Single beds", "Da Nang"));

        return room_histories;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_done, container, false);
    }
}