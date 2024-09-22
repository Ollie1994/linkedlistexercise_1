// https://www.geeksforgeeks.org/convert-linkedlist-to-string-in-java/

public class Citys {

    private String cityName;
    private int distanceFromGbInKm;
    //__________________________________________________________________________
    public Citys(String cityName, int distanceFromGbInKm)
    {
        this.cityName = cityName;
        this.distanceFromGbInKm = distanceFromGbInKm;
    }
    //---------------------Getters&Setters-----------------------------------------------
    public String getCityName() {return cityName;}
    public void setCityName(String cityName) {this.cityName = cityName;}
    public int getDistanceFromGbInKm() {return distanceFromGbInKm;}
    public void setDistanceFromGbInKm(int distanceFromGbInKm) {this.distanceFromGbInKm = distanceFromGbInKm;}
    //--------------------------ToString--------------------------------
    public String toString()
    {
        return "City: " + cityName + ", Distance from Gothenburg: " + distanceFromGbInKm;
    }
    //-----------------------------------------------------------------------------------------


}












