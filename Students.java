class Student{
    int roll_no;
    String name;
    int marks;
    int age;
    Address address;
    static String school_name;

    int calculatePercentage(){
        return marks/5;
    }

    Student(int _roll,String _name,int _marks,int _age,Address address){
        roll_no=_roll;
        name=_name;
        marks=_marks;
        age=_age;
        this.address=address;
        school_name="Dav";
    }
}


class Address{
    int house_no;
    int sector_no;
    String city;
    String state;
    String country;

    Address(int house_no,int sector_no,String city,String state,String country){
        this.house_no=house_no;
        this.sector_no=sector_no;
        this.city=city;
        this.state=state;
        this.country=country;
    }
}


public class Students{
     public static void main(String[] args) {
        Address address=new Address(49, 7, "punchkula", "himachal", "india");
        Student student1=new Student(1126,"Mrinal",467,20,address);
        student1.roll_no=1126;
        student1.name="Mrinal";
        System.out.println(student1.roll_no);
        System.out.println(student1.name);
        System.out.println(student1.marks);
        System.out.println(student1.age);
        System.out.println(student1.address.city);

       // Student.school_name="little boy";
        System.out.println(student1.school_name);
    }
}