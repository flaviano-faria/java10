# java10

Uncomment service.addPermission() in App.java to demonstrate:
User.java: <br/>
Demonstrate Collections.unmodifiableList(); <br/>
Demonstrate local variable type inference (var)

Uncomment subService.getCopiedList() in App.java to demonstrate List.copyOf:

public static <E> List<E> copyOf(     @NotNull   java. util. Collection<? extends E> coll )

stacktrace:
Exception in thread "main" java.lang.UnsupportedOperationException
    at java.base/java.util.ImmutableCollections.uoe(...)
    at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(...)
    at ...

method subService.getNullPermission() in App.java class demonstrates Optional.orElseThrow:<br/>

public <X extends Throwable> T orElseThrow(     java. util. function. Supplier<? extends X> exceptionSupplier )
throws X

