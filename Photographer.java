 import java.util.ArrayList;


 public class Photographer implements Printable{

   private String name;
   private ArrayList<Printable> backpack; 
   


   public Photographer(String name) {
    this.name = name;
    this.backpack = new ArrayList<Printable>(); 
   }



   public String printDetails() {
     return "Teste";
   }





   public String getName() {
    return this.name;
   }


   public int cameraCount() {
    return this.backpack.size(); 
   }


   public void addCamera(Printable camera) {
     this.backpack.add(camera);
   }

   public Printable removeCamera() {
     if(cameraCount() > 0) {
      return backpack.remove(0);
     }
     return null;
   }


   public void getsHome() {
    this.backpack.clear();
  }


 }