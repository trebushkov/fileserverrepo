package com.example.fileserver.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
public class StorageFileDto {
    Integer id;
    String fileName;
    String localPath;
}
