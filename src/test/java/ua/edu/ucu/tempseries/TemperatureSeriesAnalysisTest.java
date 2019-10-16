package ua.edu.ucu.tempseries;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;

import java.util.Arrays;

public class TemperatureSeriesAnalysisTest {

    @Test
    public void testEmptyConstructor() {
        TemperatureSeriesAnalysis tsa = new TemperatureSeriesAnalysis();
    }

    @Test
    public void testAverageWithOneElementArray() throws IllegalAccessException {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.average();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAverageWithEmptyArray() throws IllegalAccessException {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.average();
    }

    @Test
    public void testAverage() throws IllegalAccessException {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        double actualResult = seriesAnalysis.average();
        
        assertEquals(expResult, actualResult, 0.00001);        
    }

    @Test
    public void testDeviationWithOneElementArray()
            throws IllegalAccessException {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 0.0;

        // call tested method
        double actualResult = seriesAnalysis.deviation();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeviationWithEmptyArray() throws IllegalAccessException {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.deviation();
    }

    @Test
    public void testDeviation() throws IllegalAccessException {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 3.741657387;

        double actualResult = seriesAnalysis.deviation();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testMinWithOneElementArray()
            throws IllegalAccessException {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.min();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinWithEmptyArray() throws IllegalAccessException {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.min();
    }

    @Test
    public void testMin() throws IllegalAccessException {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -5.0;

        double actualResult = seriesAnalysis.min();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testMaxWithOneElementArray()
            throws IllegalAccessException {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.max();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxWithEmptyArray() throws IllegalAccessException {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.min();
    }

    @Test
    public void testMax() throws IllegalAccessException {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 5.0;

        double actualResult = seriesAnalysis.max();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testFindTempClosestToZeroWithOneElementArray()
            throws IllegalAccessException {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.findTempClosestToZero();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindTempClosestToZeroWithEmptyArray()
            throws IllegalAccessException {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.findTempClosestToZero();
    }

    @Test
    public void testFindTempClosestToZero() throws IllegalAccessException {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        double actualResult = seriesAnalysis.findTempClosestToZero();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testFindTempClosestToValueWithOneElementArray()
            throws IllegalAccessException {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;
        double arg = 5.0;

        // call tested method
        double actualResult = seriesAnalysis.findTempClosestToValue(arg);

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindTempClosestToValueWithEmptyArray()
            throws IllegalAccessException {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double arg = 5.0;

        // expect exception here
        seriesAnalysis.findTempClosestToValue(arg);
    }

    @Test
    public void testFindTempClosestToValueIncluded()
            throws IllegalAccessException {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 5.0;
        double arg = 5.0;

        double actualResult = seriesAnalysis.findTempClosestToValue(arg);

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testFindTempClosestToValueExcluded()
            throws IllegalAccessException {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;
        double arg = 0.0;

        double actualResult = seriesAnalysis.findTempClosestToValue(arg);

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testFindTempsLessThenWithOneElementArrayNotEmptyResult()
            throws IllegalAccessException {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {-1.0};
        double arg = 100.0;

        // call tested method
        double[] actualResult = seriesAnalysis.findTempsLessThen(arg);

        // compare expected result with actual result
        assertTrue(Arrays.equals(actualResult, expResult));
    }

    @Test
    public void testFindTempsLessThenWithOneElementArrayEmptyResult()
            throws IllegalAccessException {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {};
        double arg = -100.0;

        // call tested method
        double[] actualResult = seriesAnalysis.findTempsLessThen(arg);

        // compare expected result with actual result
        assertTrue(Arrays.equals(expResult, actualResult));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindTempsLessThenWithEmptyArray()
            throws IllegalAccessException {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double arg = 100.0;

        // expect exception here
        seriesAnalysis.findTempsLessThen(arg);
    }

    @Test
    public void testFindTempsLessThenNotEmptyResult()
            throws IllegalAccessException {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {3.0, -5.0, 1.0, 5.0};
        double arg = 100.0;

        double[] actualResult = seriesAnalysis.findTempsLessThen(arg);

        assertTrue(Arrays.equals(expResult, actualResult));
    }

    @Test
    public void testFindTempsLessThenEmptyResult()
            throws IllegalAccessException {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {};
        double arg = -100.0;

        double[] actualResult = seriesAnalysis.findTempsLessThen(arg);

        assertTrue(Arrays.equals(expResult, actualResult));
    }

    @Test
    public void testFindTempsGreaterThenWithOneElementArrayNotEmptyResult()
            throws IllegalAccessException {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {-1.0};
        double arg = -100.0;

        // call tested method
        double[] actualResult = seriesAnalysis.findTempsGreaterThen(arg);

        // compare expected result with actual result
        assertTrue(Arrays.equals(actualResult, expResult));
    }

    @Test
    public void testFindTempsGreaterThenWithOneElementArrayEmptyResult()
            throws IllegalAccessException {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {};
        double arg = 100.0;

        // call tested method
        double[] actualResult = seriesAnalysis.findTempsGreaterThen(arg);

        // compare expected result with actual result
        assertTrue(Arrays.equals(expResult, actualResult));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindTempsGreaterThenWithEmptyArray()
            throws IllegalAccessException {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double arg = 100.0;

        // expect exception here
        seriesAnalysis.findTempsGreaterThen(arg);
    }

    @Test
    public void testFindTempsGreaterThenNotEmptyResult()
            throws IllegalAccessException {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {3.0, -5.0, 1.0, 5.0};
        double arg = -100.0;

        double[] actualResult = seriesAnalysis.findTempsGreaterThen(arg);

        assertTrue(Arrays.equals(expResult, actualResult));
    }

    @Test
    public void testFindTempsGreaterThenEmptyResult()
            throws IllegalAccessException {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis =
                new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {};
        double arg = 100.0;

        double[] actualResult = seriesAnalysis.findTempsGreaterThen(arg);

        assertTrue(Arrays.equals(expResult, actualResult));
    }


}