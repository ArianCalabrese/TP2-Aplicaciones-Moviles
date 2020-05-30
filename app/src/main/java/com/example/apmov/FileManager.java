package com.example.apmov;

import android.content.Context;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class FileManager {
    String path;
    public LinkedList<Auto> retornarAutos(InputStream file, Context cont){
        LinkedList<Auto> autos = new LinkedList<>();

            Scanner scan = new Scanner(file);
            String[] valoresAuto;
            while (scan.hasNext()) {
                Auto auto = new Auto();
                valoresAuto = scan.nextLine().split(",");
                auto.setMarca(valoresAuto[0]);
                auto.setModelo(valoresAuto[1]);
                auto.setAnio(valoresAuto[2]);
                auto.setCaballos(valoresAuto[3]);
                auto.setImagen(this.retornarImagen(valoresAuto[4], cont));
                autos.add(auto);
            }
            scan.close();
        return autos;
    }

    public int retornarImagen(String nombreArchivo, Context ct){
        int valorImagen=0;
        valorImagen = ct.getResources().getIdentifier(nombreArchivo,"drawable",ct.getPackageName());
        return valorImagen;
    }
}
