public class remove {
    public static void main(String[] args) {
        String str = "@3Skanda%^M!V^G%O@W!D$A";
        String str1 = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("With Special Charcture: "+str);
        System.out.println(str1);
    }
}
