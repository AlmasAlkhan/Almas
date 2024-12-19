
public class Course {
    private String title;
    private String code;
    private int credits;

    public Course(String title, String code, int credits) {
        this.title = title;
        this.code = code;
        this.credits = credits;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course{title='" + title + "', code='" + code + "', credits=" + credits + "}";
    }
}
