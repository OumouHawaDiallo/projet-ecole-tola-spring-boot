package sn.esp.tola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.esp.tola.entities.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {

}
