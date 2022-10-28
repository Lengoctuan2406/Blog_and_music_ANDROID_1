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

public class AdapterRoomHistoryDone extends RecyclerView.Adapter<AdapterRoomHistoryDone.ListRoomHistory>{

    private List<room_history> roomHistoryModel;

    public AdapterRoomHistoryDone(List<room_history> roomHistoryModel) {
        this.roomHistoryModel = roomHistoryModel;
    }

    @NonNull
    @Override
    public ListRoomHistory onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_room_history_done, parent, false);
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

            img_roomHistory = itemView.findViewById(R.id.img_roomHistory_done);
            nameHotel = itemView.findViewById(R.id.NameroomHistory_done);
            priceRoom = itemView.findViewById(R.id.txt_PiceroomHistory_done);
            typeRoom = itemView.findViewById(R.id.txt_TyperoomHistory_done);
            addressHotel = itemView.findViewById(R.id.txt_AddressroomHistory_done);
            stayDate = itemView.findViewById(R.id.txt_StayRoomHistory_done);
//            btncancelRoom = itemView.findViewById(R.id.btn_cancel_roomHistory);


        }
    }
}
