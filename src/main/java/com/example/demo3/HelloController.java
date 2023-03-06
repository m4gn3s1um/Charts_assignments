package com.example.demo3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.chart.*;

public class HelloController {

    @FXML
    private LineChart<Number, Number> vejrChart;

    @FXML
    private PieChart pieChart1, pieChart2;

    @FXML
    private BarChart<String, Number> populationBarChart;

    public void visVejr(ActionEvent actionEvent)
    {
        fjernVisibility();
        vejrChart.setVisible(true);
        Axis<Number> xAxis = vejrChart.getXAxis();
        xAxis.setLabel("Label");

        Axis<Number> yAxis = vejrChart.getYAxis();
        yAxis.setLabel("Weather");

        XYChart.Series<Number, Number> degrees = new XYChart.Series<Number,Number>();
        degrees.setName("Grader");

        degrees.getData().add(new XYChart.Data<>(0,8));
        degrees.getData().add(new XYChart.Data<>(1,5));
        degrees.getData().add(new XYChart.Data<>(2,5));
        degrees.getData().add(new XYChart.Data<>(3,8));
        degrees.getData().add(new XYChart.Data<>(4,7));
        degrees.getData().add(new XYChart.Data<>(5,6));
        degrees.getData().add(new XYChart.Data<>(6,9));

        vejrChart.getData().add(degrees);

        XYChart.Series<Number, Number> wind = new XYChart.Series<Number,Number>();
        wind.setName("Vind");

        wind.getData().add(new XYChart.Data<>(0,4.6));
        wind.getData().add(new XYChart.Data<>(0.5,5.8));
        wind.getData().add(new XYChart.Data<>(1,2.2));
        wind.getData().add(new XYChart.Data<>(1.5,1.6));
        wind.getData().add(new XYChart.Data<>(2,3.1));
        wind.getData().add(new XYChart.Data<>(2.5,3.3));
        wind.getData().add(new XYChart.Data<>(3,4.1));
        wind.getData().add(new XYChart.Data<>(3.5,7.8));
        wind.getData().add(new XYChart.Data<>(4,5.1));
        wind.getData().add(new XYChart.Data<>(4.5,7.4));
        wind.getData().add(new XYChart.Data<>(5,7.3));
        wind.getData().add(new XYChart.Data<>(5.5,7.8));
        wind.getData().add(new XYChart.Data<>(6,9.4));
        wind.getData().add(new XYChart.Data<>(6.5,6.4));

        vejrChart.getData().add(wind);

        XYChart.Series<Number, Number> rain = new XYChart.Series<Number,Number>();
        rain.setName("Nedbør");

        rain.getData().add(new XYChart.Data<>(0,0));
        rain.getData().add(new XYChart.Data<>(1,0));
        rain.getData().add(new XYChart.Data<>(2,0));
        rain.getData().add(new XYChart.Data<>(3,0));
        rain.getData().add(new XYChart.Data<>(4,3.3));
        rain.getData().add(new XYChart.Data<>(5,0));
        rain.getData().add(new XYChart.Data<>(6,0));

        vejrChart.getData().add(rain);

    }

    public void visPieChart(ActionEvent actionEvent) {
        fjernVisibility();
        pieChart1.setVisible(true);
        pieChart2.setVisible(true);

        ObservableList<PieChart.Data> pieData1 = FXCollections.observableArrayList(new PieChart.Data("0-2", 1018),
                new PieChart.Data("3-5", 1103),
                new PieChart.Data("6-16", 4494),
                new PieChart.Data("17-19", 1422),
                new PieChart.Data("20-29", 3488),
                new PieChart.Data("30-45", 5984),
                new PieChart.Data("46-64", 10583),
                new PieChart.Data("65-79", 6966),
                new PieChart.Data("80+", 2306)
        );

        pieChart1.setData(pieData1);

        ObservableList<PieChart.Data> pieData2 = FXCollections.observableArrayList
                (
                new PieChart.Data("0-2", 994),
                new PieChart.Data("3-5", 1020),
                new PieChart.Data("6-16", 4052),
                new PieChart.Data("17-19", 1189),
                new PieChart.Data("20-29", 3090),
                new PieChart.Data("30-45", 5904),
                new PieChart.Data("46-64", 8619),
                new PieChart.Data("65-79", 7555),
                new PieChart.Data("80+", 3183)
                );

        pieChart2.setData(pieData2);
    }

    public void visBarChart(ActionEvent actionEvent) {
        fjernVisibility();
        populationBarChart.setVisible(true);

        Axis<String> xaxis = populationBarChart.getXAxis();
        Axis<Number> yaxis = populationBarChart.getYAxis();
        xaxis.setLabel("Age");
        yaxis.setLabel("Population");

        XYChart.Series<String, Number> popul2020 = new XYChart.Series<>();
       popul2020.setName("2020");
       popul2020.getData().add(new XYChart.Data<>("0-2",1018));
       popul2020.getData().add(new XYChart.Data<>("3-5",1103));
       popul2020.getData().add(new XYChart.Data<>("6-16",4494));
       popul2020.getData().add(new XYChart.Data<>("17-19",1422));
       popul2020.getData().add(new XYChart.Data<>("20-29",3488));
       popul2020.getData().add(new XYChart.Data<>("30-45",5984));
       popul2020.getData().add(new XYChart.Data<>("46-64",10583));
       popul2020.getData().add(new XYChart.Data<>("65-79",6966));
       popul2020.getData().add(new XYChart.Data<>("80+",2306));



        XYChart.Series<String, Number> popul2030 = new XYChart.Series<>();
        popul2030.setName("2030");
        popul2030.getData().add(new XYChart.Data<>("0-2",994));
        popul2030.getData().add(new XYChart.Data<>("3-5",1020));
        popul2030.getData().add(new XYChart.Data<>("6-16",4052));
        popul2030.getData().add(new XYChart.Data<>("17-19",1189));
        popul2030.getData().add(new XYChart.Data<>("20-29",3090));
        popul2030.getData().add(new XYChart.Data<>("30-45",5904));
        popul2030.getData().add(new XYChart.Data<>("46-64",8619));
        popul2030.getData().add(new XYChart.Data<>("65-79",7555));
        popul2030.getData().add(new XYChart.Data<>("80+",3183));

        populationBarChart.getData().add(popul2020);
        populationBarChart.getData().add(popul2030);

    }

    public void fjernVisibility(){
        vejrChart.setVisible(false);
        vejrChart.getData().clear();
        pieChart1.setVisible(false);
        pieChart1.getData().clear();
        pieChart2.setVisible(false);
        pieChart2.getData().clear();
        populationBarChart.setVisible(false);
        populationBarChart.getData().clear();;
    }
}