import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
//
//        Person person = new Person();
//        Person person1 = new Person();
//
//        System.out.println(person.hashCode());
//        Formula formula = new Formula() {
//            @Override
//            public double calculate(int a) {
//                return sqrt(a * 100);
//            }
//        };
//
//        formula.calculate(100);
//        formula.sqrt(16);
//
//
//        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
//
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String a, String b) {
//                return b.compareTo(a);
//            }
//        });
//        Collections.sort(names, (String a, String b) -> b.compareTo(a));
//        for (String name : names) {
//            System.out.println(name);
//        }
//        Collections.sort(names, (a, b) -> b.compareTo(a));
//
////        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
////        Integer converted = converter.convert("123");
////        System.out.println(converted);
////
////        Converter<String, Integer> converter = Integer::valueOf;
////        Integer converted = converter.convert("123");
////        System.out.println(converted);   // 123
//
//        Something something = new Something();
//        Converter<String, String> converter = something::startsWith;
//        String converted = converter.convert("Java");
//        System.out.println(converted);
//
//        PersonFactory<Person> personFactory = Person::new;
//        Person person = personFactory.create("Peter", "Parker");
//
//        int num = 1;
//        Converter<Integer, String> stringConverter =
//                (from) -> String.valueOf(from + num);
//
//        stringConverter.convert(2);     // 3
//
//        Predicate<String> predicate = (s) -> s.length() > 0;
//
//        predicate.test("foo");              // true
//        predicate.negate().test("foo");     // false
//
//        Predicate<Boolean> nonNull = Objects::nonNull;
//        Predicate<Boolean> isNull = Objects::isNull;
//
//        Predicate<String> isEmpty = String::isEmpty;
//        Predicate<String> isNotEmpty = isEmpty.negate();
//
//        Function<String, Integer> toInteger = Integer::valueOf;
//        Function<String, String> backToString = toInteger.andThen(String::valueOf);
//
//        backToString.apply("123");     // "123"
//        toInteger.apply("111");
//
//        Supplier<Person> personSupplier = Person::new;
//        personSupplier.get();
//
//        Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.firstName);
//        greeter.accept(new Person("Luke", "Skywalker"));
//
//        Comparator<Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);
//
//        Person p1 = new Person("John", "Doe");
//        Person p2 = new Person("Alice", "Wonderland");
//
//        comparator.compare(p1, p2);             // > 0
//        comparator.reversed().compare(p1, p2);  // < 0
//
//        Optional<String> optional = Optional.of("bam");
//
//        optional.isPresent();           // true
//        optional.get();                 // "bam"
//        optional.orElse("fallback");    // "bam"
//
//        optional.ifPresent((s) -> System.out.println(s.charAt(0)));

//        List<String> stringCollection = new ArrayList<>();
//        stringCollection.add("ddd2");
//        stringCollection.add("aaa2");
//        stringCollection.add("bbb1");
//        stringCollection.add("aaa1");
//        stringCollection.add("bbb3");
//        stringCollection.add("ccc");
//        stringCollection.add("bbb2");
//        stringCollection.add("ddd1");


//        stringCollection
//                .stream()
//                .filter((s) -> s.startsWith("a"))
//                .forEach(System.out::println);
//
//        stringCollection
//                .stream()
//                .sorted()
//                .filter((s) -> s.startsWith("a"))
//                .forEach(System.out::println);
//
//        stringCollection
//                .stream()
//                .map(String::toUpperCase)
//                .sorted((a, b) -> b.compareTo(a))
//                .forEach(System.out::println);
//
//        // "DDD2", "DDD1", "CCC", "BBB3", "BBB2", "AAA2", "AAA1"
//
//        boolean anyStartsWithA =
//                stringCollection
//                        .stream()
//                        .anyMatch((s) -> s.startsWith("a"));
//
//        System.out.println(anyStartsWithA);
//
//        long startsWithB =
//                stringCollection
//                        .stream()
//                        .filter((s) -> s.startsWith("b"))
//                        .count();
//
//        System.out.println(startsWithB);    // 3

//        Optional<String> reduced =
//                stringCollection
//                        .stream()
//                        .sorted()
//                        .reduce((s1, s2) -> s1 + "#" + s2);
//
//        reduced.ifPresent(System.out::println);
//// "aaa1#aaa2#bbb1#bbb2#bbb3#ccc#ddd1#ddd2"
//
//        int max = 1000000;
//        List<String> values = new ArrayList<>(max);
//        for (int i = 0; i < max; i++) {
//            UUID uuid = UUID.randomUUID();
//            values.add(uuid.toString());

 //       }

//        long t0 = System.nanoTime();
//
//        long count = values.stream().sorted().count();
//        System.out.println(count);
//
//        long t1 = System.nanoTime();
//
//        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
//        System.out.println(String.format("sequential sort took: %d ms", millis));

//
//        long t0 = System.nanoTime();
//
//        long count = values.parallelStream().sorted().count();
//        System.out.println(count);
//
//        long t1 = System.nanoTime();
//
//        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
//        System.out.println(String.format("parallel sort took: %d ms", millis));
//
//// parallel sort took: 472 ms
//
//        Map<Integer, String> map = new HashMap<>();
//
//        for (int i = 0; i < 10; i++) {
//            map.putIfAbsent(i, "val" + i);
//        }
//
//        map.forEach((id, val) -> System.out.println(val));
//
//
//        map.computeIfPresent(3, (num, val) -> val + num);
//        map.get(3);             // val33
//
//        map.computeIfPresent(9, (num, val) -> null);
//        map.containsKey(9);     // false
//
//        map.computeIfAbsent(23, num -> "val" + num);
//        map.containsKey(23);    // true
//
//        map.computeIfAbsent(3, num -> "bam");
//        map.get(3);
    }


}
