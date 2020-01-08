package es.uah.cc.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class DataPressure {
    private final int id_user;
    private final int pressure1;
    private final int pressure2;
    private final int pressure3;
    private final int pressure4;
    private Date date;


    public DataPressure(int id_user, int pressure1,int pressure2,int pressure3,int pressure4, Date date){
        this.date=date;
        this.id_user =id_user;
        this.pressure1=pressure1;
        this.pressure2=pressure2;
        this.pressure3=pressure3;
        this.pressure4=pressure4;
    }
}
