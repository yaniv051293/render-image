package unitTests.renderer;

import org.junit.jupiter.api.Test;
import primitives.Color;
import renderer.ImageWriter;

public class ImageWriterTest {

    /**
     * Test method for {@link renderer.ImageWriter#writeToImage()}.
     * Test for creating a simple image with pixel
     */
    @Test
    public void testWriteToImage() {
        ImageWriter image = new ImageWriter("imageTestNew", 800, 500);
        // The nested loop colors each pixel
        for (int i = 0; i < 800; i++)
            for (int j = 0; j < 500; j++)
                if (i % 50 == 0 && i != 0 || j % 50 == 0 && j != 0)
                    image.writePixel(i, j, new Color(125, 0, 70));
                else
                    image.writePixel(i, j, new Color(0, 80, 100));

        image.writeToImage();
    }
}
