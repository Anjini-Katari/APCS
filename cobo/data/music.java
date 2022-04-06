/*Team YAK: Yuki Feng, Anjini Katari, Kevin Li
APCS
LAB08: America's Next Top Data Scientist
2022-04-05
time spent: 2.5 hrs
*/

public class music {
    //question: what is the average tempo 

    public double tempo(){
        DataSource ds = DataSource.connect("https://www.kaggle.com/datasets/geomack/spotifyclassification/download").load();
        tempos[] alltemps = ds.fetchArray("tempo");
        System.out.println("total tempos: " + alltemps.length);
    }
}