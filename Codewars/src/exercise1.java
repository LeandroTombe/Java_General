
public class exercise1 {
 
    
    /* this method consists of three parameters. 
    the first one refers to the country number.
    the second involves the locality number.
    the third and last, is the cell phone number*/
    
    public static String createPhoneNumber(int parameter1, int parameter2, int parameter3)
    {
        String answer;
    
    
    try{
        answer=String.valueOf(parameter1);
        
    
    }catch(NumberFormatException ex ){
        
    answer="se han introducido caracteres no numericos";
    
    }
    
    
    
    
    
    
    
    return null;
    
    
    }
    
}
