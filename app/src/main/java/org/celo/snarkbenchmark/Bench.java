package org.celo.snarkbenchmark;

public class Bench {
    private static native String bench();

    public String runBench() {
        return bench();
    }
}
