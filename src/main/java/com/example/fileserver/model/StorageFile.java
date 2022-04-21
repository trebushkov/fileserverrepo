package com.example.fileserver.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Builder
@NoArgsConstructor
public class StorageFile {
    @Id
    Integer id;
    String fileName;
    String localPath;
}
