package com.example.tutorfinder.adapter;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tutorfinder.R;
import com.example.tutorfinder.models.Carousel;

import java.util.List;

public class CarouselAdapter extends RecyclerView.Adapter<CarouselAdapter.CarouselViewHolder> {
    List<Carousel> carousels;

    public CarouselAdapter(List<Carousel> carousels) {
        this.carousels = carousels;
    }

    @NonNull
    @Override
    public CarouselViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.row_carousel,parent,false);
        return new CarouselViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarouselViewHolder holder, int position) {
        holder.bindItem(carousels.get(position));
    }

    @Override
    public int getItemCount() {
        return carousels.size();
    }

    public static class CarouselViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        public CarouselViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
        }

        public void bindItem(Carousel carousel){
            imageView.setImageDrawable(carousel.getImage());
        }
    }
}
