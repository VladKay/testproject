package main.services;

import main.data.dtos.ContentDTO;
import main.data.entities.ContentEntity;
import main.data.repos.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService{
    @Autowired
    ContentRepository contentRepository;

    public void mapAndSaveContent(ContentDTO contentDTO) throws Exception {
        ContentEntity contentEntity= new ContentEntity();
        contentRepository.save(contentEntity);
        throw new Exception("method failed");
    }
}
