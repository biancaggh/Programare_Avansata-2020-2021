package lab8_optional;

import oracle.sql.DATE;

import java.sql.Date;

public class Movie {
    private int id;
    private String title;
    private Date release_date;
    private String duration;
    private double score;

    public int getId(){return this.id;}
    public String getTitle() {return this.title;}
    public Date getRelease_date() { return this.release_date;}
    public String getDuration(){ return this.duration;}
    public double getScore() {return this.score;}

    public Movie(int id, String title, Date release_date, String duration, double score){
        this.id=id;
        this.title=title;
        this.release_date=release_date;
        this.duration=duration;
        this.score=score;
    }
}
