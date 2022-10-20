import java.util.Collection;
@RunWith(Parameterized.class)
public class DocSearchTest {
    @Test
    public void initialTest() {
        assertEquals((Handler.Handler("h/m.txt")), ("Don't know how to handle that path!"));
    }
}
