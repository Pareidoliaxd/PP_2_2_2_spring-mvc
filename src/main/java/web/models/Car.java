package web.models;

public class Car {

    //private Long id;
    private String model;
    private String series;
    private int number;

    public Car(/*Long id, */String model, String series, int number) {
        //this.id = id;
        this.model = model;
        this.series = series;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car " +
                "model ='" + model + "'\n" +
                ", series ='" + series +"'\n" +
                ", number =" + number  ;
    }

//    public Long getId() {
//        return id;
//    }

    public String getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }

    public int getNumber() {
        return number;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
