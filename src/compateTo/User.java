package compateTo;

public class User implements Comparable<User>{
    private String name;
    private Integer age;
    private String email;

    public int getAge() {
        return age;
    }

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(User user) {
        int res = this.name.compareTo(user.getName());

        if (res == 0){
            res = this.age.compareTo(user.getAge());
        }

        return res;

    }
}
