package es.uah.cc.service;

import es.uah.cc.domain.DataPressure;
import es.uah.cc.domain.DataTemperature;
import es.uah.cc.domain.Status;
import es.uah.cc.domain.Users;
import es.uah.cc.repository.ChairRepository;
import org.springframework.beans.factory.annotation.Autowired;;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ChairService {
    private ChairRepository chairRepository;
    private final Users userdefault  = new Users(-1, "", "","", "", 0, false, "");

    @Autowired
    public ChairService(ChairRepository chairRepository){
        this.chairRepository=chairRepository;
    }

    public List<Users> getUsers(){
        return  chairRepository.getUsers();
    }

    public List<DataPressure> getPressure(int id){
        return chairRepository.getPressure(id);
    }

    public List<DataTemperature> getTemperature(int id){
        return chairRepository.getTemperature(id);
    }

    public Users getAccess(Users user){
        Users userAux = chairRepository.getUser(user);
        if(userAux!=null){

            return comparePassword(user,userAux);
        }
        return userdefault;
    }

    public DataTemperature getLastTemperature(int id){
        return chairRepository.getLastTemperature(id);
    }

    public DataPressure getLastPressure(int id){
        return chairRepository.getLastPressure(id);
    }

    public Users getUser(Users user){
        return chairRepository.getUser(user);
    }


    public void setTemperature(DataTemperature dataTemperature){
        chairRepository.setTemperature(dataTemperature);
    }

    public void setPressure(DataPressure dataPressure){
        chairRepository.setPressure(dataPressure);
    }



    public Status getStatus(int id){
        return chairRepository.getStatus(id);
    }

    public void setStatus(Status status){
        chairRepository.setStatus(status);
    }

    private Users comparePassword(Users usercheck, Users usercorrect){
        if(usercheck.getPassword().equals(usercorrect.getPassword())){
            return usercorrect;
        }

        return userdefault;
    }

    private DataPressure changedatePressure(DataPressure dataPressure){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/ddTHH:mm:ss");
        Date date = new Date();
        System.out.println(date);
        //return dataPressure.setDate(date);
        return  dataPressure;
    }
}

