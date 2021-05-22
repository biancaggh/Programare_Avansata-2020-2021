package models;

import android.content.Context;
import android.os.Bundle;
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

public class RecyclerAdapter extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView t1, t2, t3, t4, t5, t6, t7;
    View v;
    public RecyclerAdapter(@NonNull View itemView) {
        super(itemView);
        t1=itemView.findViewById(R.id.anameview);
        imageView=itemView.findViewById(R.id.aimg);
        t2=itemView.findViewById(R.id.afullnameview);
        t3=itemView.findViewById(R.id.adateview);
        t4=itemView.findViewById(R.id.aageview);
        t5=itemView.findViewById(R.id.anatview);
        t6=itemView.findViewById(R.id.amoviesview);
        t7=itemView.findViewById(R.id.atvsview);
        v=itemView;
    }
}
