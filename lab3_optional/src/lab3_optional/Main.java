package lab3_optional;
import lab3_optional.Church;
import lab3_optional.Hotel;
import lab3_optional.Museum;
import lab3_optional.Restaurant;

import javax.xml.stream.Location;
import java.time.LocalTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public class Main {
    public static void main(String[] args){
        City c=new City();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Hotel v1= new Hotel();
        v1.setName("Continental");
        v1.setClasificare("3 stele");
        v1.setLocation(Collections.singletonList("Piata Unirii"));
        System.out.println(v1);

        Museum v2= new Museum();
        v2.setName("Muzeul de arta");
        v2.setOraDesc(LocalTime.of(13,00));
        v2.setOraInch(LocalTime.of(20,00));
        v2.setPretIntrare(10.00);
        v2.setLocation(Collections.singletonList("Palatul de Cultura"));
        System.out.println(v2);

        Museum v3=new Museum();
        v3.setName("Muzeul de Istorie Naturala");
        v3.setOraDesc(LocalTime.of(10,00));
        v3.setOraInch(LocalTime.of(18,30));
        v3.setPretIntrare(15.00);
        v3.setLocation(Collections.singletonList("Piata Unirii"));
        System.out.println(v3);

        Church v4=new Church();
        v4.setName("Biserica Sfantul Spiridon");
        v4.setOraDesc(LocalTime.of(07,30));
        v4.setOraInch(LocalTime.of(13,00));
        v4.setLocation(Collections.singletonList("Tudor Vladimirescu"));
        System.out.println(v4);

        Church v5= new Church();
        v5.setName("Biserica Sfintii Trei Ierarhi");
        v5.setOraDesc(LocalTime.of(07,00));
        v5.setOraInch(LocalTime.of(12,45));
        v5.setLocation(Collections.singletonList("Piata Unirii"));
        System.out.println(v5);

        Restaurant v6=new Restaurant();
        v6.setName("Panoramic");
        v6.setClasificare("4 stele");
        v6.setOraDesc(LocalTime.of(12,00));
        v6.setOraInch(LocalTime.of(23,00));
        v6.setLocation(Collections.singletonList("Piata Unirii"));
        System.out.println(v6);

        System.out.println("");
        map.put("v1->v2",10);
        map.put("v1->v3",50);
        map.put("v2<->v3",20);
        map.put("v2->v4",20);
        map.put("v2->v5",10);
        map.put("v3->v4",20);
        map.put("v4<->v5",30);
        map.put("v4->v6",10);
        map.put("v5->v6",20);
        System.out.println(map);

        c.getLocation(v1.location);
        c.getLocation(v2.location);
        c.getLocation(v3.location);
        c.getLocation(v4.location);
        c.getLocation(v5.location);
        c.getLocation(v6.location);
        System.out.println(c.Instanceofs());
        System.out.println("");
        System.out.println("Durata:"+Visitable.getVisitingDuration(v2.getOraDesc(),v2.getOraInch()));
        System.out.println("Durata:"+Visitable.getVisitingDuration(v3.getOraDesc(),v3.getOraInch()));
        System.out.println("Durata:"+Visitable.getVisitingDuration(v4.getOraDesc(),v4.getOraInch()));
        System.out.println("Durata:"+Visitable.getVisitingDuration(v5.getOraDesc(),v5.getOraInch()));
        System.out.println("Durata:"+Visitable.getVisitingDuration(v6.getOraDesc(),v6.getOraInch()));

        System.out.println("");
        TravelPlan t1=new TravelPlan();
        t1.setCity("Iasi");
        System.out.println("Lista de monumente de vizitat in "+t1.getCity());
        TravelPlan.pref(v4.getName(),1);
        TravelPlan.pref(v2.getName(),2);
        TravelPlan.pref(v6.getName(),3);
        TravelPlan.pref(v3.getName(),4);
        TravelPlan.pref(v5.getName(),5);
        TravelPlan.pref(v1.getName(),6);


        int loco[][]=new int[][]{ {0,10,50,0,0,0},
                {0,0,20,20,10,0},
                {0,0,20,0,20,0},
                {0,0,0,0,30,10},
                {0,0,0,30,0,20},
                {0,0,0,0,0,0}};
        Shortest_Path sp=new Shortest_Path();
        System.out.println("Daca plecam din prima locatie:");
        sp.alg_dijkstra(loco,0);
        System.out.println("");
        System.out.println("Daca plecam din a 2 a locatie:");
        sp.alg_dijkstra(loco,1);
        System.out.println("");
        System.out.println("Daca plecam din a 3 a locatie:");
        sp.alg_dijkstra(loco,2);
        System.out.println("");
        System.out.println("Daca plecam din a 4 a locatie:");
        sp.alg_dijkstra(loco,3);
        System.out.println("");
        System.out.println("Daca plecam din a 5 a locatie:");
        sp.alg_dijkstra(loco,4);
        System.out.println("");
        System.out.println("Daca plecam din a 6 a locatie:");
        sp.alg_dijkstra(loco,5);
        System.out.println("");

    }
}
