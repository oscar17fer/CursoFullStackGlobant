package mascotapp;

import mascotapp.enumeraciones.Raza;




public class Mascotapp {

    public static void main(String[] args) {
        
        for (Raza var : Raza.values()) {
            System.out.println(var);
        }

    }

}
/* 
        String [] nombresArray = new String[5];
        
        
        // ARRAYS
        for (int i = 0; i < nombresArray.length; i++) {
            nombresArray[i] = "Chiquito" + (i+1);
        }
        
        for (String var : nombresArray) {
            System.out.println(var);
        }
        
        //COLECTIONS
        ArrayList<String> nombresArrayList = new ArrayList<>();
        
        nombresArrayList.add("chiquito");
        nombresArrayList.add("chiquito");
        nombresArrayList.add("chiquito");
        
        System.out.println(nombresArrayList.size());
        
        nombresArrayList.remove("chiquito");
        System.out.println(nombresArrayList.size());*/