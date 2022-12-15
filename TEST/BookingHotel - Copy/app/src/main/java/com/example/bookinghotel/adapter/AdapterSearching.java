package com.example.bookinghotel.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookinghotel.BlogDetail;
import com.example.bookinghotel.DetailRoom;
import com.example.bookinghotel.R;

import java.util.List;

public class AdapterSearching extends RecyclerView.Adapter<AdapterSearching.ListSearch> {

    private List<room_history> searchModel;

    public AdapterSearching(List<room_history> searchModel) {
        this.searchModel = searchModel;
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
        holder.img_roomSaved.setImageResource(room_history_1.getImgRoomHistory());
        holder.nameHotel.setText(room_history_1.getNameHotelHistory());
//        holder.priceRoom.setText(room_history_1.getPriceRoomHistory());
        holder.priceRoom.setText(String.valueOf(room_history_1.getPriceRoomHistory()));
        holder.stayDate.setText(room_history_1.getStayDate());
        holder.typeRoom.setText(room_history_1.getTypeRoomHistory());
        holder.adapterLayout_list_resultHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), DetailRoom.class);
                v.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        if(searchModel != null) {
            return searchModel.size();
        }
        return 0;
    }

    public class ListSearch extends RecyclerView.ViewHolder {
        private ImageView img_roomSaved;
        private TextView priceRoom, nameHotel, typeRoom, stayDate;
        private CardView adapterLayout_list_resultHotel;

        public ListSearch(@NonNull View itemView) {
            super(itemView);

            img_roomSaved = itemView.findViewById(R.id.img_list_resultHotel);
            nameHotel = itemView.findViewById(R.id.name_list_resultHotel);
            priceRoom = itemView.findViewById(R.id.price_list_resultHotel);
            typeRoom = itemView.findViewById(R.id.typeRoom_list_resultHotel);
            stayDate = itemView.findViewById(R.id.stay_list_resultHotel);
            adapterLayout_list_resultHotel = itemView.findViewById(R.id.adapterLayout_list_resultHotel);
        }
    }
}
