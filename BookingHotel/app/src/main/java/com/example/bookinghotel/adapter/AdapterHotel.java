package com.example.bookinghotel.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookinghotel.R;
import com.example.bookinghotel.database._1_table;

import java.util.List;

public class AdapterHotel extends RecyclerView.Adapter<AdapterHotel.HotelViewHolder> {

    private List<_1_table> listHotel;
    private Context context;

    public AdapterHotel(List<_1_table> list) {
        this.listHotel = list;
    }

    @NonNull
    @Override
    public HotelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_home_hotel, parent, false);
        return new HotelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelViewHolder holder, int position) {
        _1_table hotel = listHotel.get(position);
        if (hotel == null) {
            return;
        }
        holder.imgHotel.setImageResource(hotel.picture_hotel);//
        holder.nameHotel.setText(hotel.name_hotel);
        holder.priceHotel.setText(String.valueOf(hotel.price_hotel_detail));
    }

    @Override
    public int getItemCount() {
        if (listHotel != null) {
            return listHotel.size();
        }
        return 0;
    }

    public class HotelViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgHotel;
        private TextView nameHotel, priceHotel;

        public HotelViewHolder(@NonNull View itemView) {
            super(itemView);

            imgHotel = itemView.findViewById(R.id.img_tophotel);
            nameHotel = itemView.findViewById(R.id.namehotel_tophotel);
            priceHotel = itemView.findViewById(R.id.pricehotel_tophotel);
        }
    }
}