package entity;

public class Pilots {
    private int id;
    private String first_name;
    private String last_name;
    private Rank rank;
        private String pilot_number;

    public Pilots(int id, String first_name, String last_name, Rank rank, String pilot_number) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.rank = rank;
        this.pilot_number = pilot_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String getPilot_number() {
        return pilot_number;
    }

    public void setPilot_code(String pilot_number) {
        this.pilot_number = pilot_number;
    }

    @Override
    public String toString() {
        return "Pilots{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", rank='" + rank + '\'' +
                ", pilot_number='" + pilot_number + '\'' +
                '}';
    }
}
