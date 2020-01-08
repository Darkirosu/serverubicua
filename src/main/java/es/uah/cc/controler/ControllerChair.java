package es.uah.cc.controler;

import es.uah.cc.domain.*;
import es.uah.cc.service.ChairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin
public class ControllerChair {
    private ChairService chairService;

    @Autowired
    public ControllerChair(ChairService chairService){
        this.chairService=chairService;
    }

    @RequestMapping(value="/users", method = RequestMethod.GET)
    public List<Users> getUsers(){
        return chairService.getUsers();
    }

    @RequestMapping(value = "/temperatures", method = RequestMethod.GET)
    public List<DataTemperature> getTemperature(@RequestBody Users user){
        return chairService.getTemperature(user.getId());
    }

    @RequestMapping(value = "/pressures", method = RequestMethod.GET)
    public List<DataPressure> getPressure(@RequestBody Users user){
        return chairService.getPressure(user.getId());
    }

    @RequestMapping(value = "/pressure", method = RequestMethod.POST)
    public @ResponseBody
    void setPressure(@RequestBody DataPressure dataPressure){
        chairService.setPressure(dataPressure);
    }

    @RequestMapping(value = "/temperature", method = RequestMethod.POST)
    public @ResponseBody
    void getTemperature(@RequestBody DataTemperature dataTemperature){
        chairService.setTemperature(dataTemperature);
    }

    @RequestMapping(value = "/access", method = RequestMethod.POST)
    public @ResponseBody
    Users getAccess(@RequestBody Users user){
        return chairService.getAccess(user);
    }

    @RequestMapping(value = "/lasttemperature", method = RequestMethod.POST)
    public @ResponseBody
    DataTemperature getLastTemperature(@RequestBody Users user){
        return chairService.getLastTemperature(user.getId());
    }

    @RequestMapping(value = "/lastpressure", method = RequestMethod.POST)
    public @ResponseBody
    DataPressure getLastPressure(@RequestBody Users user){
        return chairService.getLastPressure(user.getId());
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public @ResponseBody
    Users getUser(@RequestBody Users user){
        return chairService.getUser(user);
    }



    @RequestMapping(value = "/status/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Status getStatus( @PathVariable("id") int id){
        return chairService.getStatus(id);
    }

    @RequestMapping(value = "/status", method = RequestMethod.POST)
    public @ResponseBody
    void setStatus(@RequestBody Status status){
        chairService.setStatus(status);
    }

}
