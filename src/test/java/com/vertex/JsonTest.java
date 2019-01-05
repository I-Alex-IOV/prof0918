package com.vertex;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class JsonTest {

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private List<User> users = new ArrayList<>();

    @Before
    public void setUp() {
        try (FileReader jsonReader = new FileReader(getResource("json/example.json").getFile())) {
            UsersHolder usersHolder = gson.fromJson(jsonReader, UsersHolder.class);
            users = usersHolder.users;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static URL getResource(String relativePath) {
        return JsonTest.class.getClassLoader().getResource(relativePath);
    }

    @Test
    public void gettingUsersFromJsonTest() throws IOException {
        System.out.println(users);

        User user = User.builder()
                .age(20)
                .email("sdgjnwojrn@skdjvn.com")
                .name("Neon")
                .surname("Aon")
                .build();

        System.out.println(gson.toJson(user));

        users.add(user);

        String jsonUsers = gson.toJson(new UsersHolder(users));
        System.out.println(jsonUsers);
        Files.write(new File(getResource("json/example.json").getFile()).toPath(), jsonUsers.getBytes());
    }

    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    private static class User {
        private String name;
        private int age;
        private String surname;
        private String email;
    }

    @XmlRootElement(name = "users")
    @XmlAccessorType(XmlAccessType.FIELD)
    static class UsersHolder {
        @XmlElement(name = "user")
        List<User> users;

        UsersHolder(List<User> users) {
            this.users = users;
        }

        public UsersHolder() {
        }

        public List<User> getUsers() {
            return users;
        }

        public void setUsers(List<User> users) {
            this.users = users;
        }

        @Override
        public String toString() {
            return "UsersHolder{users=" + users + "}";
        }
    }
}

