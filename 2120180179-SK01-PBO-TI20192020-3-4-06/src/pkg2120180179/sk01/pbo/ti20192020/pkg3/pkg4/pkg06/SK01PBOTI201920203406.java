
package pkg2120180179.sk01.pbo.ti20192020.pkg3.pkg4.pkg06;


public class SK01PBOTI201920203406 {


    public static void main(String[] args) {
        for(int i=1; i<=9;i++){
            for(int j=9;j>=i;j--){
                System.out.print(" ");
            }
            for(int x=1;x<=i;x++){
                System.out.print("6");
            }
            for(int y=1;y<=i-1;y++){
                System.out.print("6");
             
            }
            System.out.println();
          }
        
         for(int i=1; i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
                
            }
            for(int x=9;x>=i;x--){
                System.out.print("6");
              
            }
            for(int y=8;y>=i;y--){
                System.out.print("6");
          
            }
            System.out.println();
        }
    }
    
}
