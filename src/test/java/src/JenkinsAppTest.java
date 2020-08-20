package src;

import junit.framework.TestCase;
import org.junit.Test;

public class JenkinsAppTest extends TestCase {

    @Test
    public void testName() {
        String name = new JenkinsApp().getName();
        assert(name.equalsIgnoreCase("jenkins"));
    }
}