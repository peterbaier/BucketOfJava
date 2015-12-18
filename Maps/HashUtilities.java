package Maps;


public class HashUtilities {

    public static int shortHash(int num){
        if(num > 0 && num < 1000) return num;
        return shortHash(Math.abs(num/7));
    }
}
