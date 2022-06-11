class Start{
    public static void main(String[] data){
        Cryptocurrency c = new Cryptocurrency("BTC",30000.0);
        System.out.println(c);
        Player p = new Player("David Beckham",7,40000.0);
        System.out.print(p);
        Student s = new Student();
        s.name = "Hermione Grenger";
        s.gender = Gender.FEMALE;
        System.out.println(s.gender);
        System.out.println(s.gender instanceof Gender);
        System.out.println(s.gender instanceof Enum);
        System.out.println(s.gender instanceof Object);
    }
}
record Cryptocurrency(String symbol,double value){}
record Player(String name,int number,double salary){}

class Student{
    String name;
    Gender gender;
}
enum Gender{ MALE , FEMALE};

class Product{
    String name;
    double price;
    double getSpecialPrice(){
        return price * 0.95;
    }
}

class Coffee extends Product{
    String size;
}

class Book extends Product{
    int pages;
    
    @Override
    double getSpecialPrice(){
        return price * 0.90;
    }
}
