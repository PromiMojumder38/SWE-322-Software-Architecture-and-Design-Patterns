public class Client {
    public static void main(String[] args) {
        // JSON to XML conversion
        JSON json = new JSON("Json data");
        IAdapter<JSON, XML> jsonAdapter = new JsonToXmlAdapter(json);
        XML xml1 = jsonAdapter.convert(json);
        System.out.println("JSON to XML:");
        System.out.println("JSON data: " + json.getData());
        System.out.println("XML data: " + xml1.getData());
        System.out.println();

        // PROTOBUFFER to XML conversion
        PROTOBUFFER protobuffer = new PROTOBUFFER("Protobuffer data");
        IAdapter<PROTOBUFFER, XML> protobufferAdapter = new ProtobufferToXmlAdapter(protobuffer);
        XML xml2 = protobufferAdapter.convert(protobuffer);
        System.out.println("PROTOBUFFER to XML:");
        System.out.println("PROTOBUFFER data: " + protobuffer.getData());
        System.out.println("XML data: " + xml2.getData());
    }
}
