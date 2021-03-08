package br.ucb.calango.test;

import br.ucb.calango.api.publica.CalangoAPI;

import java.io.File;
import java.io.IOException;

public class Test {
   public static void main(String[] args) throws IOException {
      CalangoAPI.interpretar(new File("/home/geovana/Downloads/tema2.clg"));
   }
}
