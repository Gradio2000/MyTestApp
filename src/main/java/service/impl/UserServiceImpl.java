package service.impl;

import model.User;
import org.springframework.stereotype.Service;

import repository.UserRepository;
import service.UserService;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }
}
