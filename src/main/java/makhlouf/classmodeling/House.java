package makhlouf.classmodeling;

public class House {
    private  double log;
    private double lat ;


    public House(double log, double lat) {
        this.log = log;
        this.lat = lat;
    }

    public double getLog() {
        return log;
    }

    public void setLog(double log) {
        this.log = log;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
     public void positionHouse(){
         System.out.println("position of the house on the map is  " + log + " as longitude  et " + lat + " as latitude" );

     }
}
