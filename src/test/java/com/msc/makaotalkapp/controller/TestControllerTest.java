package com.msc.makaotalkapp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class TestControllerTest {
    @Autowired
    private TestController testController;

    private MockMvc mockMvc;

    @Test
    void mockMvcTest() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(testController).build();

        mockMvc.perform(
                MockMvcRequestBuilders.get("/hello"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello World"));
    }

    @Test
    void readAllTest() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(testController).build();

        mockMvc.perform(
                MockMvcRequestBuilders.get("/readAll"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk());
    }


}