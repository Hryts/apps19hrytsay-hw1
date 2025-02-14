package ua.edu.ucu.tempseries;

import java.util.Arrays;
import java.util.InputMismatchException;

public class TemperatureSeriesAnalysis {

    private static final double MIN_TEMP = -273;

    private double[] temperatureSeries;
    private int len;
    private int capacity;

    public TemperatureSeriesAnalysis() {
    }

    public TemperatureSeriesAnalysis(double[] temperatureSeries) {
        valid(temperatureSeries);
        this.temperatureSeries = Arrays.copyOf(temperatureSeries,
                temperatureSeries.length);
        len = temperatureSeries.length;
        capacity = temperatureSeries.length;
    }

    private void valid(double... temps) throws InputMismatchException {
        for (double temp: temps) {
            if (temp < MIN_TEMP) {
                throw new InputMismatchException();
            }
        }
    }

    private void empty() throws IllegalArgumentException {
        if (len == 0) {
            throw new IllegalArgumentException();
        }
    }

    public double average() throws IllegalArgumentException {
        empty();
        double med = 0;
        for (int i = 0; i < len; i++) {
            med += (float) temperatureSeries[i];
        }
        return med / len;
    }

    public double deviation() throws IllegalArgumentException {
        empty();
        double mean = average();
        double dev = 0;
        for (int i = 0; i < len; i++) {
            dev += (temperatureSeries[i] - mean)
                    * (temperatureSeries[i] - mean);
        }
        dev /= len;
        return Math.pow(dev, 0.5);
    }

    public double min() throws IllegalArgumentException {
        empty();
        double min = temperatureSeries[0];
        for (int i = 1; i < len; i++) {
            if (temperatureSeries[i] < min) {
                min = temperatureSeries[i];
            }
        }
        return min;
    }

    public double max() throws IllegalArgumentException {
        empty();
        double max = temperatureSeries[0];
        for (int i = 1; i < len; i++) {
            if (temperatureSeries[i] > max) {
                max = temperatureSeries[i];
            }
        }
        return max;
    }

    public double findTempClosestToZero() throws IllegalArgumentException {
        empty();
        double minDif = Math.abs(temperatureSeries[0]);
        double res = temperatureSeries[0];
        for (int i = 1; i < len; i++) {
            if (Math.abs(temperatureSeries[i]) < minDif) {
                res = temperatureSeries[i];
            }
        }
        return res;
    }

    public double findTempClosestToValue(double tempValue)
            throws IllegalArgumentException {
        empty();
        double minDif = Math.abs(temperatureSeries[0] - tempValue);
        double res = temperatureSeries[0];
        for (int i = 1; i < len; i++) {
            if (Math.abs(temperatureSeries[i] - tempValue) < minDif) {
                res = temperatureSeries[i];
            }
        }
        return res;
    }

    public double[] findTempsLessThen(double tempValue)
            throws IllegalArgumentException {
        empty();
        double[] res = new double[len];
        int temp = 0;
        for (int i = 0; i < len; i++) {
            if (temperatureSeries[i] < tempValue) {
                res[temp++] = temperatureSeries[i];
            }
        }
        return Arrays.copyOfRange(res, 0, temp);
    }

    public double[] findTempsGreaterThen(double tempValue)
            throws IllegalArgumentException {
        empty();
        double[] res = new double[len];
        int temp = 0;
        for (int i = 0; i < len; i++) {
            if (temperatureSeries[i] > tempValue) {
                res[temp++] = temperatureSeries[i];
            }
        }
        return Arrays.copyOfRange(res, 0, temp);
    }

    public TempSummaryStatistics summaryStatistics()
            throws IllegalArgumentException {
        empty();
        return new TempSummaryStatistics(average(), deviation(), min(), max());
    }

    int addTemps(double... temps) {
        valid(temps);
        while (capacity - len < temps.length) {
            capacity *= 2;
            temperatureSeries = Arrays.copyOf(temperatureSeries, capacity);
        }
        System.arraycopy(temps, 0, temperatureSeries, len, len
                + temps.length - len);
        return len + temps.length;
    }
}
