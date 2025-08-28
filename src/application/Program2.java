package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {


        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("==== TEST 1: department findById ====");
        Department department = departmentDao.findById(4);
        System.out.println(department);

        System.out.println("\n==== TEST 2: department findAll ====");
        List<Department> list = departmentDao.findAll();
        list.forEach(System.out::println);

        System.out.println("\n==== TEST 3: department insert ====");
        Department newDepartment = new Department(null, "Fruits");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! Id: " + newDepartment.getId());

        System.out.println("\n==== TEST 4: department update ====");
        newDepartment.setName("Materials");
        departmentDao.update(newDepartment);

        System.out.println("\n==== TEST 4: department delete ====");
        departmentDao.deleteById(9);

    }
}
