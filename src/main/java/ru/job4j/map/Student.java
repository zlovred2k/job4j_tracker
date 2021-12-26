package ru.job4j.map;

import java.util.Objects;

public class Student {

    private String name;
    private String account;
    private String group;

    public Student(String name, String account, String group) {
        this.name = name;
        this.account = account;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getAccount() {
        return account;
    }

    public String getGroup() {
        return group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(name, student.name)
                && Objects.equals(account, student.account)
                && Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, account, group);
    }

    @Override
    public String toString() {
        return "Student{"
                + "name='" + name + '\''
                + ", account='" + account + '\''
                + ", group='" + group + '\''
                + '}';
    }
}

