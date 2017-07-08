import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Ignore;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by stepan on 08.07.17.
 */
@Features("Тестовые тесты")
@Stories("Тестовая история")
@Slf4j
public class Tests {

    @Test
    public void failedTest() {
        Assert.assertTrue(false);
    }

    @Test
    @Ignore
    public void ignoreTest() {
        Assert.assertTrue(false);
    }

    @Test
    public void assumeTest() {
        Assume.assumeTrue(false);
    }

    @Test
    public void simpleTest() {
        log.info("Yeah!");
    }

    @Test
    public void errorTest() {
        throw new Error("Error");
    }
}
