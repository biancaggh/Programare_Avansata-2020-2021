package lab3_optional;

public class TravelPlan extends City{
    String getCity() {
        return city;
    }

    void setCity(String city) {
        this.city = city;
    }

    String city;
    int[] preferences;
    public static String pref(String location,int preferences){
        System.out.println(preferences+","+location);
        return location;
    }


}