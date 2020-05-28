package ru.itis.fileUploader.services;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class FileServiceImpl implements FileService {
    @Autowired
    private Environment environment;

    @Autowired
    private BCryptPasswordEncoder bCrypt;

    public String uploadFile(String email, MultipartFile file) throws IOException {
        String extension = file.getOriginalFilename()
                .substring(file.getOriginalFilename().lastIndexOf("."), file.getOriginalFilename().length());
        String name = bCrypt.encode(file.getOriginalFilename()).replaceAll("/\\W/", "");
        File newFile = new File(environment.getProperty("storage.path") + name + extension);
        IOUtils.copyLarge(file.getInputStream(), new FileOutputStream(newFile));
        return newFile.getName();
    }

    public File loadFile(String fileName) throws FileNotFoundException {
        File file = new File(String.valueOf(environment.getProperty("storage.path") + fileName));
        if (file.exists()) {
            return file;
        }
        return null;
    }
}
