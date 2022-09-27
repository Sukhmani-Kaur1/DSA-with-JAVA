import java.util.Objects;

public class Teacher {
    private String sub;
    private int id;
    private int cls;

    public Teacher(String sub, int id, int cls) {
        this.sub = sub;
        this.id = id;
        this.cls = cls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return id == teacher.id && cls == teacher.cls && Objects.equals(sub, teacher.sub);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sub, id, cls);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "sub='" + sub + '\'' +
                ", id=" + id +
                ", cls=" + cls +
                '}';
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCls() {
        return cls;
    }

    public void setCls(int cls) {
        this.cls = cls;
    }
}
