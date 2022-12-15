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

public class AdapterRoomHistoryDone extends RecyclerView.Adapter<AdapterRoomHistoryDone.ListRoomHistory>{

    private List<room_history> roomhistoryList;

    public AdapterRoomHistoryDone(List<room_history> roomhistoryList) {
        this.roomhistoryList = roomhistoryList;
    }

    @Override
    public int getItemCount() {
        if(roomhistoryList != null) {
            return roomhistoryList.size();
        }
        return 0;
    }

    public class ListRoomHistory extends RecyclerView.ViewHolder{
        private ImageView _171;
        private TextView _172, _174, _176, _175, _178;

        public ListRoomHistory(@NonNull View itemView) {
            super(itemView);
            _171 = itemView.findViewById(R.id._171);
            _172 = itemView.findViewById(R.id._172);
            _174 = itemView.findViewById(R.id._174);
            _176 = itemView.findViewById(R.id._176);
            _178 = itemView.findViewById(R.id._178);
            _175 = itemView.findViewById(R.id._175);
        }
    }

    @NonNull
    @Override
    public ListRoomHistory onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_room_history_done, parent, false);
        return new ListRoomHistory(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListRoomHistory holder, int position) {

        final room_history room_history_1 = roomhistoryList.get(position);
        if (room_history_1 == null) {
            return;
        }
        holder._171.setImageResource(room_history_1.getImgRoomHistory());
        holder._172.setText(room_history_1.getNameHotelHistory());
        holder._174.setText(String.valueOf(room_history_1.getPriceRoomHistory()));
        holder._175.setText(room_history_1.getStayDate());
        holder._176.setText(room_history_1.getTypeRoomHistory());
        holder._178.setText(room_history_1.getAddressRoomHistory());
    }
}
