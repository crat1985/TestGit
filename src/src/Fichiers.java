package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fichiers {

	public static void Fichiers() {
//		File folder = new File("/home/riccardo/slt");
//		if(!folder.exists()) {
//			folder.mkdir();
//			System.out.println("Dossier \"slt\" créé avec succès !");
//		} else {
//			System.out.println("Dossier \"slt\" déjà existant !");
//		}
//		File file = new File("/home/riccardo/slt/slt.txt");
//		if(!file.exists()) {
//			try {
//				file.createNewFile();
//				System.out.println("Fichier \"slt.txt\" créé avec succès !");
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} else {
//			System.out.println("Fichier \"slt.txt\" déjà existant !");
//			FileWriter writer;
//			try {
//				writer = new FileWriter(file);
//				BufferedWriter bw = new BufferedWriter(writer);
//				bw.write("slt tlm !");
//				bw.newLine();
//				bw.write("how do you feel ?");
//				bw.newLine();
//				bw.write("test");
//				bw.newLine();
//				bw.close();
//				writer.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		File file2 = new File("/home/riccardo/slt/slt.html");
		if(!file2.exists()) {
			try {
				file2.createNewFile();
				System.out.println("Fichier \"slt.html\" créé avec succès !");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			List<String> htmlLines = Arrays.asList("<!DOCTYPE html>","<html>", "<head>", "<title>Un titre random</title>", "</head>","<body>","<p>slt tlm</p>","</body>","</html>");
			System.out.println("Fichier \"slt.html\" déjà existant !");
			FileWriter writer;
			try {
				writer = new FileWriter(file2);
				BufferedWriter bw = new BufferedWriter(writer);
				for(String line : htmlLines) {
					bw.write(line);
					bw.newLine();
					System.out.println(line);
				}
				bw.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("----------------------------");
		File file3 = new File("/home/riccardo/Téléchargements/test.java");
		if(!file3.exists()) {
			try {
				file3.createNewFile();
				System.out.println("Fichier \"test.java\" créé avec succès !");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file3), "UTF-8"));
				String line = reader.readLine();
				while(line != null) {
					System.out.println(line);
					line = reader.readLine();
				}
				
				reader.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
			// couper-coller
			File source = new File("/home/riccardo/Téléchargements/test.java");
			File dest = new File("/home/riccardo/slt/"+source.getName());
			try {
				Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				e.printStackTrace();
			}
			source.delete();
		}
	}
	
}
