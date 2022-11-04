package com.aniketjain.patternprogramsinjava;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SelectionAdapter extends RecyclerView.Adapter<SelectionAdapter.SelectionViewHolder> {

    Context context;
    ArrayList<SelectionModel> arrayList;

    public SelectionAdapter(Context c, ArrayList<SelectionModel> modelArrayList) {
        this.context = c;
        this.arrayList = modelArrayList;
    }

    @NonNull
    @Override
    public SelectionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SelectionViewHolder(LayoutInflater.from(context).inflate(R.layout.selection_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SelectionViewHolder holder, int position) {
        List<Integer> anotherList_01 = Arrays.asList(
                R.drawable.star_pattern_01, R.drawable.star_pattern_02,
                R.drawable.star_pattern_03, R.drawable.star_pattern_04,
                R.drawable.star_pattern_05, R.drawable.star_pattern_06,
                R.drawable.star_pattern_07, R.drawable.star_pattern_08,
                R.drawable.star_pattern_09, R.drawable.star_pattern_10,
                R.drawable.star_pattern_11, R.drawable.star_pattern_12,
                R.drawable.star_pattern_13, R.drawable.star_pattern_14,
                R.drawable.star_pattern_15, R.drawable.star_pattern_16,
                R.drawable.star_pattern_17, R.drawable.star_pattern_18,
                R.drawable.star_pattern_19, R.drawable.star_pattern_20,
                R.drawable.star_pattern_21, R.drawable.star_pattern_22);
        List<Integer> anotherList_02 = Arrays.asList(
                R.drawable.number_pattern_01, R.drawable.number_pattern_02,
                R.drawable.number_pattern_03, R.drawable.number_pattern_04,
                R.drawable.number_pattern_05, R.drawable.number_pattern_06,
                R.drawable.number_pattern_07, R.drawable.number_pattern_08,
                R.drawable.number_pattern_09, R.drawable.number_pattern_10,
                R.drawable.number_pattern_11, R.drawable.number_pattern_12,
                R.drawable.number_pattern_13, R.drawable.number_pattern_14,
                R.drawable.number_pattern_15, R.drawable.number_pattern_16,
                R.drawable.number_pattern_17, R.drawable.number_pattern_18,
                R.drawable.number_pattern_19, R.drawable.number_pattern_20,
                R.drawable.number_pattern_21, R.drawable.number_pattern_22,
                R.drawable.number_pattern_23, R.drawable.number_pattern_24,
                R.drawable.number_pattern_25);
        List<Integer> anotherList_03 = Arrays.asList(
                R.drawable.alphabet_pattern_01, R.drawable.alphabet_pattern_02,
                R.drawable.alphabet_pattern_03, R.drawable.alphabet_pattern_04,
                R.drawable.alphabet_pattern_05, R.drawable.alphabet_pattern_06,
                R.drawable.alphabet_pattern_07, R.drawable.alphabet_pattern_08,
                R.drawable.alphabet_pattern_09, R.drawable.alphabet_pattern_10,
                R.drawable.alphabet_pattern_11, R.drawable.alphabet_pattern_12,
                R.drawable.alphabet_pattern_13, R.drawable.alphabet_pattern_14,
                R.drawable.alphabet_pattern_15, R.drawable.alphabet_pattern_16,
                R.drawable.alphabet_pattern_17, R.drawable.alphabet_pattern_18,
                R.drawable.alphabet_pattern_19, R.drawable.alphabet_pattern_20);
        Collections.shuffle(anotherList_01);
        Collections.shuffle(anotherList_02);
        Collections.shuffle(anotherList_03);
        ArrayList<Integer> list_01 = new ArrayList<>(anotherList_01);
        ArrayList<Integer> list_02 = new ArrayList<>(anotherList_02);
        ArrayList<Integer> list_03 = new ArrayList<>(anotherList_03);

        holder.cardView_selection_btn.setOnClickListener(v -> {
            Intent intent = new Intent(context, QuestionsActivity.class);
            intent.putExtra("heading", arrayList.get(position).getHeading());
            intent.putExtra("value", arrayList.get(position).getValue());
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation((Activity) context, holder.heading_textView, "heading_transition");
            context.startActivity(intent, options.toBundle());
        });
        switch (position) {
            case 0:
                holder.selection_imageView.setImageResource(list_01.get(position));
                break;
            case 1:
                holder.selection_imageView.setImageResource(list_02.get(position));
                break;
            case 2:
                holder.selection_imageView.setImageResource(list_03.get(position));
                break;
        }
        holder.heading_textView.setText(arrayList.get(position).getHeading());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    static class SelectionViewHolder extends RecyclerView.ViewHolder {
        CardView cardView_selection_btn;
        ImageView selection_imageView;
        TextView heading_textView;

        public SelectionViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView_selection_btn = itemView.findViewById(R.id.selection_cardView_btn);
            selection_imageView = itemView.findViewById(R.id.selection_imageView);
            heading_textView = itemView.findViewById(R.id.selection_heading_textView);
        }
    }
}