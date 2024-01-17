public class Compare_String{
    public static void main(String[] args) {
        String s1 = "PwSkill";
        String s2 = new String("PwSkill");
        String s3 = "PWSkill";
        System.out.println(s1==s2); // False == Operator compare reference
        System.out.println(s1.equals(s2)); // True equals() compare values
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s2));

    }
}