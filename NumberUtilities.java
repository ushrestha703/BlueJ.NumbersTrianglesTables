


public class NumberUtilities {

    public static String getRange(int stop) {
        String concat1 = "" ;
        for(int i = 0; i < stop; i++) {
        concat1 += i;  
    }
        return concat1;
    
    }

    public static String getRange(int start, int stop) {
        String concat2 = "" ;
        for(int i = start; i < stop; i++) {
            concat2 += i;
        }
        return concat2;
    }


    public static String getRange(int start, int stop, int step) {
        String concat3 = "" ;
        for(int i = start; i < stop; i = i + step) {
            concat3 += i;
        }
        return concat3;
    }

    public static String getEvenNumbers(int start, int stop) {
        String concat4 = "" ;
        for(int i = start; i < stop; i++) 
        if (i % 2 == 0){
            concat4 += i; 
        }
        return concat4;
    }


    public static String getOddNumbers(int start, int stop) {
        String concat5 = "" ;
        for(int i = start; i < stop; i++)
        if (i % 2 != 0) {
            concat5 += i;
        }
        return concat5;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String concat6 = "" ;
        for(int i = start; i <= stop; i++) 
        {
            //i = Math.pow(i,exponent);
            concat6 += (int)Math.pow(i,exponent);
            
    }
        return concat6;
    }
}
