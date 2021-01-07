package org.celo.snarkbenchmark;

public class RustBench {
    private static native String bench();

    public String runBench() {
        return bench();
    }
}
