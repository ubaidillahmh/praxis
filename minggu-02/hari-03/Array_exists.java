import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;;

public final class Array_exists {
    public static void main(final String[] args) {
        final Array<String> a = array("Hello", "There", "what", "DAY", "iS", "iT");
        final boolean b = a.exists(s -> fromString(s).forall(isLowerCase));
        System.out.println(b); // true ("what" is the only value that qualifies; try removing it)
    }
}