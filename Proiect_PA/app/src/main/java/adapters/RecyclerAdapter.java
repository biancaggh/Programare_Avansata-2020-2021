package adapters;

import android.content.Context;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.filmtastic.R;


import com.example.filmtastic.Actors;
import com.example.filmtastic.R;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import models.ActorsModel;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewH>{
    private Context mContext;
    private List<ActorsModel> mData;
    RequestOptions option;

    public RecyclerAdapter(Context mContext, List<ActorsModel> mData) {
        this.mContext = mContext;
        this.mData = mData;

        option= new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);
    }



    @NonNull
    @Override
    public ViewH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view;
       LayoutInflater inflater=LayoutInflater.from(mContext);
       view=inflater.inflate(R.layout.actors_model,parent,false);

       return new ViewH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewH holder, int position) {
        holder.name.setText(mData.get(position).getName());
        holder.fullname.setText(mData.get(position).getFullname());
        holder.date_b.setText(mData.get(position).getDate_birth());
        holder.age.setText(mData.get(position).getAge());
        holder.nat.setText(mData.get(position).getNational());
        holder.movies.setText(mData.get(position).getMovies());
        holder.tvseries.setText(mData.get(position).getTvseries());

        Glide.with(mContext).load(mData.get(position).getImageURL()).apply(option).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ViewH extends RecyclerView.ViewHolder{

        TextView name;
        TextView fullname;
        TextView date_b;
        TextView age;
        TextView nat;
        TextView movies;
        TextView tvseries;
        ImageView imageView;

        public ViewH(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.anameview);
            fullname=itemView.findViewById(R.id.afullnameview);
            date_b=itemView.findViewById(R.id.adateview);
            age=itemView.findViewById(R.id.aageview);
            nat=itemView.findViewById(R.id.anatview);
            movies=itemView.findViewById(R.id.amoviesview);
            tvseries=itemView.findViewById(R.id.atvsview);
            imageView=itemView.findViewById(R.id.aimg);


        }
    }
}
