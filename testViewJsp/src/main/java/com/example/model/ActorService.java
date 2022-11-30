package com.example.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public interface ActorService extends JpaRepository<Actor, Integer>{

}
