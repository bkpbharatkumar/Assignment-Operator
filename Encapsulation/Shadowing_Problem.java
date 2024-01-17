class Student{
    private int age;
    private String name;

    public void setData1(int age){
        this.age = age;
    }
    public void setData2(String name){
        this.name = name;
    }

    public void show(){
        System.out.println(name + " " + age);
    }

    
}


public class Shadowing_Problem{
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student();
        std1.setData1(22);
        std2.setData1(3);
        std1.setData2("Bkp");
        std2.setData2("Rishu");
        std1.show();
        std2.show();
    }
}