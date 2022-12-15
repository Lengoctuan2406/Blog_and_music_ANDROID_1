package com.example.bookinghotel.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookinghotel.R;

import java.util.List;

public class AdapterRoomHistoryDoing extends RecyclerView.Adapter<AdapterRoomHistoryDoing.ListRoomHistory>{

    private List<room_history> roomHistoryModel;

    public AdapterRoomHistoryDoing(List<room_history> roomHistoryModel) {
        this.roomHistoryModel = roomHistoryModel;
    }

    @NonNull
    @Override
    public ListRoomHistory onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_room_history_doing, parent, false);
        return new ListRoomHistory(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListRoomHistory holder, int position) {

        final room_history room_history_1 = roomHistoryModel.get(position);
        if (room_history_1 == null) {
            return;
        }
        holder.img_roomHistory.setImageResource(room_history_1.getImgRoomHistory());
        holder.nameHotel.setText(room_history_1.getNameHotelHistory());
//        holder.priceRoom.setText(room_history_1.getPriceRoomHistory());
        holder.priceRoom.setText(String.valueOf(room_history_1.getPriceRoomHistory()));
        holder.stayDate.setText(room_history_1.getStayDate());
        holder.typeRoom.setText(room_history_1.getTypeRoomHistory());
        holder.addressHotel.setText(room_history_1.getAddressRoomHistory());
    }

    @Override
    public int getItemCount() {
        if(roomHistoryModel != null) {
            return roomHistoryModel.size();
        }
        return 0;
    }

    public class ListRoomHistory extends RecyclerView.ViewHolder{

        private ImageView img_roomHistory;
        private TextView nameHotel, priceRoom, typeRoom, stayDate, addressHotel;
//        private Button btncancelRoom;

        public ListRoomHistory(@NonNull View itemView) {
            super(itemView);

            img_roomHistory = itemView.findViewById(R.id.img_roomHistory);
            nameHotel = itemView.findViewById(R.id.NameroomHistory);
            priceRoom = itemView.findViewById(R.id.txt_PiceroomHistory);
            typeRoom = itemView.findViewById(R.id.txt_TyperoomHistory);
            addressHotel = itemView.findViewById(R.id.txt_AddressroomHistory);
            stayDate = itemView.findViewById(R.id.txt_StayRoomHistory);
//            btncancelRoom = itemView.findViewById(R.id.btn_cancel_roomHistory);
        }
    }
}
