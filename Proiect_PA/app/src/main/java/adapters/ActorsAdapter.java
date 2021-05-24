package adapters;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.filmtastic.R;

public class ActorsAdapter extends AppCompatActivity {
    ImageView imageView;
    TextView t1, t2, t3, t4, t5, t6, t7;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actors_model);

        t1=findViewById(R.id.anameview);
        imageView=findViewById(R.id.aimg);
        t2=findViewById(R.id.afullnameview);
        t3=findViewById(R.id.adateview);
        t4=findViewById(R.id.aageview);
        t5=findViewById(R.id.anatview);
        t6=findViewById(R.id.amoviesview);
        t7=findViewById(R.id.atvsview);


    }
}
