 import java.util.ArrayList;
 import java.util.HashMap;



 public class Photographer {

   private String name;
   private ArrayList<Printable> backpack; 
   private String digitalCamera;
   private String analogCamera;
   private HashMap<String, Integer> pictures;

   public static void main(String[] args) {
     
  
   HashMap<String, Integer> pictures = new HashMap<String, Integer>();

   pictures.put("Monday", 10);
   pictures.put("Tuesday", 10);
   pictures.put("Friday", 20);
   pictures.put("Saturday", 30);

   



   
}
   public Photographer(String name) {
    this.name = name;
    this.backpack = new ArrayList<Printable>();
    this.digitalCamera = digitalCamera;
    this.analogCamera = analogCamera;

   }

   public int totalPictures() {
    return pictures.values;
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