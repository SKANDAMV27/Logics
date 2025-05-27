public class space {
    public static void main(String[] args) {
        String str = " j    sa   n nhj   jjn  ";
        String str2 = str.trim();
        String str3 = str.replaceAll("\\s" ,"");
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
    }
}
