public class Reverse {
    public static void main(String args[]){
        String input = "SKANDA M V";
        char[] a=input.toCharArray();
        System.out.print("Orginal: ");
        for(char num:a){
            System.out.print(num+" ");
        }
        for(int i=0;i<a.length/2;i++){
            char temp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1]=  temp;
        }
        System.out.print("\nReverse: ");
        for(char num:a){
            System.out.print(num+" ");
        }
    }
}
