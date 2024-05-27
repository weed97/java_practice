package com.ex.reveiw;

public class Member {
    private int num;
    private String id;
    private int pwd;
    private String name;
    private int age;
    private char gender;

    public Member(int num, String id, int pwd, String name, int age, char gender) {
        this.num = num;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    public String getNmae() {
        return name;
    }

    public void setNmae(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getInformation() {
        return ("Member [num = " + num + ", id = " + id + ", pwd = " +
                 + pwd + ", name =" + name +", age =" + age + ", gender = ]" + gender);
    }
}

