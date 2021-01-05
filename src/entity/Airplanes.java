package entity;

public class Airplanes {
    private int id;
    private String mark;
    private String model;
    private int capacity;
    private String plane_number;

    public Airplanes(int id, String mark, String model, int capacity, String plane_number) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.capacity = capacity;
        this.plane_number = plane_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getPlane_number() {
        return plane_number;
    }

    public void setPlane_number(String plane_number) {
        this.plane_number = plane_number;
    }

    @Override
    public String toString() {
        return "Airplanes{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                ", plane_number='" + plane_number + '\'' +
                '}';
    }
}
