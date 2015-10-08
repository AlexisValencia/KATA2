package kata2;

public class BuildHisto {
    
    public static <T> Histogram <T> cumputHisto (T[] vector){
        Histogram <T> histo = new Histogram<>();
        for(T key : vector){
            histo.increment(key);
        }
        return histo;
    }
    
}
