package QLXE;

public class Bike {
    private String bike;
    private String name;
    private String color;
    private int year;

    public Bike(String bike, String name, String color, int year) {
        this.bike = bike;
        this.name = this.name;
        this.color = this.color;
        this.year = this.year;
    }

    public String getBike() {
        return bike;
    }

    public void setBike(String bike) {
        this.bike = bike;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void inttBIKE(){
        System.out.println("thông tin xe : ");
        System.out.println("Loại xe : " + bike + "Tên Xe" + name + "Mầu xe" + color + "năm sản xuất" + year);
    }
}
