class Student{
    private int age;
    private String name;
    private String add;

    public void setAge(int age){
        if(age>0 && age<=100){
            this.age=age;
        }
        else{
            System.out.println("Please Enter Valid Age");

        }
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAdd(String add){
        this.add = add;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getAdd(){
        return add;
    }

    public void show(){
        System.out.println("Name - " + name + "\n" + "Age - " + age + "\n" + "Address - " + add); 
    }
}

public class Setters_Getters{
    public static void main(String[] args) {
        Student std = new Student();
        std.setName("Bharat Kumar");
        std.setAge(201);
        std.setAdd("83, Krishna Home, Sudwas");
        std.getName();
        std.getAge();
        std.getAdd();
        std.show();
    }
}