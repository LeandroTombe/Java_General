package Descending_Order;

public class DescendingOrder {
    
    public static int mayor=0; 
     public static int sortDesc(final int num) {
         
         int comparar;
                
         if (num<10) {
            if (mayor<num){
                mayor=num;
            } 
         return mayor;   
         }else{
           comparar= num % 10;
             if (mayor<comparar) {
                 mayor=comparar;
             }
           
             return(sortDesc(num / 10));
         
         }
         
  }
    
}
