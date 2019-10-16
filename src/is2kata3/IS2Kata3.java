package is2kata3;

public class IS2Kata3 {

    
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        
        HistogramDisplay display = new HistogramDisplay(histogram);
        display.execute();
    }
    
}
