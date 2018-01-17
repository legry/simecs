package com.example.simec3;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import static com.example.simec3.MainActivity.pusk_data;

class PusksAdapter extends RecyclerView.Adapter<PusksAdapter.MyHolder> {
    private List<Pusks> dops;

    PusksAdapter(List<Pusks> dops) {
        this.dops = dops;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.puskateli, parent, false));
    }

    @Override
    public void onBindViewHolder(final MyHolder holder, int position) {
        holder.textView.setText(dops.get(position).getTitles());
        holder.button.setOnClickListener(v -> holder.button.setSelected(!holder.button.isSelected()));
    }

    @Override
    public int getItemCount() {
        return dops.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        TextView textView;
        Button button;
        MyHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.titledop);
            button = itemView.findViewById(R.id.button);
        }
    }
}
