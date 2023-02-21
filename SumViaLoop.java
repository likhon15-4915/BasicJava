package basicjava;
//print 1-10 sum
public class SumViaLoop {
    public static void main(String[] args){
        int x=0,i;
        
       /* 
        for(i=1;i<=10;i++){
            x=x+i;
            System.out.println(x);
        }
        */
       
       
       //while loop     
        /*
       i=1;                             //intialization
        while(i<=10){                    //while(Condition){
             x=x+i;              
           System.out.println(x);        //statement
           i++;                          //increment}
        }
       */
        
        //dowhile
        
        i=1; //initialization
        do{
            x=x+i;
            System.out.println(x);
            i++;
        }
        while(i<=10);
  }
}
