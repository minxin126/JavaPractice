import com.newvisual.xinkai.Employee;

import static java.lang.System.out;

//静态导入

/**
 * @Descrption: about package import using
 * @Author: minx
 * @Date: 2019-6-6
 */
public class PackageTest {
    public static void main(String[] args) {
        Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        harry.raiseSalary(5);
        out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
    }

}
