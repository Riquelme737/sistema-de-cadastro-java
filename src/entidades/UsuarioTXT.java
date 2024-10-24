package entidades;

import java.io.*;

public class UsuarioTXT {

    static String formularioTXT = "." + File.separator + "src" + File.separator + "util" + File.separator + "formulario.txt";


    public static void lerFormulario() {
        try (FileReader leitor = new FileReader(formularioTXT)) {
            BufferedReader reader = new BufferedReader(leitor);

            String linhas;
            while ( (linhas = reader.readLine()) != null) {
                System.out.println(linhas);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o formulário: " + e.getMessage());
        }
    }
}
