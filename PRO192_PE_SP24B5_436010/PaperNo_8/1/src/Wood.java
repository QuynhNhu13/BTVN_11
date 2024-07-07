
public class Wood {

    String source;
    int year;

    public Wood() {
    }

    public Wood(String source, int year) {
        this.source = source;
        this.year = year;
    }

    public String getSource() {
        StringBuilder sc = new StringBuilder(source);
        if (sc.length() > 0) {
            sc.deleteCharAt(sc.length() - 1);
        }
        return sc.toString();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year - year;
    }

}
