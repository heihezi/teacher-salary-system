package system.salary.teacher;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;

/**
 * @author: tunan
 * @version: v.1.0.1
 * @date: created on 20:28 2019-05-21
 */
public class TeacherSystemFrame {


    private static JFrame jFrame = new JFrame("教师工资管理系统");
    private static TeacherContainer teacherContainer = new TeacherContainer();

    public static void main(String[] args) {
        //这里应当只需要一个搜索框、一个列表、一个搜索按钮、一个保存
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        JButton button = new JButton("搜索");
        JButton saveButton = new JButton("保存");
        JButton deleteButton = new JButton("删除");
        JTextField field = new JFormattedTextField("输入教师号搜索");
        JPanel firstRowPanel = new JPanel(new FlowLayout());
        firstRowPanel.add(field);
        firstRowPanel.add(button);
        firstRowPanel.add(saveButton);
        firstRowPanel.add(deleteButton);

        panel.add(firstRowPanel, BorderLayout.NORTH);

        String[] columnsName = {"教师号", "姓名", "性别", "单位名称", "家庭住址", "联系电话", "基本工资", "津贴", "生活补贴", "应发工资"
                , "电话费", "水电费", "房租", "所得税", "卫生费", "公积金", "合计扣款", "实发工资"};

        //模拟数据
        Object[][] rowData = new Object[2][18];

        JTable table = new JTable(rowData, columnsName);

        panel.add(table.getTableHeader(), BorderLayout.CENTER);
        panel.add(table, BorderLayout.SOUTH);

        jFrame.setContentPane(panel);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);


        //在这里开始加操作
        //首先给一个新建的操作
        //table应该有一个刷新的方法，每次改变数据后进行调用，更新其中的数据
        //JTable中显示的只能是二维数组，因此需要一个Teacher到一维数组的转化方法


    }


}
