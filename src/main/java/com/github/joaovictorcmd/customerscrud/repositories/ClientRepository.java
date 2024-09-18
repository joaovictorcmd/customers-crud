package com.github.joaovictorcmd.customerscrud.repositories;

import com.github.joaovictorcmd.customerscrud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author joaovictorcmd
 * @date 2024 Sep 18
 */
public interface ClientRepository extends JpaRepository<Client, Long> {
}
