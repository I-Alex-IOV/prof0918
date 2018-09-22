package marker;

import util.Color;

/**
 * Created by Maria on 22.09.2018.
 */
public class Marker extends WastableWriter {

    private String markerColor;

    public Marker(Color markerColor) {
        this.markerColor = markerColor.toString().toLowerCase();
        this.inkPerLetter = 0.01;
    }

    @Override
    public void write(String line) {

        String resultLine = "<" + markerColor + ">" + line + "</" + markerColor + ">";
        super.write(resultLine);
    }

    public String getMarkerColor() {
        return markerColor;
    }

    public Marker setMarkerColor(Color markerColor) {
        return new Marker(markerColor);
    }
}
