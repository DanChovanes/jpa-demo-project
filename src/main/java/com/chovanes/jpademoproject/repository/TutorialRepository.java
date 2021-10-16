package com.chovanes.jpademoproject.repository;

import com.chovanes.jpademoproject.dto.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);

    List<Tutorial> findByTitle(String title);
}
