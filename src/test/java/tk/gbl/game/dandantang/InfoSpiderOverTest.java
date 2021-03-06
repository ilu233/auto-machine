package tk.gbl.game.dandantang;

import org.junit.Test;
import tk.gbl.util.image.ArrayToImage;
import tk.gbl.util.image.Binary;
import tk.gbl.util.image.ImageFile;
import tk.gbl.util.image.Output;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Date: 2015/8/9
 * Time: 17:23
 *
 * @author Tian.Dong
 */
public class InfoSpiderOverTest {
  @Test
  public void test() throws IOException {
    File allFile = new File("F:\\workProject\\gaboolic\\auto-machine\\image\\over\\over.png");
    BufferedImage allImage = ImageFile.fileToImage(allFile);
    BufferedImage overImage = allImage.getSubimage(933, 108, 151, 38);
   // ImageFile.imageToFile(overImage,new File("F:\\workProject\\gaboolic\\auto-machine\\image\\over\\over__.png"));

    int[][] overArray = Binary.deal(overImage);
    Output.outputS(overArray);
    ArrayToImage.createImage(overArray,new File("F:\\workProject\\gaboolic\\auto-machine\\image\\over\\over_array.png"));
  }

  @Test
  public void test123() throws IOException {
    File file = new File("F:\\workProject\\gaboolic\\auto-machine\\image\\over\\1439124055481.png");
    BufferedImage overInfo = ImageFile.fileToImage(file);

    int[][] overImage = Binary.deal(overInfo);
    Output.outputS(overImage);

    ArrayToImage.createImage(overImage,new File("F:\\workProject\\gaboolic\\auto-machine\\image\\over\\over_array_real_2.png"));

//    int distance = Distance.hamDistance(overImage, ImageArrayInstance.overImage);
//    System.out.println(distance);
  }
}
