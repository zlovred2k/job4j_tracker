package ru.job4j.pojo;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

import java.util.Date;

public class LicenseTest {

    @Test
    public void eqName() {
        License first = new License();
        first.setCode("audio");
        first.setCreated(new Date());
        first.setModel("Ford");
        first.setOwner("Alex");
        License second = new License();
        second.setCode("audio");
        second.setCreated(new Date());
        second.setModel("Ford");
        second.setOwner("Alex");
        assertThat(first, is(second));
    }
}