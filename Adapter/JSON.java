public class JSON {
    private String data;

    public JSON() {
    }

    public JSON(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    XML convertToXML() {
        // logic to convert the data to XML
        return new XML("Stringified JSON data");
    }
}
