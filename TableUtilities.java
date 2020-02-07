 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int a = 5;
        String finaltable = getMultiplicationTable(a);
        return finaltable;
        
        
        /*String finaltable = "";
        for(int i=1; i <= 5; i++){
            for(int j=1; j <= 5; j++) {
                int multi = i * j;
                if (multi < 10) 
                {
                    finaltable += "  " + multi + " |";
                }
                else if (multi < 100 && multi > 9) 
                {
                    finaltable += " " + multi + " |";
                }
                else
                {
                    finaltable += "" + multi + " |" ;
                }
            }
            finaltable += "\n" ;
        }
        return finaltable;        
         */   
    }

    public static String getLargeMultiplicationTable() {
        int b = 10;
        String finaltable1 = getMultiplicationTable(b);
        return finaltable1;
        
        /*String finaltable1 = "";
        for(int i=1; i <= 10; i++){
            for(int j=1; j <= 10; j++) {
                int multi = i * j;
                if (multi < 10) 
                {
                    finaltable1 += "  " + multi + " |";
                }
                else if (multi < 100 && multi > 9) 
                {
                    finaltable1 += " " + multi + " |";
                }
                else
                {
                    finaltable1 += "" + multi + " |" ;
                }
            }
            finaltable1 += "\n" ;
        }
        return finaltable1;        
         */ 
    }

    public static String getMultiplicationTable(int tableSize) {
        String finaltable2 = "";
        for(int i=1; i <= tableSize; i++){
            for(int j=1; j <= tableSize; j++) {
                int multi = i * j;
                if (multi < 10) 
                {
                    finaltable2 += "  " + multi + " |";
                }
                else if (multi < 100 && multi > 9) 
                {
                    finaltable2 += " " + multi + " |";
                }
                else
                {
                    finaltable2 += "" + multi + " |" ;
                }
            }
            finaltable2 += "\n" ;
        }
        return finaltable2;        
          
        }
        
       
    }

