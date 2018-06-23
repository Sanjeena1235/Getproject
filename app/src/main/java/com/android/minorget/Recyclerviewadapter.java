package com.android.minorget;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.minorget.model.Model;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by user on 6/23/2018.
 */

public class Recyclerviewadapter  extends RecyclerView.Adapter<Recyclerviewadapter.ViewHolder>  {

    Context context;
    List<Model> models;

    public Recyclerviewadapter(Context context, List<Model> models) {
        this.context = context;//this. method is used to clear the variable between which takes the data and send the data having the same variable name;
        this.models = models;
    }

    @Override
    public Recyclerviewadapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {//this method is used in order to display the layout and it  generally display the xml layout;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view,parent,false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Recyclerviewadapter.ViewHolder holder, int position) {//the main task of this method is to take the respective position data and display
        final Model model=models.get(position);
        holder.textemail.setText(model.getEmail());
        holder.textaddress.setText(model.getAddress());


        //loading image in imageview
       // Glide.with(context).load("http://vedisapp.berlin-webdesign-agentur.de/Image/"+model.getImage())
              //  .placeholder(R.mipmap.ic_launcher)
             //   .into(holder.image);


    }
    @Override
    public int getItemCount() {

        return models.size();


    }

    class ViewHolder extends RecyclerView.ViewHolder{//Here recyclerview.viewholder is the parent class

        TextView textemail,textaddress;

        public ViewHolder(View itemView) {
            super(itemView);

            textemail= (TextView) itemView.findViewById(R.id.name);
            textaddress= (TextView) itemView.findViewById(R.id.item_dec);

        }
    }


}
