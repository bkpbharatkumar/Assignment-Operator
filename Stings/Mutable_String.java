public class Mutable_String{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Virat ");
        //System.out.println(sb);
        // StringBuffer sb = " "; Invalid Syntax
        sb.append("Kohli");
        System.out.println(sb);
        
        StringBuilder sb1 = new StringBuilder("Bkp ");
        //System.out.println(sb1);
        sb1.append("Bharat Parihar");
        System.out.println(sb1);
    }
}