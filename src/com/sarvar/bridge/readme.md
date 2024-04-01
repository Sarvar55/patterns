# What is Bridge Pattern

It is a structual design pattern. The Bridge pattern allows you to separate the abstraction from implementation.

### There are 2 parts in Bridge design pettern:

- Abstraction
- Implementation

## Elements of Bridge Design Pattern

- **Abstraction**: Core of the bridge design pattern and defines (the crux)(can alıcı nokta). Contains a reference to the implementer.
- **Refined Abstraction**: Extends the abstraction takes the (finer)(ince) detail one level below. Hides the finer elements from implementer.
- **Implementer**: It defines the interface for implementation classes. This interface does not need to (correspond)(uygun,karşılık)directly to the abstraction interface can be very different . Abstraction imp provides an implementation in (terms of )(şartlar,koşullar)operation provided by the implementer interface.
- **Concrete Implementation**: Implements the above implementer by providing the concrete implementation.
