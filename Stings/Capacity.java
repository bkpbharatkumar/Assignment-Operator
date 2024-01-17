public class Capacity{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("If string is empty then By Default Capcity of StringBuffer : " + sb.capacity()); // default capacity 16
        sb.append("abcdefghijklmnop");
        System.out.println(sb.capacity());
        sb.append("s");
         // new capacity = (current capacity + 1)*2 --> (16+1)*2 = 34
        System.out.println(sb.capacity()); // How many character you can Add.
        System.out.println(sb.length()); // How many character are Present.

        StringBuilder sb2 = new StringBuilder("Sachin");

        System.out.println("In Sachin 6 char present = " + sb2.length());
        System.out.println("In Sachin 6 char present + 16 By Default capacity = " + sb2.capacity());
        System.out.println(sb2.charAt(1));
        sb2.setCharAt(1,'A');
        System.out.println(sb2);
        
        StringBuilder sb3 = new StringBuilder(150);
        System.out.println("StringBuilder initialise 150 char capacity = " + sb3.capacity());
        sb3.append("Bkp Bharat Parihar");
        System.out.println(sb3);
        sb.trimToSize();
        System.out.println("By trim current char capacity = " + sb.capacity());

    }
}