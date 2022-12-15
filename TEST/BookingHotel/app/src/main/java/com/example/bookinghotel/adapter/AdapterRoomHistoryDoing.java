package com.example.bookinghotel.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookinghotel.R;
import com.example.bookinghotel.database.room_history;

import java.util.List;

public class AdapterRoomHistoryDoing extends RecyclerView.Adapter<AdapterRoomHistoryDoing.ListRoomHistory> {

    private List<room_history> roomhistoryList;

    public AdapterRoomHistoryDoing(List<room_history> roomhistoryList) {
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

        final room_history room_history_1 = roomhistoryList.get(position);
        if (room_history_1 == null) {
            return;
        }
        holder._162.setImageResource(room_history_1.getImgRoomHistory());
        holder._163.setText(room_history_1.getNameHotelHistory());
        holder._165.setText(String.valueOf(room_history_1.getPriceRoomHistory()));
        holder._166.setText(room_history_1.getStayDate());
        holder._167.setText(room_history_1.getTypeRoomHistory());
        holder._169.setText(room_history_1.getAddressRoomHistory());
    }
}
