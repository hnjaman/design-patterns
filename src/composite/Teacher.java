package composite;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ITeacher {

    private String teacherName;
    private String deptName;
    private List<ITeacher> controls;

    Teacher(String teacherName, String deptName) {
        this.teacherName = teacherName;
        this.deptName = deptName;
        controls = new ArrayList<ITeacher>();
    }

    public void Add(Teacher teacher) {
        controls.add(teacher);
    }

    public void Remove(Teacher teacher) {
        controls.remove(teacher);
    }

    public List<ITeacher> getControllingDepts() {
        return controls;
    }

    @Override
    public String getDetails() {
        return (teacherName + " is the " + deptName);
    }
}
