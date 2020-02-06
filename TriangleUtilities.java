 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String star = "";
        for(int i=1; i <= numberOfStars; i++){
            star += "*";
        }
        return star;
    }
    
    public static String getTriangle(int numberOfRows) {
        String star1 = "" ;
        for(int i =1; i <= numberOfRows; i++) {
            star1 += getRow(i) + "\n";
        }
        return star1;
    }


    public static String getSmallTriangle() {
        String star2 = "" ;
        for(int i =1; i <= 4; i++) {
            star2 += getRow(i) + "\n";
        }
        return star2;
    }

    public static String getLargeTriangle() {
        String star3 = "" ;
        for(int i =1; i <= 9; i++) {
            star3 += getRow(i) + "\n";
        }
        return star3;
    }
}
