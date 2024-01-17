public class Immutable_String{
    public static void main(String[] args) {
        String s1 = "PwSkill";
        String s2 = "PwSkill";
        System.out.println(s1==s2); // True becoz same references and duplicate not allow.
        String s3 = new String("PwSkill");
        String s4 = new String("PwSkill");
        System.out.println(s3==s4); // False becoz different references and duplicate allow.
        String s = new String();
        System.out.println(s);
    }
}