//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//class Book{
//    String name;
//    String author;
//    int pages;
//
//
//    public Book(String name,String author, int pages){
//        this.name = name;
//        this.author = author;
//        this.pages = pages;
//    }
//    public String getName(){
//        return name;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public String getAuthor(){
//        return author;
//    }
//
//    public void setAuthor(String author){
//        this.author = author;
//    }
//
//    public int getPages(){
//        return pages;
//    }
//
//    public void setPages(int pages){
//        this.pages = pages;
//    }
//
//    public String toString(){
//        return "Book{" +
//                "name=' " + name + '\'' +
//                ", author=" + author +
//                ", pages=" + pages +
//                '}';
//    }
//}
//public class Main {
//    public static void main(String[] args){
//        Book book = new Book("Pride and Prejudice", "Jane Austen",345);
//        System.out.println(book.getName());
//
//        System.out.println("Old info: "+book);
//
//        book.setName("Ushqan uia");
//        book.setAuthor("Bauyrzhan Momushuly");
//        book.setPages(240);
//        System.out.println(book);
//    }
//}



//public class Main{
//    public static void main(String[] args){
//        ArrayList<Book> bookArrayList = new ArrayList<>();
//
//        Book book = new Book("Emma","Jane Austen", 544);
//        Book book2 = new Book("Mansfield Park","Jane Austen", 512);
//        Book book3 = new Book("Sense and Sensibility","Jane Austen", 384);
//
//
//        bookArrayList.add(book);
//        bookArrayList.add(book2);
//        bookArrayList.add(book3);
//        System.out.println(bookArrayList);
//
//
//        for (Book s: bookArrayList){
//            System.out.println(s);
//        }
//
//
//    }
//}




//public class Main{
//    public static void main(String[] args){
//        ArrayList<Book> bookArrayList = new ArrayList<>();
//
//        Book book = new Book("Emma","Jane Austen", 544);
//        Book book2 = new Book("Mansfield Park","Jane Austen", 512);
//        Book book3 = new Book("Sense and Sensibility","Jane Austen", 384);
//
//
//        bookArrayList.add(book);
//        bookArrayList.add(book2);
//        bookArrayList.add(book3);
//        System.out.println("Old list: "+bookArrayList);
//
//
//       System.out.println(bookArrayList.get(0));
//        Collections.sort(bookArrayList, new SortByAuthor());
//        System.out.println("Sorted by author: "+bookArrayList);
//
//
//        Collections.sort(bookArrayList, new SortByPages());
//    }
//}
//
//class SortByAuthor implements Comparator<Book>{
//    @Override
//    public int compare(Book b1, Book b2){
//       return b1.getAuthor().compareTo(b2.getAuthor());
//
//    }
//}
//
//class SortByPages implements Comparator<Book>{
//    @Override
//    public int compare(Book b1, Book b2){
//        if(b1.getPages() == b2.getPages())
//            return 0;
//        if(b1.getPages() > b2.getPages())
//            return 1;
//        else return -1;
//    }
//}
//
//class SortByName implements Comparator<Book>{
//    @Override
//    public int compare(Book b1, Book b2){
//        return b1.getName().compareTo(b2.getName());
//    }
//}
//




//public class Main{
//    public static void main(String[] args){
//        ArrayList<Book> bookArrayList = new ArrayList<>();
//
//        Book book = new Book("Emma","Jane Austen", 544);
//        Book book2 = new Book("Mansfield Park","Jane Austen", 512);
//        Book book3 = new Book("Sense and Sensibility","Jane Austen", 384);
//
//
//        bookArrayList.add(book);
//        bookArrayList.add(book2);
//        bookArrayList.add(book3);
//
//
//        Book b = getBookByPages(bookArrayList,544);
//        System.out.println(b);
//
//    }
//
//    public static Book getBookByPages(ArrayList<Book> list, int pages){
//        Book res = null;
//        for(Book b:list){
//            if(b.getPages()==pages){
//                res = b;
//            }
//        }
//        return res;
//    }
//}





//Problem1
//import java.util.ArrayList;
//
//public class Main {
// public static void main(String[] args) {
//        Student student1 = new Student(1,"Miras","Kalen","Yerikuly",2006,"Taraz","87771112233","IT","3F",3);
//        Student student2 = new Student(2,"Adiya","Kalen","Yerikqyzy",2007,"Taraz","87478779898","Teacher","2E",2);
//        Student student3 = new Student(3,"Merey","Yeren","Madiqyzy",2003,"Merke","87789997788","Marketing","3D",3);
//        Student student4 = new Student(4,"Merey","Kalen","Yerikqyzy",2005,"Taraz","87004821982","Marketing","2B",2);
//
//
// ArrayList<Student> studentArrayList = new ArrayList<>();
//
//             studentArrayList.add(student1);
//             studentArrayList.add(student2);
//             studentArrayList.add(student3);
//             studentArrayList.add(student4);
//
//
//A)
//   String faculty = "Marketing";
// for(Student a:studentArrayList){
// if(a.getFaculty() == faculty){
// System.out.println(a);
// }
// }
//
//B)
// String it = "IT";
// String teacher = "Teacher";
// String marketing = "Marketing";
// for(Student a : studentArrayList){
// if(a.getFaculty()==it && a.getCourse()==3){
// System.out.println("Faculty IT Third Course:\n"+a);
// }else if(a.getFaculty()==teacher && a.getCourse()==2){
// System.out.println("Faculty Teacher Second Course :\n"+a);
// }else if(a.getFaculty()==teacher && a.getCourse()==3){
// System.out.println("Faculty Teacher Third Course :\n"+a);
// }else if(a.getFaculty()==marketing && a.getCourse()==2){
// System.out.println("Faculty Marketing Second Course :\n"+a);
// }else if(a.getFaculty()==marketing && a.getCourse()==3){
// System.out.println("Faculty Marketing Third Course :\n"+a);
//            }
//        }
//
//C)
// int date = 2003;
// for(Student a:studentArrayList){
// if(a.getBirthday_date()>date){
// System.out.println("Students born after 2004:\n"+a);
//   }
// }
//
//D)
// ArrayList<String> groups = new ArrayList<>();
//        for(Student a:studentArrayList){
// groups.add(a.getGroup());
//        }
// System.out.println(groups);
//
//    }
//}
//class Student{
// int id;
// String surname;
// String name;
// String patronymic;
// int birthday_date;
// String address;
// String phone_number;
// String faculty;
// int course;
// String group;
//
//
//
//
// public Student(int id,String name,String surname,String patronymic,int birthday_date,String address,String phone_number,String faculty,String group,int course){
//       this.id = id;
//       this.surname = surname;
//       this.name = name;
//       this.patronymic = patronymic;
//       this.birthday_date = birthday_date;
//       this.address = address;
//       this.phone_number = phone_number;
//       this.faculty = faculty;
//       this.course = course;
//      this.group = group;
//
//       }
//
//            public int getId() {
// return id;
//    }
//
//            public String getSurname() {
// return surname;
//    }
//
//            public String getName() {
// return name;
//    }
//
//            public String getPatronymic() {
// return patronymic;
//    }
//
// public int getBirthday_date() {
// return birthday_date;
//    }
//
// public String getAddress() {
// return address;
//    }
//
// public String getPhone_number() {
// return phone_number;
//    }
//
// public String getFaculty() {
// return faculty;
//    }
//
// public int getCourse() {
// return course;
//    }
//
// public String getGroup() {
// return group;
//    }
//
// public void setId(int id) {
// this.id = id;
//    }
//
// public void setSurname(String surname) {
// this.surname = surname;
//    }
//
// public void setName(String name) {
// this.name = name;
//    }
//
// public void setPatronymic(String patronymic) {
// this.patronymic = patronymic;
//    }
//
// public void setBirthday_date(int birthday_date) {
// this.birthday_date = birthday_date;
//    }
//
// public void setAddress(String address) {
// this.address = address;
//    }
//
// public void setPhone_number(String phone_number) {
// this.phone_number = phone_number;
//    }
//
// public void setFaculty(String faculty) {
// this.faculty = faculty;
//    }
//
// public void setCurse(int course) {
// this.course = course;
//    }
//
// public void setGroup(String group) {
// this.group = group;
//    }
//
// @Override
// public String toString() {
// return "Student{" +
// "id=" + id +
// ", surname='" + surname + '\'' +
// ", name='" + name + '\'' +
// ", patronymic='" + patronymic + '\'' +
// ", birthday_date='" + birthday_date + '\'' +
// ", adres='" + address + '\'' +
// ", phone_number='" + phone_number + '\'' +
// ", faculted='" + faculty + '\'' +
// ", curse=" + course +
// ", group='" + group + '\'' +
//                '}';
//    }
//}





//Problem2
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class Main {
//    public static void main(String[] args) {
//        Customer customer = new Customer(1,"Kalen","Miras","Yerikuly","Taraz", 9039,130);
//        Customer customer1 = new Customer(2,"Kalen","Adiya","Yerikqyzy","Taraz",  7744,131);
//        Customer customer2 = new Customer(3,"Yeren","Merey","Madiqyzy","Merke", 5547,132);
//        Customer customer3 = new Customer(4,"Kalen","Merey","Yerikqyzy","Taraz", 3374,133);
//
//
//
//        ArrayList<Customer> customersArrayList = new ArrayList<>();
//        customersArrayList.add(customer);
//        customersArrayList.add(customer1);
//        customersArrayList.add(customer2);
//        customersArrayList.add(customer3);
//
//
//
//
//A)
//        Collections.sort(customersArrayList,new SortByName());
//        for(Customer s:customersArrayList){
//            System.out.println(s.getName());
//        }
//
//
//        B)
//        int first = 3374;
//        int second = 9039;
//        ArrayList<Customer> range_customers = new ArrayList<>();
//        for(Customer f:customersArrayList){
//            if(f.getNumber_card()>=first && f.getNumber_card()<=second){
//                range_customers.add(f);
//            }
//        }
//        System.out.println("Range Customers number card of 3374-9039");
//        for(Customer f:range_customers){
//            System.out.println(f);
//        }
//    }
//}
//
//
//
//class SortByName implements Comparator<Customer>{
//
//    @Override
//    public int compare(Customer first, Customer second) {
//        return first.getName().compareTo(second.getName());
//    }
//}
//class Customer{
//    int id;
//    String surname;
//    String name;
//    String lastname;
//    String address;
//    int number_card;
//    int bank_check_number;
//    public Customer(int id,String surname,String name,String lastname,String address,int number_card,int bank_check_number){
//        this.id =id;
//        this.surname =surname;
//        this.name =name;
//        this.lastname =lastname;
//        this.address =address;
//        this.number_card =number_card;
//        this.bank_check_number =bank_check_number;
//
//    }
//
//    @Override
//    public String toString() {
//        return "Customer{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", name='" + name + '\'' +
//                ", lastname='" + lastname + '\'' +
//                ", address='" + address + '\'' +
//                ", number_card=" + number_card +
//                ", bank_check_number=" + bank_check_number +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public int getNumber_card() {
//        return number_card;
//    }
//
//    public void setNumber_card(int number_card) {
//        this.number_card = number_card;
//    }
//
//    public int getBank_check_number() {
//        return bank_check_number;
//    }
//
//    public void setBank_check_number(int bank_check_number) {
//        this.bank_check_number = bank_check_number;
//    }
//}
//







//Problem3
//import java.util.ArrayList;
//
//public class Main{
// public static void main(String[] args) {
// Patient patient1 = new Patient(1,"Kalen","Miras","Yerikuly","Taraz","87771112233",12,"Allergy");
// Patient patient2 = new Patient(2,"Kalen","Adiya","Yerikqyzy","Taraz","87478779898",23,"Allergy");
// Patient patient3 = new Patient(3,"Yeren","Merey","Madiqyzy","Merke","87789997788",35,"Bronchitis");
// Patient patient4 = new Patient(4,"Kalen","Merey","Yerikqyzy","Taraz","87004821982",44,"Gastritis");
//
// ArrayList<Patient> patientsArrayList = new ArrayList<>();
// patientsArrayList.add(patient1);
// patientsArrayList.add(patient2);
// patientsArrayList.add(patient3);
// patientsArrayList.add(patient4);
//
//
//
//A)
// ArrayList<Patient> allergy = new ArrayList<>();
// String allergy_diagnosis = "Allergy";
// for(Patient s:patientsArrayList){
// if(s.getDiagnosis()==allergy_diagnosis){
//     allergy.add(s);
//            }
//        }
// System.out.println("Patients which have allergy:");
// for(Patient p:allergy){
// System.out.println(p);
//        }
//
//B)
//        int first = 1;
//        int second = 2;
//        ArrayList<Patient> interval = new ArrayList<>();
//        for(Patient s:patientsArrayList){
//            if(s.getNumber_medical_card()>=first && s.getNumber_medical_card()<=second){
//                interval.add(s);
//            }
//        }
//        System.out.println("Patients in interval 1-4");
//        for(Patient p: interval){
//            System.out.println(p);
//        }
//    }
//}
//
//
//
//class Patient{
//    int id;
//    String surname;
//    String name;
//    String patronymic;
//    String address;
//    String phone_number;
//    int number_medical_card;
//    String diagnosis;
//    public Patient(int id,String surname,String name,String patronymic,String address,String phone_number,int number_medical_card,String diagnosis){
//        this.id = id;
//        this.surname = surname;
//        this.name = name;
//        this.patronymic = patronymic;
//        this.address = address;
//        this.phone_number = phone_number;
//        this.number_medical_card = number_medical_card;
//        this.diagnosis = diagnosis;
//    }
//
//    @Override
//    public String toString() {
//        return "Patient{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", name='" + name + '\'' +
//                ", patronymic='" + patronymic + '\'' +
//                ", address='" + address + '\'' +
//                ", phone_number='" + phone_number + '\'' +
//                ", number_medical_card=" + number_medical_card +
//                ", diagnosis='" + diagnosis + '\'' +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPatronymic() {
//        return patronymic;
//    }
//
//    public void setPatronymic(String patronymic) {
//        this.patronymic = patronymic;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getPhone_number() {
//        return phone_number;
//    }
//
//    public void setPhone_number(String phone_number) {
//        this.phone_number = phone_number;
//    }
//
//    public int getNumber_medical_card() {
//        return number_medical_card;
//    }
//
//    public void setNumber_medical_card(int number_medical_card) {
//        this.number_medical_card = number_medical_card;
//    }
//
//    public String getDiagnosis() {
//        return diagnosis;
//    }
//
//    public void setDiagnosis(String diagnosis) {
//        this.diagnosis = diagnosis;
//    }
//}





//Problem4
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class Main {
//    public static void main(String[] args) {
//        applicant applicant1 = new applicant(1,"Kalen","Miras","Yerikuly","Taraz","87771112233",100);
//        applicant applicant2 = new applicant(2,"Kalen","Adiya","Yerikqyzy","Taraz","87478779898",75);
//        applicant applicant3 = new applicant(3,"Yeren","Merey","Madiqyzy","Merke","87789997788",80);
//        applicant applicant4 = new applicant(4,"Kalen","Merey","Yerikqyzy","Taraz","87004821982",60);
//
//        ArrayList<applicant> applicantArrayList = new ArrayList<>();
//        applicantArrayList.add(applicant1);
//        applicantArrayList.add(applicant2);
//        applicantArrayList.add(applicant3);
//        applicantArrayList.add(applicant4);
//
//
//A)       ArrayList<applicant> tomen_marks = new ArrayList<>();
//        for(applicant f: applicantArrayList){
//            if(f.getMarks()<69){
//                tomen_marks.add(f);
//            }
//        }
//        System.out.println("neudovletvoritelnyye otsenki:");
//        for (applicant d:tomen_marks) {
//            System.out.println(d);
//        }
//
// B)       int mark = 80;
//        ArrayList<applicant> more_than = new ArrayList<>();
//        for(applicant d:applicantArrayList){
//            if(d.getMarks()>mark){
//                more_than.add(d);
//            }
//        }
//        System.out.println("bally vyshe ukazannogo");
//        for(applicant f:more_than){
//            System.out.println(f);
//        }
//
//        int n = 3;
//        Collections.sort(applicantArrayList,new SortByMarks());
//        ArrayList<applicant> themost = new ArrayList<>();
//        System.out.println("naivysshiy obshiy ball");
//        for(int i = 0;i<n;i++){
//            themost.add(applicantArrayList.get(i));
//        }
//        System.out.println(themost);
//
//
//        for(applicant f:applicantArrayList){
//            if(f.getMarks()>70){
//                System.out.println(f);
//            }
//        }
//
//    }
//}
//class SortByMarks implements Comparator<applicant> {
//
//    @Override
//    public int compare(applicant first, applicant second) {
//        if(first.getMarks() == second.getMarks()){
//            return 0;
//        }else if(first.getMarks()>second.getMarks()){
//            return -1;
//        }else{
//            return 1;
//        }
//    }
//}
//class applicant{
//    int id;
//    String surname;
//    String name;
//    String Patronymic;
//    String address;
//    String phone_number;
//    int marks;
//
//    public applicant(int id, String surname, String name, String Patronymic, String address, String phone_number, int marks) {
//        this.id = id;
//        this.surname = surname;
//        this.name = name;
//        this.Patronymic = Patronymic;
//        this.address = address;
//        this.phone_number = phone_number;
//        this.marks = marks;
//    }
//
//    @Override
//    public String toString() {
//        return "applicant{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", name='" + name + '\'' +
//                ", patronymic='" + Patronymic + '\'' +
//                ", address='" + address + '\'' +
//                ", phone_number='" + phone_number + '\'' +
//                ", marks=" + marks +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPatronymic() {
//        return Patronymic;
//    }
//
//    public void setPatronymic(String Patronymic) {
//        this.Patronymic = Patronymic;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getPhone_number() {
//        return phone_number;
//    }
//
//    public void setPhone_number(String phone_number) {
//        this.phone_number = phone_number;
//    }
//
//    public int getMarks() {
//        return marks;
//    }
//
//    public void setMarks(int marks) {
//        this.marks = marks;
//    }
//}







//Problem5
//import java.util.ArrayList;
//
//public class Main {
// public static void main(String[] args) {
// Book book1 = new Book(1,"The Pride and Prejudice ","Jane Austen","London",1995,510,"80$","pdf");
// Book book2 = new Book(2,"Ushqan uia","Bauyrzhan Momushuly","Almaty",1997,380,"70$","pdf");
// Book book3 = new Book(3,"Abay Zholu","Muhtar Auezov","Semey",1965,730,"90$","pdf");
// Book book4 = new Book(4,"Ushqan uia ","Bauyrzhan Momushuly","Almaty",1997,380,"70$","pdf");
//
//
//
//   ArrayList<Book> bookArrayList = new ArrayList<>();
// bookArrayList.add(book1);
// bookArrayList.add(book2);
// bookArrayList.add(book3);
// bookArrayList.add(book4);
//
//
//
// String avtor_tabu = "Bauyrzhan Momushuly";
// ArrayList<Book> avtor = new ArrayList<>();
// for(Book d:bookArrayList){
// if(d.getAuthor()==avtor_tabu){
//     avtor.add(d);
//            }
//        }
//        System.out.println(avtor);
//
//
//
//        String baspasy = "Almaty";
// ArrayList<Book> baspa = new ArrayList<>();
// for(Book d:bookArrayList){
//            if(d.getAuthor()==baspasy){
//                baspa.add(d);
//            }
//        }
//        System.out.println(baspa);
//
//
//
//        int jil = 1997;
//        ArrayList<Book> jili = new ArrayList<>();
//        for(Book d:bookArrayList){
//            if(d.getDate()>1997){
//                jili.add(d);
//            }
//        }
//        System.out.println(jili);
//    }
//}
//class Book{
//    int id;
//    String name;
//    String author;
//    String publisher;
//    int date;
//    int pages;
//    String cost;
//    String type_of_binding;
//
//    public Book(int id, String name, String author, String publisher, int date, int pages, String cost, String type_of_binding) {
//        this.id = id;
//        this.name = name;
//        this.author = author;
//        this.publisher = publisher;
//        this.date = date;
//        this.pages = pages;
//        this.cost = cost;
//        this.type_of_binding = type_of_binding;
//    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", author='" + author + '\'' +
//                ", publisher='" + publisher + '\'' +
//                ", date=" + date +
//                ", pages=" + pages +
//                ", cost='" + cost + '\'' +
//                ", type_of_binding='" + type_of_binding + '\'' +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public String getPublisher() {
//        return publisher;
//    }
//
//    public void setPublisher(String publisher) {
//        this.publisher = publisher;
//    }
//
//    public int getDate() {
//        return date;
//    }
//
//    public void setDate(int date) {
//        this.date = date;
//    }
//
//    public int getPages() {
//        return pages;
//    }
//
//    public void setPages(int pages) {
//        this.pages = pages;
//    }
//
//    public String getCost() {
//        return cost;
//    }
//
//    public void setCost(String cost) {
//        this.cost = cost;
//    }
//
//    public String getType_of_binding() {
//        return type_of_binding;
//    }
//
//    public void setType_of_binding(String type_of_binding) {
//        this.type_of_binding = type_of_binding;
//    }
//}





//Problem6
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String [] args){
//        ArrayList<House> houseArrayList = new ArrayList<>();
//        House house1 = new House(1, 10, 50, 1, 1, "Tauelsizdik", "brick", 60);
//        House house2 = new House(2, 20, 56, 2,  2, "Tauelsizdik", "brick", 20);
//        House house3 = new House(3, 30, 70, 3,  3, "Tauelsizdik", "brick", 30);
//        House house4 = new House(4, 40, 76, 4,  4, "Tauelsizdik", "brick", 40);
//        House house5 = new House(5, 50, 120, 5, 5, "Tauelsizdik", "brick", 50);
//
//        houseArrayList.add(house1);
//        houseArrayList.add(house2);
//        houseArrayList.add(house3);
//        houseArrayList.add(house4);
//        houseArrayList.add(house5);
//             for (House s : houseArrayList){
//            if (s.getNumber_of_rooms() == 2){
//                System.out.println(s.apartment_number + ": " + s.getNumber_of_rooms() + ":room");
//            }
//        }
//
//        for (House s : houseArrayList){
//            if (s.getNumber_of_rooms() == 4){
//                if (s.getFloor() > 1 && s.getFloor() < 5){
//                    System.out.println(s);
//                }
//            }
//        }
//
//        for (House s : houseArrayList){
//            if (s.area > 50){
//                System.out.println(s.apartment_number + " area: " + s.area);
//            }
//        }
//    }
//}
//
//class House{
//    int id;
//    int apartment_number;
//    int area;
//    int floor;
//    int number_of_rooms;
//    String street;
//    String building_type;
//    int lifetime;
//
//    public House (int id, int apartment_number, int area, int floor, int number_of_rooms, String street, String building_type, int lifetime){
//        this.id = id;
//        this.apartment_number = apartment_number;
//        this.area = area;
//        this.floor = floor;
//        this.number_of_rooms = number_of_rooms;
//        this.street = street;
//        this.building_type = building_type;
//        this.lifetime = lifetime;
//    }
//
//    @Override
//    public String toString() {
//        return "House{" +
//                "id=" + id +
//                ", apartment_number=" + apartment_number +
//                ", area=" + area +
//                ", floor=" + floor +
//                ", number_of_rooms=" + number_of_rooms +
//                ", street='" + street + '\'' +
//                ", building_type='" + building_type + '\'' +
//                ", lifetime=" + lifetime +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getApartment_number() {
//        return apartment_number;
//    }
//
//    public void setApartment_number(int apartment_number) {
//        this.apartment_number = apartment_number;
//    }
//
//    public int getArea() {
//        return area;
//    }
//
//    public void setArea(int area) {
//        this.area = area;
//    }
//
//    public int getFloor() {
//        return floor;
//    }
//
//    public void setFloor(int floor) {
//        this.floor = floor;
//    }
//
//    public int getNumber_of_rooms() {
//        return number_of_rooms;
//    }
//
//    public void setNumber_of_rooms(int number_of_rooms) {
//        this.number_of_rooms = number_of_rooms;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public String getBuilding_type() {
//        return building_type;
//    }
//
//    public void setBuilding_type(String building_type) {
//        this.building_type = building_type;
//    }
//
//    public int getLifetime() {
//        return lifetime;
//    }
//
//    public void setLifetime(int lifetime) {
//        this.lifetime = lifetime;
//    }
//}





//Problem8
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String [] args){
//        ArrayList<Car> carArrayList = new ArrayList<>();
//        Car car1 = new Car(1, "Mercedes", "300", 2000, "blue", 4000000, "555");
//        Car car2 = new Car(2, "BMW", "5", 2014, "black", 1050000, "111");
//        Car car3 = new Car(3, "Toyota", "70", 2019, "red", 5000000, "777");
//        Car car4 = new Car(4, "Audi", "80", 1999, "white", 2000000, "124");
//        Car car5 = new Car(5, "Mazda", "70", 1998, "brown", 2000000, "131");
//
//        carArrayList.add(car1);
//        carArrayList.add(car2);
//        carArrayList.add(car3);
//        carArrayList.add(car4);
//        carArrayList.add(car5);
//
//        for (Car s : carArrayList){
//            if (s.brand.equals("Mazda")){
//                System.out.println(s);
//            }
//        }
//
//        for (Car s : carArrayList){
//            if (s.brand.equals("Toyoto") && s.yearofissue < 2022){
//                System.out.println(s);
//            }
//        }
//
//        for (Car s : carArrayList){
//            if (s.yearofissue == 2000 && s.price > 5000000){
//                System.out.println(s);
//            }
//        }
//    }
//}
//
//class Car{
//    int id;
//    String brand;
//    String model;
//    int yearofissue;
//    String color;
//    int price;
//    String registrationNum;
//
//    public Car(int id, String brand, String model, int yearofissue, String color, int price, String registrationNum){
//        this.id = id;
//        this.brand = brand;
//        this.model = model;
//        this.yearofissue = yearofissue;
//        this.color = color;
//        this.price = price;
//        this.registrationNum = registrationNum;
//    }
//
//    @Override
//    public String toString() {
//        return "Car{" +
//                "id=" + id +
//                ", brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", yearofissue=" + yearofissue +
//                ", color='" + color + '\'' +
//                ", price=" + price +
//                ", registrationNum='" + registrationNum + '\'' +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getbrand() {
//        return brand;
//    }
//
//    public void setbrand(String stamp) {
//        this.brand = stamp;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public int getYearofissue() {
//        return yearofissue;
//    }
//
//    public void setYearofissue(int yearofissue) {
//        this.yearofissue = yearofissue;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public String getRegistrationNum() {
//        return registrationNum;
//    }
//
//    public void setRegistrationNum(String registrationNum) {
//        this.registrationNum = registrationNum;
//    }
//}





//Problem9
//import java.util.ArrayList;
//import java.util.concurrent.atomic.AtomicReferenceArray;
//
//public class Main{
// public static void main(String[] args) {
// Product product1 = new Product(1,"BMW","654321 ","UK",6000000,41,21);
// Product product2= new Product(2,"Mercedes","112233","Germany",5000000,18,39);
// Product product3 = new Product(3,"Toyota","142536 ","UK",2550000,11,40);
// Product product4 = new Product(4,"Audi","789456 ","Hungary",2000000,47,83);
//
// ArrayList<Product> productArrayList = new ArrayList<>();
// productArrayList.add(product1);
// productArrayList.add(product2);
// productArrayList.add(product3);
// productArrayList.add(product4);
//
//
//
//
// String name_tabu = "BMW";
// ArrayList<Product> names = new ArrayList<>();
// for(Product s:productArrayList){
// if(s.getName()==name_tabu){
// names.add(s);
//            }
//        }
// System.out.println(names);
//
//
// String names_tabu = "Mercedes";
// int baga_kerek = 6000000;
// ArrayList<Product> name = new ArrayList<>();
// for(Product s:productArrayList){
// if(s.getName()==name_tabu && s.getPrice()<2500){
// names.add(s);
//            }
//        }
// System.out.println(names);
//
//
// int time = 2;
// ArrayList<Product> id = new ArrayList<>();
// for(Product s:productArrayList){
// if(s.shelflife>time){
// names.add(s);
//            }
//        }
// System.out.println(names);
//    }
//}
//
//class Product{
//    int id;
//    String name;
//    String UPC;
//    String manufacturer;
//    int price;
//    int shelflife;
//    int quantity;
//
//    public Product(int id, String name, String UPC, String manufacturer, int price, int shelflife, int quantity) {
//        this.id = id;
//        this.name = name;
//        this.UPC = UPC;
//        this.manufacturer = manufacturer;
//        this.price = price;
//        this.shelflife = shelflife;
//        this.quantity = quantity;
//    }
//
//    @Override
//    public String toString() {
//        return "Product{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", UPC='" + UPC + '\'' +
//                ", manufacturer='" + manufacturer + '\'' +
//                ", price=" + price +
//                ", shelflife=" + shelflife +
//                ", quantity =" + quantity  +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getUPC() {
//        return UPC;
//    }
//
//    public void setUPC(String UPC) {
//        this.UPC = UPC;
//    }
//
//    public String getManufacturer() {
//        return manufacturer;
//    }
//
//    public void setManufacturer(String manufacturer) {
//        this.manufacturer = manufacturer;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public int getShelflife() {
//        return shelflife;
//    }
//
//    public void setShelflife(int shelflife) {
//        this.shelflife = shelflife;
//    }
//
//    public int getQuantity () {
//        return quantity ;
//    }
//
//    public void setQuantity (int quantity ) {
//        this.quantity  = quantity ;
//    }
//}





//Problem10
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String [] args){
//        ArrayList<Train> trainsArrayList = new ArrayList<>();
//        Train train1 = new Train("Turkistan", 266, "17:06", 31);
//        Train train2 = new Train("Kyzylorda", 40, "09:35", 32);
//        Train train3 = new Train("Astana", 35, "15:30", 23);
//        Train train4 = new Train("Kokshetau", 26, "05:10", 40);
//        Train train5 = new Train("Pavlodar", 077, "06:30", 35);
//
//        trainsArrayList.add(train1);
//        trainsArrayList.add(train2);
//        trainsArrayList.add(train3);
//        trainsArrayList.add(train4);
//        trainsArrayList.add(train5);
//
//
//        for (Train s : trainsArrayList){
//            if (s.destination.equals("Astana")){
//                System.out.println(s);
//            }
//        }
//        for (Train s : trainsArrayList){
//            if (s.destination.equals("Astana")){
//                if (s.departure_time.equals("15:30")){
//                    System.out.println(s);
//                }
//            }
//        }
//
//        for (Train s : trainsArrayList){
//            if (s.destination.equals("Astana")){
//                if (s.seats == 40){
//                    System.out.println(s);
//                }
//            }
//        }
//    }
//}
//
//class Train{
//    String destination;
//    int train_number;
//    String departure_time;
//    int seats;
//
//    public Train(String destination, int train_number, String departure_time, int seats){
//        this.destination = destination;
//        this.train_number = train_number;
//        this.departure_time = departure_time;
//        this.seats = seats;
//    }
//
//    @Override
//    public String toString() {
//        return "Train{" +
//                "destination='" + destination + '\'' +
//                ", train_number=" + train_number +
//                ", departure_time='" + departure_time + '\'' +
//                ", quantityOfPlaces=" + seats +
//                '}';
//    }
//
//    public String getDestination() {
//        return destination;
//    }
//
//    public void setDestination(String destination) {
//        this.destination = destination;
//    }
//
//    public int getTrain_number() {
//        return train_number;
//    }
//
//    public void setTrain_number(int train_number) {
//        this.train_number = train_number;
//    }
//
//    public String getDeparture_time() {
//        return departure_time;
//    }
//
//    public void setDeparture_time(String departure_time) {
//        this.departure_time = departure_time;
//    }
//
//    public int getseats() {
//        return seats;
//    }
//
//    public void setseats(int seats) {
//        this.seats = seats;
//    }
//}

















