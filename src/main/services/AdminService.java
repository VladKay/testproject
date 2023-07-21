package main.services;

import main.Application;
import main.data.dtos.ContentDTO;
import main.data.entities.ContentEntity;
import main.data.repos.ContentRepository;
import main.utility.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService{
    @Autowired
    ContentRepository contentRepository;

    public void mapAndSaveContent(/*ContentDTO contentDTO*/) throws Exception {
        ContentEntity contentEntity = new ContentEntity();
        FileInputStream image = new FileInputStream(Application.getAppPropsPath().getProperty("test.image.path"));
        contentEntity.setDescription("test");
        contentEntity.setImage(ImageUtil.compressImage(ImageUtil.getImageBytes(image)));
        contentRepository.save(contentEntity);
    }

    public ContentEntity getContent(){
      ContentEntity entity =  contentRepository.findAll().get(0);
      byte[] image = ImageUtil.decompressImage(entity.getImage());
      entity.setImage(image);
      return entity;
    }
}
