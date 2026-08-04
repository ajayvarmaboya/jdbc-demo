package com.ajay;

public class Student {
    private int courseId;
    private String name;
    private boolean fee;
    private String course;
    private String courseName;

    public Student(){

    }
    public Student(int courseId, String name, boolean fee, String course, String courseName) {
        this.courseId = courseId;
        this.name = name;
        this.fee = fee;
        this.course = course;
        this.courseName = courseName;
    }

    public int getCourseId(){
        return courseId;
    }

    public void setCourseId(int courseId){
        this.courseId=courseId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public boolean isFee(){
        return fee;
    }

    public void setFee(Boolean fee){
        this.fee=fee;
    }

    public String getCourse(){
        return course;
    }

    public void setCourse(String course){
        this.course=course;
    }

    public String getCourseName(){
        return courseName;
    }

    public void setCourseName(String courseName){
        this.courseName=courseName;
    }

    public String toString(){
        return "Student{"+
                "courseId="+courseId+
                ",name='"+name+'\''+
                ",fee="+fee+
                ",course='"+course+'\''+
                ",courseName='"+courseName+'\''+
                '}';
    }

}
