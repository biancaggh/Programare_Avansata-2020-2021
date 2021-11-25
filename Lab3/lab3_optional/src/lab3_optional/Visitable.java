package lab3_optional;
import java.time.Duration;
import java.time.LocalTime;

public interface Visitable {

    default LocalTime getOraDesc() {
        return LocalTime.of(9,30);
    }

    default LocalTime getOraInch() {
        return LocalTime.of(20,00);
    }

    static Duration getVisitingDuration(LocalTime oraDesc, LocalTime oraInch){
        Duration duration= Duration.between( oraDesc, oraInch);
        return duration;
    }


}