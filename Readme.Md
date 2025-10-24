#  File Handling in Java

## 🔹 Introduction
- File Handling in Java allows you to **store data permanently** in a file instead of losing it when the program ends.  
- Java provides several classes in the **`java.io`** package to perform file operations such as **create, read, write, append, and delete**.

---

## 🔹 Important Classes in `java.io` Package

| Class | Description |
|--------|-------------|
| `File` | Used to create, delete, and get information about files and directories. |
| `FileWriter` | Used to write characters to a file. |
| `FileReader` | Used to read characters from a file. |
| `BufferedReader` | Reads text efficiently from character input streams. |
| `BufferedWriter` | Writes text efficiently to character output streams. |
| `PrintWriter` | Allows writing formatted text to files. |

---

## 🔹 1. Creating a File

```java
import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("myFile.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

## 🔹 2. Writing to a File
```java
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("myFile.txt");
            writer.write("Hello, this is a Java file handling example!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

## 🔹 3. Reading from a File
```java
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("myFile.txt");
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

## 🔹 4. Reading Using BufferedReader (Line by Line)
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReadExample {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("myFile.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

## 🔹 5. Appending Data to a File
```java
import java.io.FileWriter;
import java.io.IOException;

public class AppendFileExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("myFile.txt", true); // 'true' enables append mode
            writer.write("\nThis text is appended.");
            writer.close();
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
## 🔹 6. Deleting a File
```java
import java.io.File;

public class DeleteFileExample {
    public static void main(String[] args) {
        File file = new File("myFile.txt");
        if (file.delete()) {
            System.out.println("File deleted successfully: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
```

## 🔹 7. File Information
```java
import java.io.File;

public class FileInfoExample {
    public static void main(String[] args) {
        File file = new File("myFile.txt");
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File size in bytes: " + file.length());
        } else {
            System.out.println("File does not exist.");
        }
    }
}
```

## 🔹 8. Common Exceptions
| Exception               | Reason                                    |
| ----------------------- | ----------------------------------------- |
| `IOException`           | General input/output error.               |
| `FileNotFoundException` | File not found at the specified location. |
| `SecurityException`     | File access denied by security manager.   |

## 🔹 Best Practices

- Always close file streams after use (close()).
- ✅ Use try-with-resources to automatically close streams.
- ✅ Use relative paths or project directories for portability.
-✅ Handle exceptions properly with try-catch.

## Conclusion

- File Handling in Java is an essential concept for applications that require persistent data storage.
- Understanding how to create, write, read, and delete files will help you handle data efficiently in real-world projects.