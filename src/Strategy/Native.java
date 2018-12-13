package Strategy;

public class Native implements Volume {
    @Override
    public int doLoud(int segmentation) {
        return segmentation + 5;
    }
}
