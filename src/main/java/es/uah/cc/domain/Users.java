package es.uah.cc.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Users {
    private final String name;
    private final String password;
    private final int id;
    private final String surname;
    private final String job;
    private final int age;
    private final boolean admin;
    private final String username;

    public Users(int id, String surname, String job, String password, String name, int age, boolean admin, String username){
        this.id=id;
        this.job=job;
        this.surname=surname;
        this.password=password;
        this.name=name;
        this.age=age;
        this.admin=admin;
        this.username=username;
    }


}
