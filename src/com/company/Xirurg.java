package com.company;

public class Xirurg extends Doctor{

    private String job;

    private int salary;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void getInfoXirurg(){
        System.out.println("Info"+'\n'+"Name = "+getName()+'\n'+
                            "Surname = "+getSurname()+'\n'+
                            "Age = "+getAge()+'\n'+
                            "Job = "+getJob()+'\n'+
                            "Salary = "+getSalary());
    }
}
