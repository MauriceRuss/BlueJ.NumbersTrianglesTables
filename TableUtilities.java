 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String getSmallMult = "";
        Integer collect2 = 0;
        for(int q = 1;q <= 5; q++){
            for(int u =1;u <= 5;u++){
                collect2 = q * u;
                if(collect2 < 10){
                    getSmallMult += "  " + collect2 + " " + "|";
                }else if(collect2 >= 10 && collect2 <=99){
                getSmallMult += " " + collect2 + " " + "|";
                }else if(collect2 <= 100 && collect2 >= 999){
                getSmallMult += collect2 + " " + "|";
                }
            }
            getSmallMult += "\n";
        }
        return getSmallMult;
    }

    public static String getLargeMultiplicationTable() {
        String getLargeMult = "";
        Integer collect = 0;
        for(int q = 1;q <= 10; q++){
            for(int u = 1;u <= 10; u++){
                collect = q * u;
                if(collect< 10){
                    getLargeMult += "  " + collect + " " + "|";
                }else if(collect >= 10 && collect<=99){
                getLargeMult += " " + collect + " " + "|";
                }else if(collect >= 100 && collect <= 999){
                getLargeMult += collect + " " + "|";
                }
            }  
            getLargeMult += "\n";
        }
        
        return getLargeMult;
    }

    public static String getMultiplicationTable(int tableSize) {
        String w = "";
        Integer r = 0;
        for(int q = 1;q <= tableSize; q++){
            for(int u = 1;u <= tableSize; u++){
                r = q * u;
                if(r < 10){
                    w += "  " + r + " " + "|";
                }else if(r>= 10 && r<=99){
                w += " " + r + " " + "|";
                }else if(r >= 100 && r <= 999){
                w += r + " " + "|";
                }
            }  
            w += "\n";
        }
        return w;
    }

}
