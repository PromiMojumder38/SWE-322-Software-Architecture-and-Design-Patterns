public interface IAdapter<TypeA, TypeB> {
    TypeB convert(TypeA source);
}