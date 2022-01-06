package com.demo.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesDemo {

	public static void main(String[] args) {

		try(Stream<Path> files = Files.list(Paths.get("."));) {			//. - current directory
			files.forEach(System.out::println);
			
			Files.list(Paths.get("G:\\Nakul")).filter(Files::isRegularFile).forEach(System.out::println);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
