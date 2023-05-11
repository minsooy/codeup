package com.likelion.codeup.week4.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {

    String num;
    String name;


    public Student(String num, String name) {
        this.num = num;
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class q3108 {
    private List<Student> students = new ArrayList<>();

    public Student makeAStudent(String num, String name){
        return new Student(num, name);
    }

    public boolean isDuplicated(Student pStudent) {
        for (Student student : students){
            if(pStudent.getNum().equals(student.getNum())) return true;
        }
        return false;
    }

    private void deleteStudent(Student pStudent) {
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getNum().equals(pStudent.getNum())) students.remove(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =  sc. nextInt();
        sc.nextLine();
        q3108 solver = new q3108();

        for (int i = 0; i < count; i++) {
            String[] info = sc.nextLine().split(" ");
            Student student = solver.makeAStudent(info[1],info[2]);
            if (info[0].equals("I") && !solver.isDuplicated(student)){
                solver.students.add(student);
            }else {
                solver.deleteStudent(student);
            }
        }

        solver.students.sort((s1, s2) -> Integer.compare(Integer.parseInt(s1.getNum()), Integer.parseInt(s2.getNum())));

        String[] indexList = sc.nextLine().split(" ");

        for (int i = 0; i < indexList.length; i++) {
            int index = Integer.parseInt(indexList[i]) - 1;
            System.out.printf("%s %s\n", solver.students.get(index).getNum() ,solver.students.get(index).getName());
        }


    }

}
