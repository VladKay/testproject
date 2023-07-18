package main.data.repos;

import main.data.entities.ContentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface ContentRepository extends JpaRepository<ContentEntity, Serializable> {


}
