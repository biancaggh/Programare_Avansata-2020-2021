package tvseries;

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

import movies.MoviesAction;
import movies.MoviesAnimated;
import movies.MoviesBio;
import movies.MoviesComedy;
import movies.MoviesDoc;
import movies.MoviesDrama;
import movies.MoviesFan;
import movies.MoviesHorror;
import movies.MoviesRomance;

public class SeriesAnimated extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series_animated);
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
            Intent intent = new Intent(SeriesAnimated.this, MoviesAction.class);
            startActivity(intent);
            return true;
        }else
        if (id == R.id.item12) {
            Intent intent = new Intent(SeriesAnimated.this, MoviesAnimated.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.item13) {
            Intent intent = new Intent(SeriesAnimated.this, MoviesBio.class);
            startActivity(intent);
            return true;
        }else
        if (id == R.id.item14) {
            Intent intent = new Intent(SeriesAnimated.this, MoviesComedy.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.item15) {
            Intent intent = new Intent(SeriesAnimated.this, MoviesDoc.class);
            startActivity(intent);
            return true;
        }else
        if (id == R.id.item16) {
            Intent intent = new Intent(SeriesAnimated.this, MoviesDrama.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.item17) {
            Intent intent = new Intent(SeriesAnimated.this, MoviesFan.class);
            startActivity(intent);
            return true;
        }else
        if (id == R.id.item18) {
            Intent intent = new Intent(SeriesAnimated.this, MoviesHorror.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.item19) {
            Intent intent = new Intent(SeriesAnimated.this, MoviesRomance.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.item21) {
            Intent intent = new Intent(SeriesAnimated.this, SeriesAction.class);
            startActivity(intent);
            return true;
        }else
        if (id == R.id.item22) {
            Intent intent = new Intent(SeriesAnimated.this, SeriesAnimated.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.item23) {
            Intent intent = new Intent(SeriesAnimated.this, SeriesBio.class);
            startActivity(intent);
            return true;
        }else
        if (id == R.id.item24) {
            Intent intent = new Intent(SeriesAnimated.this, SeriesComedy.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.item25) {
            Intent intent = new Intent(SeriesAnimated.this, SeriesDoc.class);
            startActivity(intent);
            return true;
        }else
        if (id == R.id.item26) {
            Intent intent = new Intent(SeriesAnimated.this, SeriesDrama.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.item27) {
            Intent intent = new Intent(SeriesAnimated.this, SeriesFan.class);
            startActivity(intent);
            return true;
        }else
        if (id == R.id.item28) {
            Intent intent = new Intent(SeriesAnimated.this, SeriesHorror.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.item29) {
            Intent intent = new Intent(SeriesAnimated.this, SeriesRomance.class);
            startActivity(intent);
            return true;
        }
        else if(id == R.id.item3){
            Intent intent = new Intent (SeriesAnimated.this, Actors.class);
            startActivity(intent);
            return true;
        }
         else if(id == R.id.item4){
            Intent intent = new Intent (SeriesAnimated.this, Directors.class);
            startActivity(intent);
            return true;
        }
         else if(id == R.id.item5){
            Intent intent = new Intent (SeriesAnimated.this, Profile.class);
            startActivity(intent);
            return true;
        }
        else if(id == R.id.item6){
            Intent intent = new Intent (SeriesAnimated.this, MainPage.class);
            startActivity(intent);
            return true;
        }
        else if(id == R.id.item7){
            Intent intent = new Intent (SeriesAnimated.this, LoginPage.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}