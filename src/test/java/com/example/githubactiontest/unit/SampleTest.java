package com.example.githubactiontest.unit;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SampleTest {

    @Test
    public void failure_test() {
        assertThat(3+1).isEqualTo(4);
    }
}
