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

import java.util.List;

public class AdapterSearching extends RecyclerView.Adapter<AdapterSearching.ListSearch> {

    private List<_1_table> searchModel;

    public AdapterSearching(List<_1_table> searchModel) {
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
        private TextView _145, _146, _148;
        private CardView adapterLayout_list_resultHotel;

        public ListSearch(@NonNull View itemView) {
            super(itemView);
            _143 = itemView.findViewById(R.id._143);
            _146 = itemView.findViewById(R.id._146);
            _145 = itemView.findViewById(R.id._145);
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
        final _1_table room_history_1 = searchModel.get(position);
        if (room_history_1 == null) {
            return;
        }
        holder._143.setImageResource(room_history_1.picture_hotel);
        holder._146.setText(room_history_1.name_hotel);
        holder._145.setText(String.valueOf(room_history_1.star_hotel));
        holder._148.setText(room_history_1.number_of_day_other);
        holder.adapterLayout_list_resultHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), DetailRoom.class);
                i.putExtra("hotel_id", room_history_1.hotel_id);
                i.putExtra("number_of_day_other", room_history_1.number_of_day_other);
                v.getContext().startActivity(i);
            }
        });
    }
}
