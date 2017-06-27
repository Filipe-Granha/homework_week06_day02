import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;



public class PhotographerTest{

  Photographer photographer;
  DigitalCamera digitalCamera;
  AnalogCamera analogCamera;



 @Before
public void setup() {
  photographer = new Photographer("John");
  digitalCamera = new DigitalCamera();
  analogCamera = new AnalogCamera();

}

  @Test
  public void hasName() {
    assertEquals("John", photographer.getName());
  }

  @Test
  public void backpackStartsEmpty() {
    assertEquals(0, photographer.cameraCount());
  }


  @Test
  public void canAddDigitalCamera() {
    photographer.addCamera(digitalCamera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void canAddAnalogCamera() {
    photographer.addCamera(analogCamera);
    assertEquals(1, photographer.cameraCount());
  }


  @Test
  public void canRemoveDigitalCamera() {
    photographer.addCamera(digitalCamera);
    Printable camera = photographer.removeCamera();
    assertEquals("Nikon 34T, Noise reduction filter, Hi-resolution 2", camera.printDetails());
  }





}