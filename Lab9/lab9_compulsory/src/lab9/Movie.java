package lab9;

import javax.persistence.*;
import java.util.Date;

@Entity
@NamedQueries({
        @NamedQuery(name = "Movie.findById", query = "select m FROM Movie m where  m.ID = :ID"),
        @NamedQuery(name = "Movie.findByTitle", query = "SELECT m FROM Movie m WHERE m.Title = :Title"),
})

@Table(name = "MOVIE")
public class Movie {

    @Override
    public String toString() {
        return "Movie{" +
                "ID=" + ID +
                ", Title='" + Title + '\'' +
                ", Release_date=" + Release_date +
                ", Duration=" + Duration +
                ", Score=" + Score +
                '}';
    }

    public Movie(int ID, String Title, Date Release_date, int Duration, int Score) {
        this.ID = ID;
        this.Title = Title;
        this.Release_date=Release_date;
        this.Duration=Duration;
        this.Score=Score;
    }

    public Movie() {

    }

    @Id
    @Column(name = "ID", unique = true)
    private int ID;

    @Column(name = "Title", nullable = false)
    private String Title;

    public int getId() {
        return ID;
    }

    public void setId(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setName(String Title) {
        this.Title = Title;
    }

    public Date getRelease_date() {
        return Release_date;
    }

    public void setRelease_date(Date release_date) {
        Release_date = release_date;
    }

    public Date Release_date;

    public int Duration;
    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }


    public int Score;

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        Score = Score;
    }


}

