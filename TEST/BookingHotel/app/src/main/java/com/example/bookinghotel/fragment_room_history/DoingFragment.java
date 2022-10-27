package com.example.bookinghotel.fragment_room_history;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookinghotel.R;
import com.example.bookinghotel.adapter.AdapterRoomHistoryDoing;
import com.example.bookinghotel.adapter.room_history;

import java.util.ArrayList;
import java.util.List;

public class DoingFragment extends Fragment {

    RecyclerView recyclerView_doing;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView_doing = (RecyclerView) view.findViewById(R.id.recyclerView_doing);
        GridLayoutManager gridLayoutManager_doing = new GridLayoutManager(getActivity(), 1);
        recyclerView_doing.setLayoutManager(gridLayoutManager_doing);

        AdapterRoomHistoryDoing adapterRoomHistory_doing = new AdapterRoomHistoryDoing(getListRoom_Doing());
        recyclerView_doing.setAdapter(adapterRoomHistory_doing);
//        AdapterBlog adapter_list_blog = new AdapterBlog(getListRoom_Doing());
//        recyclerView_doing.setAdapter(adapter_list_blog);
    }

    private List<room_history> getListRoom_Doing() {
        List<room_history> room_histories = new ArrayList<>();

        room_histories.add(new room_history(R.drawable.image_customer_test,"Name hotel", 25, 1, "2N - 1D", "Single beds", "Da Nang"));
        room_histories.add(new room_history(R.drawable.image_customer_test,"Name hotel ne", 30, 1, "2N - 1D", "Single beds", "Hoi An"));
        room_histories.add(new room_history(R.drawable.image_customer_test,"Name hotel", 14, 1, "2N - 1D", "Single beds", "Da Nang"));
        room_histories.add(new room_history(R.drawable.image_customer_test,"Name hotel", 15, 1, "2N - 1D", "Single beds", "Da Nang"));

        return room_histories;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_doing, container, false);
    }
}