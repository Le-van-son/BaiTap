package BaiTapTrenLop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Family {
    private String address;
    private int number;
    List<Person> personList = new ArrayList<>();

    public Family() {
    }

    public Family(String address, int number, List<Person> personList) {
        this.address = address;
        this.number = number;
        this.personList = personList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
    public void add(Person person){
        this.personList.add(person);
    }
    Scanner sc = new Scanner(System.in);
    public int findByName(){
        String name = sc.nextLine();
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getName().equals(name)){
                return i;
            }
        }return -1;
    }
    public void edit(){
        int local = findByName();
        Person person = new Person("tue","an choi",18);
        personList.set(local,person);
    }
}
