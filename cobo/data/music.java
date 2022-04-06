public class music {
    //question: what is the average tempo 

    public double tempo(){
        DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
        WeatherStation[] allstns = ds.fetchArray("WeatherStation", "station/station_name", 
                                                "station/station_id", "station/state",
                                         "station/latitude", "station/longitude");
        System.out.println("Total stations: " + allstns.length);
    }
}