package com.aniketjain.patternprogramsinjava;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.ItemViewHolder> {

    Context context;
    ArrayList<QuestionModel> arrayList;

    public QuestionAdapter(Context c, ArrayList<QuestionModel> questionModelArrayList) {
        this.context = c;
        this.arrayList = questionModelArrayList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(context).inflate(R.layout.ques_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.cardView_ques_btn.setOnClickListener(v -> {
            Intent intent = new Intent(context, FullViewActivity.class);
            intent.putExtra("ques", arrayList.get(position).getQues());
            intent.putExtra("n", arrayList.get(position).getN());
            intent.putExtra("image", arrayList.get(position).getImageView());
            intent.putExtra("image_ans", arrayList.get(position).getImageView_ans());
            intent.putExtra("code", arrayList.get(position).getCode());

            Pair<View, String> pair1 = Pair.create(holder.ques_cardView_imageView, "cardView_transition");
            Pair<View, String> pair2 = Pair.create(holder.ques_imageView, "photo_transition");
            Pair<View, String> pair3 = Pair.create(holder.ques, "ques_transition");
            Pair<View, String> pair4 = Pair.create(holder.n, "n_transition");

            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pair1, pair2, pair3, pair4);
            context.startActivity(intent, options.toBundle());
        });
        Glide.with(context).load(arrayList.get(position).getImageView()).into(holder.ques_imageView);
        //holder.ques_imageView.setImageResource(arrayList.get(position).getImageView());
        holder.ques.setText(arrayList.get(position).getQues());
        holder.n.setText(arrayList.get(position).getN());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    static class ItemViewHolder extends RecyclerView.ViewHolder {
        CardView cardView_ques_btn, ques_cardView_imageView;
        ImageView ques_imageView;
        TextView ques, n;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            cardView_ques_btn = itemView.findViewById(R.id.ques_cardView_btn);
            ques_cardView_imageView = itemView.findViewById(R.id.ques_cardView_imageView);
            ques_imageView = itemView.findViewById(R.id.ques_imageView);
            ques = itemView.findViewById(R.id.ques_no_textView);
            n = itemView.findViewById(R.id.n_textView);

        }
    }
}
