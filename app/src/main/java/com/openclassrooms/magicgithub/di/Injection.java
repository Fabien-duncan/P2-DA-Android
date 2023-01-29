package com.openclassrooms.magicgithub.di;

import com.openclassrooms.magicgithub.api.FakeApiService;
import com.openclassrooms.magicgithub.repository.UserRepository;

public class Injection {

    public static UserRepository createUserRepository() {
        return new UserRepository(new FakeApiService());//creates a new repository using a FakeApiService. This could be replaced by another api Service later on.
    }
}
