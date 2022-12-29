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

public class AdapterRoomHistoryCancel extends RecyclerView.Adapter<AdapterRoomHistoryCancel.ListRoomHistory> {

    private List<_2_table> roomhistoryList;

    public AdapterRoomHistoryCancel(List<_2_table> roomhistoryList) {
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
        final _2_table room_history_1 = roomhistoryList.get(position);
        if (room_history_1 == null) {
            return;
        }
        holder.img_roomHistory.setImageResource(room_history_1.picture_hotel);
        holder.nameHotel.setText(room_history_1.name_hotel);
        holder.priceRoom.setText(String.valueOf(room_history_1.price_hotel_detail));
        holder.stayDate.setText(room_history_1.number_of_day_other);
        holder.typeRoom.setText(room_history_1.number_of_room_hotel_detail);
        holder.addressHotel.setText(room_history_1.address_hotel);
    }
}
