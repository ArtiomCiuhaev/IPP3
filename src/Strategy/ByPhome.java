package Strategy;

public class ByPhome implements Volume{
    @Override
    public int doLoud(int segmentation) {
        return segmentation + 20;
    }
}
