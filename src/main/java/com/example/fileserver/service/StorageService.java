package com.example.fileserver.service;

import com.example.fileserver.dto.StorageFileDto;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageService {

    void init();

    String store(MultipartFile file, Integer id);

    Stream<Path> loadAll();

    Path load(String filename);

    Resource loadAsResource(Integer filename);

    void deleteAll();

    StorageFileDto storeLocaly(MultipartFile file);
}
