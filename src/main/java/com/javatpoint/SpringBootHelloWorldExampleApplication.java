package com.javatpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorldExampleApplication
{
public static void main(String[] args) 
{
SpringApplication.run(SpringBootHelloWorldExampleApplication.class, args);
}
}

public static void WriteToDirectory(ZipArchiveEntry entry, string destDirectory)
    {
      string destFileName= Path.combine(destDirectory, entry.Fullname);
      entry.ExtractToFile(destFilename);
    }
}
