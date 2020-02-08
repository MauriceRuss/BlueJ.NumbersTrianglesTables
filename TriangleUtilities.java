 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String w = "";
        for(int q = 0; q < numberOfStars;q++){
        w += "*";
        
        }
        return w;
    }
    
    public static String getTriangle(int numberOfRows) {
        String r = "";
        for(int q = 0; q < numberOfRows;q++){
        r += getRow(q) + "*\n" ;
        }
        
        return r;
    }


    public static String getSmallTriangle() {
        String b = "";
        for(int q = 0; q < 4;q++){
       b += getRow(q) + "*\n" ;
        }
        return b;
    }

    public static String getLargeTriangle() {
        String m = "";
         for(int q = 0; q < 9;q++){
       m += getRow(q) + "*\n" ;
        }
        return m;
    }
}
