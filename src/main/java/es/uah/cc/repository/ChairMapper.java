package es.uah.cc.repository;

import es.uah.cc.domain.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ChairMapper {

    @Select("select id, name,password, job,surname,age ,admin, username from user")
    List<Users> getUsers();

    @Select("select id, name,password, job,surname,age ,admin, username from user where id=#{id}")
    Users getUser(Users user);

    @Insert("INSERT INTO datatemperature(id_user, temperature, date) VALUES (#{id_user},#{temperature},NOW())")
    void setTemperature(DataTemperature dataTemperature);

    @Insert("INSERT INTO datapressure(id_user, pressure1, pressure2, pressure3, pressure4, date) VALUES (#{id_user},#{pressure1},#{pressure2},#{pressure3},#{pressure4},now())")
    void setPressure(DataPressure dataPressure);

    @Select("SELECT id_user, temperature, date from datatemperature where id_user=#{id} ORDER BY date DESC")
    List<DataTemperature> getTemperature(int id);

    @Select("SELECT id_user, temperature, date from datatemperature where id_user=#{id} ORDER BY date DESC LIMIT 1")
    DataTemperature getLastTemperature(int id);

    @Select("SELECT id_user, pressure1, pressure2, pressure3, pressure4, date from datapressure where id_user=#{id} ORDER BY date DESC")
    List<DataPressure> getPressure(int id);

    @Select("SELECT id_user, pressure1, pressure2, pressure3, pressure4, date from datapressure where id_user=#{id} ORDER BY date DESC LIMIT 1")
    DataPressure getLastPressure(int id);

    @Select("SELECT id_user, manual, temperature, active from status where id_user=#{id}")
    Status getStatus(int id);

    @Update("update status set manual=#{manual}, temperature=#{temperature}, active=#{activeManual} where id_user=#{id_user}")
    void setStatus(Status status);
}
