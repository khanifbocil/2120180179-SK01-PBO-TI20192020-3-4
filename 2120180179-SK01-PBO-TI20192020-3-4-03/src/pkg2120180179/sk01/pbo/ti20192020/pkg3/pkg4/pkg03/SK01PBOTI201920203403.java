
package pkg2120180179.sk01.pbo.ti20192020.pkg3.pkg4.pkg03;


public class SK01PBOTI201920203403 {
    public static void main(String[] args) {
     int x = 9;
     for(int i = 1; i <= 9; i++){
         for(int j = x - 1; j >= 1; j--){
             System.out.print("3");
         }
         for(int d =0; d > i; d--){
             System.out.print(" ");
         }
         System.out.println();
         x-= 1;
    }
    
}
