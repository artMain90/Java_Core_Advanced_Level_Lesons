package Second;

public class User {
    private final String TYPE = "Human1";

    private int id;
    private String name;
    private String position;
    private int age;

    {
        System.out.println("Как поместить вывод сообщения в теле класса");
    }

    protected User(){

    }

    public User(int id,String name,String position,int age){
        this.age = age;
        this.id = id;
        this.name = name;
        this.position = position;
        setAge(age);
    }



    private User(String name,int age){
        this.age = age;
        this.name = name;
    }

    public static User create(String name,int age){
        return new User(name,age);
    }

   public void setAge(int age){
        if (age<0){
            throw new IllegalArgumentException("Age can not be negative number");
        }
        this.age = age;
   }

   public int getAge(){
        return age;
   }

    public void info(){
        System.out.println("id: " + id + ",name: " + name + ",position: " + position + ",age: " + age);
    }

    public static void type(){
        System.out.println("Human");
    }

    public static void main(String[] args) {
            User user = new User(1,"Толя","Разнорабочий",55);
            user.info();
            User user2 = user;
            user2.info();
            User user1 = new User("Антон",23);
        System.out.println("Age = " + user1.getAge());
        System.out.println();



    }
}
