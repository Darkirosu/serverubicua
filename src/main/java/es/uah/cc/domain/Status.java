package es.uah.cc.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Status {
    private final int id_user;
    private final boolean manual;
    private final int temperature;
    private final boolean activeManual;

    public Status(int id_user, boolean manual, int temperature, boolean activeManual){
        this.id_user =id_user;
        this.manual=manual;
        this.temperature =temperature;
        this.activeManual =activeManual;
    }
}