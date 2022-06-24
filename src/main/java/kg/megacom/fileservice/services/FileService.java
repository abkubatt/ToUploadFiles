package kg.megacom.fileservice.services;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;

public interface FileService {

    String storeFile(MultipartFile file);

    String storeFileWithPath(MultipartFile file, String path);

    Resource getFileByName(String fileName);

    Resource getFile(String path);
}
