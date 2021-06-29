package main.repository;

import main.model.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestModelRepository
        extends JpaRepository<TestModel, Long> {
}
