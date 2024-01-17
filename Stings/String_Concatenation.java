public class String_Concatenation{
    public static void main(String[] args) {
        
        String s1 = new String("Pw ");
            s1 = s1.concat("Skill ");
        System.out.println(s1);

        System.out.println();
        
        String s2 = new String("Pw Java ");
        String s3 = s2.concat("Skill ");
        String s4 = new String("Java ");
        s4 = s4.concat("Foundation ");
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        
        System.out.println();
        
        String s5 = "Pw ";
        String s6 = "Pw " + "Skill ";
        String s7 = "Java " + "DSA " + "Foundation ";
        String s8 = s5+s7; // Reference Variable used so scp ke bahar store hoga
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);

    }
}