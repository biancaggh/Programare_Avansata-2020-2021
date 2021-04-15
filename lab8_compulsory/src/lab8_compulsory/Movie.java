package lab8_compulsory;

public class Movie {
    private int id;
    private String title;
    private String release_date;
    private double score;

    public int getId(){return this.id;}
    public String getTitle() {return this.title;}
    public String getRelease_date() { return this.release_date;}
    public double getScore() {return this.score;}

    public Movie(int id, String title, String release_date, double score){
        this.id=id;
        this.title=title;
        this.release_date=release_date;
        this.score=score;
    }
}
