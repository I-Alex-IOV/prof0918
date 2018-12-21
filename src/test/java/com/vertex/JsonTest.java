package com.vertex;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Builder;
import org.junit.Before;
import org.junit.Test;

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

    static URL getResource(String relativePath) {
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
    static class User {
        //        @XmlElement
        private String name;
        //        @XmlElement
        private int age;
        //        @XmlElement
        private String surname;
        //        @XmlElement
        private String email;
    }

    static class UsersHolder {
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

