package br.ucb.calango.test;

import br.ucb.calango.api.publica.CalangoAPI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class Test {
   public static void main(String[] args) throws IOException {
      CalangoAPI.interpretar(new File("./src/main/java/br/ucb/calango/test/testecopia.clg"));
   }
}
