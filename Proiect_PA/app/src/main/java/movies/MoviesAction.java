package movies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.filmtastic.Actors;
import com.example.filmtastic.Directors;
import com.example.filmtastic.LoginPage;
import com.example.filmtastic.MainPage;
import com.example.filmtastic.Profile;
import com.example.filmtastic.R;
import tvseries.SeriesAction;
import tvseries.SeriesAnimated;
import tvseries.SeriesBio;
import tvseries.SeriesComedy;
import tvseries.SeriesDoc;
import tvseries.SeriesDrama;
import tvseries.SeriesFan;
import tvseries.SeriesHorror;
import tvseries.SeriesRomance;

public class MoviesAction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_action);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.item11) {
            Intent intent = new Intent(MoviesAction.this, MoviesAction.class);
            startActivity(intent);
            return true;
        }else
        if (id == R.id.item12) {
            Intent intent = new Intent(MoviesAction.this, MoviesAnimated.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.item13) {
            Intent intent = new Intent(MoviesAction.this, MoviesBio.class);
            startActivity(intent);
            return true;
        }else
        if (id == R.id.item14) {
            Intent intent = new Intent(MoviesAction.this, MoviesComedy.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.item15) {
            Intent intent = new Intent(MoviesAction.this, MoviesDoc.class);
            startActivity(intent);
            return true;
        }else
        if (id == R.id.item16) {
            Intent intent = new Intent(MoviesAction.this, MoviesDrama.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.item17) {
            Intent intent = new Intent(MoviesAction.this, MoviesFan.class);
            startActivity(intent);
            return true;
        }else
        if (id == R.id.item18) {
            Intent intent = new Intent(MoviesAction.this, MoviesHorror.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.item19) {
            Intent intent = new Intent(MoviesAction.this, MoviesRomance.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.item21) {
            Intent intent = new Intent(MoviesAction.this, SeriesAction.class);
            startActivity(intent);
            return true;
        }else
        if (id == R.id.item22) {
            Intent intent = new Intent(MoviesAction.this, SeriesAnimated.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.item23) {
            Intent intent = new Intent(MoviesAction.this, SeriesBio.class);
            startActivity(intent);
            return true;
        }else
        if (id == R.id.item24) {
            Intent intent = new Intent(MoviesAction.this, SeriesComedy.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.item25) {
            Intent intent = new Intent(MoviesAction.this, SeriesDoc.class);
            startActivity(intent);
            return true;
        }else
        if (id == R.id.item26) {
            Intent intent = new Intent(MoviesAction.this, SeriesDrama.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.item27) {
            Intent intent = new Intent(MoviesAction.this, SeriesFan.class);
            startActivity(intent);
            return true;
        }else
        if (id == R.id.item28) {
            Intent intent = new Intent(MoviesAction.this, SeriesHorror.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.item29) {
            Intent intent = new Intent(MoviesAction.this, SeriesRomance.class);
            startActivity(intent);
            return true;
        }
        else if(id == R.id.item3){
            Intent intent = new Intent (MoviesAction.this, Actors.class);
            startActivity(intent);
            return true;
        }
         else if(id == R.id.item4){
            Intent intent = new Intent (MoviesAction.this, Directors.class);
            startActivity(intent);
            return true;
        }
         else if(id == R.id.item5){
            Intent intent = new Intent (MoviesAction.this, Profile.class);
            startActivity(intent);
            return true;
        }
        else if(id == R.id.item6){
            Intent intent = new Intent (MoviesAction.this, MainPage.class);
            startActivity(intent);
            return true;
        }
        else if(id == R.id.item7){
            Intent intent = new Intent (MoviesAction.this, LoginPage.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}