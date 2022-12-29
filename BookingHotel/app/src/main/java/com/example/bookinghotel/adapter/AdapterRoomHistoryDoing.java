package com.example.bookinghotel.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookinghotel.R;
import com.example.bookinghotel.database._2_table;

import java.util.List;

public class AdapterRoomHistoryDoing extends RecyclerView.Adapter<AdapterRoomHistoryDoing.ListRoomHistory> {

    private List<_2_table> roomhistoryList;

    public AdapterRoomHistoryDoing(List<_2_table> roomhistoryList) {
        this.roomhistoryList = roomhistoryList;
    }

    @Override
    public int getItemCount() {
        if (roomhistoryList != null) {
            return roomhistoryList.size();
        }
        return 0;
    }

    public class ListRoomHistory extends RecyclerView.ViewHolder {
        private ImageView _162;
        private TextView _163, _165, _167, _166, _169;

        public ListRoomHistory(@NonNull View itemView) {
            super(itemView);
            _162 = itemView.findViewById(R.id._162);
            _163 = itemView.findViewById(R.id._163);
            _165 = itemView.findViewById(R.id._165);
            _167 = itemView.findViewById(R.id._167);
            _169 = itemView.findViewById(R.id._169);
            _166 = itemView.findViewById(R.id._166);
        }
    }

    @NonNull
    @Override
    public ListRoomHistory onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_room_history_doing, parent, false);
        return new ListRoomHistory(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListRoomHistory holder, int position) {

        final _2_table room_history_1 = roomhistoryList.get(position);
        if (room_history_1 == null) {
            return;
        }
        holder._162.setImageResource(room_history_1.picture_hotel);
        holder._163.setText(room_history_1.name_hotel);
        holder._165.setText(String.valueOf(room_history_1.price_hotel_detail));
        holder._166.setText(room_history_1.number_of_day_other);
        holder._167.setText(room_history_1.number_of_room_hotel_detail);
        holder._169.setText(room_history_1.address_hotel);
    }
}
