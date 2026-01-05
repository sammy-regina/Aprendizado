package collection.src;

import java.util.Objects;

public class User {

    private int code;
    private String name;

    public User(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public User() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        var isEqual = false;
        if (obj instanceof User user){
            if (this == user) return true;
            if(this.code == user.code && Objects.equals(this.name, user.name)) return true;
        }
        return isEqual;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }

    @Override
    public String toString() {
        return "User{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
