package es.uah.cc.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class DataTemperature {
    private final int id_user;
    private final int temperature;
    private final Date date;

    public DataTemperature(int id_user, int temperature, Date date){
        this.id_user =id_user;
        this.temperature=temperature;
        this.date=date;

    }
}
