public class ProtobufferToXmlAdapter implements IAdapter<PROTOBUFFER, XML> {
    private PROTOBUFFER protobuffer;

    public ProtobufferToXmlAdapter(PROTOBUFFER protobuffer) {
        this.protobuffer = protobuffer;
    }

    @Override
    public XML convert(PROTOBUFFER protobuffer) {
        return this.protobuffer.convertToXML();
    }
}
