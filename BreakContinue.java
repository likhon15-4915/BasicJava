
package basicjava;
public class BreakContinue {
    public static void main(String[] args){
        int i;
        for(i=1;i<=100;i++){
            
                
            if(i==9){
                continue;
            }
            
            System.out.println(i);
            
            if (i==15){
                break;
            }
            
        }
        
    }
} 
