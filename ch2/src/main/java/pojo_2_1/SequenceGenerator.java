package pojo_2_1;

import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGenerator {
    private String prefix;
    private String suffix;
    private int intial;
    private final AtomicInteger counter = new AtomicInteger();

    public SequenceGenerator() {
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setIntial(int intial) {
        this.intial = intial;
    }

    public String getSequence(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(prefix)
                .append(intial)
                .append(counter.getAndIncrement())
                .append(suffix);
        return stringBuilder.toString();
    }
}
