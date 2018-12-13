package Strategy;

public class ByRC implements Volume{
    @Override
    public int doLoud(int segmentation) {
        return segmentation + 15;
    }
}
