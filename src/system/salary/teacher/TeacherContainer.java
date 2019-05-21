package system.salary.teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: tunan
 * @version: v.1.0.1
 * @date: created on 20:14 2019-05-21
 */
public class TeacherContainer {

    /**
     * 教师信息具有增删改查的功能
     */

    private List<Teacher> teachers = new ArrayList<>();

    public TeacherContainer() {
    }

    /**
     * 添加一个教师信息
     * @param teacher
     * @return
     */
    public boolean add(Teacher teacher){
        return this.teachers.add(teacher);
    }

    /**
     * 删除一个教师信息
     * @param id
     * @return
     */
    public boolean delete(int id){
        return this.teachers.removeIf(teacher -> teacher.getId() == id);
    }

    /**
     * 修改教师信息
     * @param teacher
     */
    public void update(Teacher teacher){
        this.teachers.replaceAll(t -> t.getId() == teacher.getId() ? teacher: t);
    }

    /**
     * 获取所有教师信息
     * @return
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }
}
