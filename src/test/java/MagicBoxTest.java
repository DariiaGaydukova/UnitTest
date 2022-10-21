import org.example.MagicBox;
import org.junit.jupiter.api.*;


public class MagicBoxTest {

    private MagicBox magicBox;
    Object items;

    @BeforeEach
    void setUp() {
        magicBox = new MagicBox(3);

    }

    @Test
    @DisplayName("Тест проверяет добавление в коробку")

    void testAdd() {
        for (int i = 0; i < magicBox.getSizeMagicBox(); i++) {
            Assertions.assertTrue(magicBox.add(items));
        }
    }

    @Test
    @DisplayName("Тест проверяет, что установлен размер коробки")

    void TestmagiBoxSize() {
        Assertions.assertNotNull(magicBox.getSizeMagicBox());
    }


    @Test
    @DisplayName("Тест на проверку ожидаемого исключения")

    void testPick() {
        for (int i = 0; i < magicBox.getSizeMagicBox(); i++) {
            Assertions.assertThrows(RuntimeException.class, () -> magicBox.pick());
        }
    }
}
