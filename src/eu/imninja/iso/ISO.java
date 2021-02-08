package eu.imninja.iso;

public class ISO {

    private String path;
    private String code;

    public ISO(String path,String code) {
        this.path = path;
        this.code = code;
    }

    public String getPath() {
        return path;
    }

    public String getCode() {
        return code;
    }
}
