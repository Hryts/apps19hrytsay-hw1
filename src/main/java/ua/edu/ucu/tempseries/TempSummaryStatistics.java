package ua.edu.ucu.tempseries;

public class TempSummaryStatistics {

    private double avgTemp;
    private double devTemp;
    private double minTemp;
    private double maxTemp;



    public TempSummaryStatistics(double avgTemp, double devTemp,
                                 double minTemp, double maxTemp) {
        this.avgTemp = avgTemp;
        this.devTemp = devTemp;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

    public TempSummaryStatistics() {
    }

    public double getAvgTemp() {
        return avgTemp;
    }

    public void setAvgTemp(double avg) {
        this.avgTemp = avg;
    }

    public double getDevTemp() {
        return devTemp;
    }

    public void setDevTemp(double dev) {
        this.avgTemp = dev;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double min) {
        this.minTemp = min;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double max) {
        this.maxTemp = max;
    }

//    @Override
//    public boolean equals(Object o) {
//
//        if (o == this) {
//            return true;
//        }
//
//        if (!(o instanceof TempSummaryStatistics)) {
//            return false;
//        }
//
//        TempSummaryStatistics tss = (TempSummaryStatistics) o;
//
//        System.out.println(Math.abs(avgTemp - tss.avgTemp) < 1e-4);
//
//        return Math.abs(avgTemp - tss.avgTemp) < 1e-4
//            && Math.abs(devTemp - tss.devTemp) < 1e-4
//            && Math.abs(minTemp - tss.minTemp) < 1e-4
//            && Math.abs(maxTemp - tss.maxTemp) < 1e-4;
//
//    }
}
