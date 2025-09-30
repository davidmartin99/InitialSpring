package org.example.InitialSpring.service;

import org.example.InitialSpring.model.User;
import org.example.InitialSpring.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> getAllActive() {
        return repo.findByActiveTrue();
    }

    public User create(User u) {
        return repo.save(u);
    }

    public Optional<User> getById(Long id) {
        return repo.findById(id);
    }

    public User update(Long id, User newData) {
        return repo.findById(id).map(u -> {
            u.setName(newData.getName());
            u.setEmail(newData.getEmail());
            return repo.save(u);
        }).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    public void logicalDelete(Long id) {
        repo.findById(id).ifPresent(u -> {
            u.setActive(false);
            repo.save(u);
        });
    }
}

