package com.example.siagakorona;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListRumahSakitAdapter extends RecyclerView.Adapter<ListRumahSakitAdapter.ListViewHolder> {
    private ArrayList<RumahSakit>listRumahSakit;

    public ListRumahSakitAdapter(ArrayList<RumahSakit> list) {
        this.listRumahSakit = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_rs, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final RumahSakit rumahSakit = listRumahSakit.get(position);
        Glide.with(holder.itemView.getContext())
                .load(rumahSakit.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(rumahSakit.getName());
        holder.tvDetail.setText(rumahSakit.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailRumahSakit.class);
                intent.putExtra("name", rumahSakit.getName());
                intent.putExtra("detail", rumahSakit.getDetail());
                intent.putExtra("photo", rumahSakit.getPhoto());

                intent.putExtra("position", position);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listRumahSakit.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.civ_rs);
            tvName = itemView.findViewById(R.id.tv_rs_name);
            tvDetail = itemView.findViewById(R.id.tv_rs_detail);
        }
    }

}
