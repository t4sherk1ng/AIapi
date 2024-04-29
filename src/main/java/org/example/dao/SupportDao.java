package org.example.dao;

import org.example.domain.Support;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupportDao extends JpaRepository<Support, Integer> {

    Support findByName(String name);

}
