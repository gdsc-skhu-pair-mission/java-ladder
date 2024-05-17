package util;

public class TestFootholdGenerator implements FootholdGenerator {

    private final boolean testGenerateFoothold;

    public TestFootholdGenerator(boolean testGenerateFoothold) {
        this.testGenerateFoothold = testGenerateFoothold;
    }

    @Override
    public boolean generate() {
        return testGenerateFoothold;
    }
}
