package ru.itis.fileUploader.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileService {
    String uploadFile(String email, MultipartFile file) throws IOException;

    File loadFile(String fileName) throws FileNotFoundException;
}
