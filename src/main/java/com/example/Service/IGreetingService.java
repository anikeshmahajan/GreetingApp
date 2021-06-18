package com.example.Service;

import com.example.model.Greeting;
import com.example.model.User;

public interface IGreetingService {

 Greeting getGreetingById(Long id);
Greeting addGreeting(User user);
}
