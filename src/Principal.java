import java.io.File;
import java.util.List;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){

        ejercicio1();
        ejercicio2();
        ejercicio3();

    }

    public static void ejercicio1(){

        File directory = new File("src/resources");

        List<String> lista = new ArrayList<>();
        lista = List.of(directory.list());
        if(!lista.isEmpty()) {
            for (String file : lista) {
                System.out.println(file);
            }
        }else{
            System.out.println("No hay archivos en el directorio");
        }
    }

    public static void ejercicio2(){

        File subDirectorio = new File("src/resources/subDirectorio");

        boolean create = false;
        if(!subDirectorio.exists()){
            create = subDirectorio.mkdir();
        }

        System.out.println("\nSubdirectorio creado -> " + create);
        System.out.println("Archivos: ");
        ejercicio1();
    }

    public static void ejercicio3(){

        File file = new File("src/");

        System.out.println("\nTODOS LOS ARCHIVOS:");
        printFiles(file);
    }
    private static void printFiles(File file){

        File[] arr = file.listFiles();
        if(arr != null) {
            for (File fi : arr) {
                System.out.println(fi);
                printFiles(fi);
            }
        }
    }
}
