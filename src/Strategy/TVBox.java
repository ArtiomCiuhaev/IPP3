package Strategy;

public class TVBox {
    private Volume volume;

    public TVBox(Volume volume) {
        this.volume = volume;
    }

    public int risingVolume(int segementation){
        return volume.doLoud(segementation);
    }
}
