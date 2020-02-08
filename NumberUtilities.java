


public class NumberUtilities {

    public static String getRange(int stop) {
        String n ="";
        for(int q = 0; q < stop; q++){
        n += q;
        }
        
        return n;
    }

    public static String getRange(int start, int stop) {
        String r ="";
        for(int q = start;q < stop; q++){
        r += q;
        }
        return r;
    }


    public static String getRange(int start, int stop, int step) {
        String y = "";
        for(int q = start; q < stop; q += step){
            y += q;
        }
        return y;
    }

    public static String getEvenNumbers(int start, int stop) {
        String p = "";
        for(int q = start; q < stop; q ++){
            if(q % 2 == 0){
            p += q;
            }
        } 
        return p;
    }


    public static String getOddNumbers(int start, int stop) {
        String s = "";
        for(int q = start; q < stop; q++){
        if(q % 2 == 1){
        s +=q;
        }
        
        }
        return s;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String v = "";
        
        for(int q = start; q <= stop;q++){
            v +=(int)Math.pow(q, exponent);
            
            
        }  
        return v;
    }
}
