package model;

public class Student {
    /**
     * In Student class you will find student's names, age, gender and ID NO.
     * Provide Student class with constructor method and get/set methods of all attributes.
     * Create student instances in a class outside of model, and print all the attributes of a student.
     * Once finished, please submit yout homework in your GitHub repository. Please also paste the path of the repository in the answer.
     */
    private String name = "";
    private int age;
    private String gender = "";
    private int id;
    public Student(){

    }
    public Student(String name,int age,String gender,int id){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "[name:" +name+
                ",age:" + age+
                ",gender:" + gender +
                ",id:" +id+"]";
    }
}
