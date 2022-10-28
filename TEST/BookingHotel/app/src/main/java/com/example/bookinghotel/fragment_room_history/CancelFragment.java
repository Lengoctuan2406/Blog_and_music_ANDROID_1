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
import com.example.bookinghotel.adapter.AdapterRoomHistoryCancel;
import com.example.bookinghotel.adapter.room_history;

import java.util.ArrayList;
import java.util.List;

public class CancelFragment extends Fragment {


    RecyclerView recyclerView_cancel;
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView_cancel = (RecyclerView) view.findViewById(R.id.recyclerView_cancel);
        GridLayoutManager gridLayoutManager_cancel = new GridLayoutManager(getActivity(), 1);
        recyclerView_cancel.setLayoutManager(gridLayoutManager_cancel);

        AdapterRoomHistoryCancel adapterRoomHistory_cancel = new AdapterRoomHistoryCancel(getListRoom_Cancel());
        recyclerView_cancel.setAdapter(adapterRoomHistory_cancel);
//        AdapterBlog adapter_list_blog = new AdapterBlog(getListRoom_Doing());
//        recyclerView_doing.setAdapter(adapter_list_blog);
    }

    private List<room_history> getListRoom_Cancel() {
        List<room_history> room_histories = new ArrayList<>();

        room_histories.add(new room_history(R.drawable.hotelroom1,"GO2JOY - WHITE LION ROOM", 179, 0, "2N - 1D", "Single beds", "Da Nang"));
        room_histories.add(new room_history(R.drawable.hotelroom2,"GO2JOY - MILAN 1 ROOM", 30, 0, "2N - 1D", "Single beds", "Hoi An"));
        room_histories.add(new room_history(R.drawable.hotelroom3,"GO2JOY- TRẦN GIA ROOM TÂN PHÚ", 14, 0, "2N - 1D", "Single beds", "Da Nang"));
        room_histories.add(new room_history(R.drawable.hotelroom1,"GO2JOY - BẠN TÔI ROOM", 15, 0, "2N - 1D", "Single beds", "Da Nang"));

        return room_histories;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cancel, container, false);
    }
}