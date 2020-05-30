package com.example.apmov;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<String> data;
    private Context context;

    ArrayList<String> fa1 = new ArrayList<>();
    ArrayList<String> fa2 = new ArrayList<>();
    ArrayList<String> fa3 = new ArrayList<>();
    ArrayList<String> fa4 = new ArrayList<>();
    ArrayList<Integer> images;

    Adapter(Context ct, ArrayList<String> s1,ArrayList<String> s2,ArrayList<String> s3,ArrayList<String> s4, ArrayList<Integer> img){
        this.fa1 = s1;
        this.fa2 = s2;
        this.fa3 = s3;
        this.fa4 = s4;
        this.images = img;
        this.context = ct;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.custom_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.textTitle.setText(fa1.get(position));
        holder.textDescription.setText(fa2.get(position));
        holder.myImage.setImageResource(images.get(position));


        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SecondActivity.class);
                intent.putExtra("data1", fa1.get(position));
                intent.putExtra("data2",fa2.get(position));
                intent.putExtra("data3",fa3.get(position));
                intent.putExtra("data4",fa4.get(position));
                intent.putExtra("myImage",images.get(position));

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return fa1.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textTitle, textDescription;
        ConstraintLayout mainLayout;
        ImageView myImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.textView);
            textDescription = itemView.findViewById(R.id.textView2);
            myImage = itemView.findViewById(R.id.imageView3);

            mainLayout = itemView.findViewById(R.id.mainLayout);

        }
    }

}
