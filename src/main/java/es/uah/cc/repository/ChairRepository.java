package es.uah.cc.repository;

import es.uah.cc.domain.DataPressure;
import es.uah.cc.domain.DataTemperature;
import es.uah.cc.domain.Status;
import es.uah.cc.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ChairRepository {
     private ChairMapper chairMapper;

     @Autowired
    public ChairRepository(ChairMapper chairMapper){
         this.chairMapper=chairMapper;
     }

     public List<Users> getUsers(){
         return chairMapper.getUsers();
     }

     public List<DataPressure> getPressure(int id){
         return chairMapper.getPressure(id);
     }

     public List<DataTemperature> getTemperature(int id){
         return chairMapper.getTemperature(id);
     }

     public void setTemperature(DataTemperature dataTemperature){
         chairMapper.setTemperature(dataTemperature);
     }

     public void setPressure(DataPressure dataPressure){
         chairMapper.setPressure(dataPressure);
     }

     public Users getUser(Users user){
         return chairMapper.getUser(user);
     }

    public DataTemperature getLastTemperature(int id){
        return chairMapper.getLastTemperature(id);
    }

    public DataPressure getLastPressure(int id){
        return chairMapper.getLastPressure(id);
    }

    public Status getStatus(int id){
        return chairMapper.getStatus(id);
    }

    public void setStatus(Status status){
         chairMapper.setStatus(status);
    }

}
