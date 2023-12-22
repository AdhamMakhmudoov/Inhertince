package com.company;

public class Lor extends Doctor{

    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void getInfoLor(){
        System.out.println("Info"+'\n'+"Name = "+getName()+'\n'+
                "Surname = "+getSurname()+'\n'+
                "Age = "+getAge()+'\n'+
                "Job = "+getJob());
    }
}
