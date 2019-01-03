package com.ml.io;

import com.ml.io.utils.file.FileUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IoApplication {

    public static void main(String[] args) {
        SpringApplication.run(IoApplication.class, args);
        FileUtil.writeFile("text.txt","你好呀");
    }

}

