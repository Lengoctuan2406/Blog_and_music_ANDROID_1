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

public class AdapterRoomHistoryCancel extends RecyclerView.Adapter<AdapterRoomHistoryCancel.ListRoomHistory> {

    private List<room_history> roomhistoryList;

    public AdapterRoomHistoryCancel(List<room_history> roomhistoryList) {
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
        private ImageView img_roomHistory;
        private TextView nameHotel, priceRoom, typeRoom, stayDate, addressHotel;

        public ListRoomHistory(@NonNull View itemView) {
            super(itemView);
            img_roomHistory = itemView.findViewById(R.id._154);
            nameHotel = itemView.findViewById(R.id._155);
            priceRoom = itemView.findViewById(R.id._157);
            typeRoom = itemView.findViewById(R.id._159);
            addressHotel = itemView.findViewById(R.id._161);
            stayDate = itemView.findViewById(R.id._158);
        }
    }

    @NonNull
    @Override
    public ListRoomHistory onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_room_history_cancel, parent, false);
        return new ListRoomHistory(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListRoomHistory holder, int position) {
        final room_history room_history_1 = roomhistoryList.get(position);
        if (room_history_1 == null) {
            return;
        }
        holder.img_roomHistory.setImageResource(room_history_1.getImgRoomHistory());
        holder.nameHotel.setText(room_history_1.getNameHotelHistory());
        holder.priceRoom.setText(String.valueOf(room_history_1.getPriceRoomHistory()));
        holder.stayDate.setText(room_history_1.getStayDate());
        holder.typeRoom.setText(room_history_1.getTypeRoomHistory());
        holder.addressHotel.setText(room_history_1.getAddressRoomHistory());
    }
}
