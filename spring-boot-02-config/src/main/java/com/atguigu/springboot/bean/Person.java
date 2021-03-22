package com.atguigu.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
/**
* 将配置文件中配置的每一个属性的值。映射到这个组件中
 * @ConfigurationProperties 告诉springBoot将奔类中的所有属性和配置文件中相关的配置进行绑定；
 * prefix = "person" 配置文件中那个下面的所有属性进行---映射
 * 绑定文件配置处理器maven包
 * 只有这个组件是容器中的组件，才能提供的@ConfigurationProperties功能，添加注解@Component
* */
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private  String lastName;
    private  Integer age;
    private  Boolean boss;
    private Date birth;
    private Map<String,String> maps;
    private List<Object> lists;
    private  dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public com.atguigu.springboot.bean.dog getDog() {
        return dog;
    }

    public void setDog(com.atguigu.springboot.bean.dog dog) {
        this.dog = dog;
    }
}
