package com.runoob.object_classes;

import com.runoob.object_classes.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        /* 使用构造器创建两个对象 */
        Employee empOne = new Employee("员工a");
        Employee empTwo = new Employee("员工b");

        // 调用这两个对象的成员方法
        empOne.empAge(26);
        empOne.empDesignation("这是员工a");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("这是员工b");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}
