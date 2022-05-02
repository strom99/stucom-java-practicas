package grafic.modelo;


public class Usuarios {
    private String name;
    private String password;
    private int age;

    public Usuarios(String name){
        this.name = name;
    }

    public Usuarios(String name , String password , int age){
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        final Usuarios other = (Usuarios) o;
        return name.equalsIgnoreCase(other.name);
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
