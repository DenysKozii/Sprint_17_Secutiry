package com.softserve.marathon.repository;

import com.softserve.marathon.model.Sprint;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SprintRepository extends JpaRepository<Sprint, Long> {
    List<Sprint> getSprintsByMarathonId(Long id);
}