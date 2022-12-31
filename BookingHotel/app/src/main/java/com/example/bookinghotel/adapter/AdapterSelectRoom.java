package com.example.bookinghotel.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookinghotel.DetailRoom;
import com.example.bookinghotel.R;
import com.example.bookinghotel.database._1_table;
import com.example.bookinghotel.database._6_table;

import java.util.List;

public class AdapterSelectRoom extends RecyclerView.Adapter<AdapterSelectRoom.SelectRoom>{
    private List<_6_table> Model;

    public AdapterSelectRoom(List<_6_table> Model) {
        this.Model = Model;
    }

    @Override
    public int getItemCount() {
        if(Model != null) {
            return Model.size();
        }
        return 0;
    }

    public class SelectRoom extends RecyclerView.ViewHolder {
//        private ImageView _143;
//        private TextView _145, _146, _148;
//        private CardView adapterLayout_list_resultHotel;

        private TextView number_of_room_hotel_detail, price_hotel_detail
                , size_hotel_detail, description_hotel_detail;

        public SelectRoom(@NonNull View itemView) {
            super(itemView);
            number_of_room_hotel_detail = itemView.findViewById(R.id.typeselectRoom);
            price_hotel_detail = itemView.findViewById(R.id.priceselectRoom);
            size_hotel_detail = itemView.findViewWithTag(R.id.sizeselectRoom);
            description_hotel_detail = itemView.findViewById(R.id.descriptionselectRoom);

//            _143 = itemView.findViewById(R.id._143);
//            _146 = itemView.findViewById(R.id._146);
//            _145 = itemView.findViewById(R.id._145);
//            _148 = itemView.findViewById(R.id._148);
//            adapterLayout_list_resultHotel = itemView.findViewById(R.id.adapterLayout_list_resultHotel);
        }
    }

    @NonNull
    @Override
    public AdapterSelectRoom.SelectRoom onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_select_room, parent, false);
        return new AdapterSelectRoom.SelectRoom(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterSelectRoom.SelectRoom holder, int position) {
        final _6_table room_history_1 = Model.get(position);
        if (room_history_1 == null) {
            return;
        }
        holder.number_of_room_hotel_detail.setText(room_history_1.number_of_room_hotel_detail);
        holder.price_hotel_detail.setText(String.valueOf(room_history_1.price_hotel_detail));
        holder.size_hotel_detail.setText(room_history_1.size_hotel_detail);
        holder.description_hotel_detail.setText(room_history_1.description_hotel_detail);

//        holder._143.setImageResource(room_history_1.picture_hotel);
//        holder._146.setText(room_history_1.name_hotel);
//        holder._145.setText(String.valueOf(room_history_1.star_hotel));
//        holder._148.setText(room_history_1.number_of_day_other);
//        holder.adapterLayout_list_resultHotel.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(v.getContext(), DetailRoom.class);
//                i.putExtra("hotel_id", room_history_1.hotel_id);
//                i.putExtra("number_of_day_other", room_history_1.number_of_day_other);
//                v.getContext().startActivity(i);
//            }
//        });
    }
}
