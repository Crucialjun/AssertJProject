package com.crucial;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringTest {

    @Test(dataProvider = "getData")
    public void stringTest(String input){
        Assertions
                .assertThat(input)
                .hasSize(8)
                .startsWith("se")
                .doesNotContain("api")
                .doesNotContainAnyWhitespaces()
                .containsOnlyOnce("i");


    }

    @DataProvider
    public Object[] getData(){
        return new String[]{
                "selenium"
                ,"selenide"

        };
    }
}
