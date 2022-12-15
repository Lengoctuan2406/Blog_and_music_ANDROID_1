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
import com.example.bookinghotel.database.room_history;

import java.util.List;

public class AdapterSearching extends RecyclerView.Adapter<AdapterSearching.ListSearch> {

    private List<room_history> searchModel;

    public AdapterSearching(List<room_history> searchModel) {
        this.searchModel = searchModel;
    }

    @Override
    public int getItemCount() {
        if(searchModel != null) {
            return searchModel.size();
        }
        return 0;
    }

    public class ListSearch extends RecyclerView.ViewHolder {
        private ImageView _143;
        private TextView _145, _146, _147, _148;
        private CardView adapterLayout_list_resultHotel;

        public ListSearch(@NonNull View itemView) {
            super(itemView);
            _143 = itemView.findViewById(R.id._143);
            _146 = itemView.findViewById(R.id._146);
            _145 = itemView.findViewById(R.id._145);
            _147 = itemView.findViewById(R.id._147);
            _148 = itemView.findViewById(R.id._148);
            adapterLayout_list_resultHotel = itemView.findViewById(R.id.adapterLayout_list_resultHotel);
        }
    }
    
    @NonNull
    @Override
    public AdapterSearching.ListSearch onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_result_search_hotel, parent, false);
        return new AdapterSearching.ListSearch(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterSearching.ListSearch holder, int position) {
        final room_history room_history_1 = searchModel.get(position);
        if (room_history_1 == null) {
            return;
        }
        holder._143.setImageResource(room_history_1.getImgRoomHistory());
        holder._146.setText(room_history_1.getNameHotelHistory());
        holder._145.setText(String.valueOf(room_history_1.getPriceRoomHistory()));
        holder._148.setText(room_history_1.getStayDate());
        holder._147.setText(room_history_1.getTypeRoomHistory());
        holder.adapterLayout_list_resultHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), DetailRoom.class);
                v.getContext().startActivity(i);
            }
        });
    }
}
