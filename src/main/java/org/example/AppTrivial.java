package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class AppTrivial {
    public static void main(String[] args) {
        Pregunta pregunta = new Pregunta().setTipoPregunta(
                TipoPregunta.BOOLEAN).setDificultad(Dificultad.HARD)
                .setPregunta("Pregunta")
                .setCategoria(new Categoria("Categorize")).setCorrecta("Correcta")
                .setIncorrecta(List.of("Incorrecta"));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

//        System.out.println(gson.toJson(pregunta));

        File file = new File("./text.txt");

        try(var bw = Files.newBufferedWriter(Paths.get("preguntaa.json"))){
            gson.toJson(pregunta, bw);
        }catch (IOException e){
            System.out.println("AAA");
        }
        try(var br = Files.newBufferedReader(Paths.get("preguntaa.json"))){
            String line;
            while ((line = br.readLine()) != null){

                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        try(var bw = Files.newBufferedWriter(Paths.get("pregunta.json"))){
//            bw.write(gson.toJson(pregunta));
//        }catch (IOException e){
//            System.out.println("AAA");
//        }
//
//        Files.writeString(Paths.get("a.txt"), gson.toJson(pregunta));
    }
}
