package com.vertex;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vertex.model.User;
import com.vertex.model.UsersHolder;
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
            users = usersHolder.getUsers();
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

}

