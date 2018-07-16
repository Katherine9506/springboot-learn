package com.spring.springbootlearn.controller;

import com.spring.springbootlearn.dao.SpitterRepository;
import com.spring.springbootlearn.domain.Spitter;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class SpitterControllerTest {

    private SpitterRepository mockRepository;

    @Before
    public void setUp() {
        this.mockRepository = mock(SpitterRepository.class);
    }

    @Test
    public void showRegistrationForm() throws Exception {
        SpitterController controller = new SpitterController();
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/spitter/register"))
                .andExpect(view().name("registerForm"));
    }

    @Test
    public void processRegistration() throws Exception {
        Spitter unsaved = new Spitter("Elena", "G", "Katherine", "123456");
        Spitter saved = new Spitter(24L, "Elena", "G", "Katherine", "123456");

        when(mockRepository.save(unsaved))
                .thenReturn(true);
        SpitterController controller = new SpitterController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(post("/spitter/register")
                .param("firstName", "Elena")
                .param("lastName", "G")
                .param("username", "Katherine")
                .param("password", "123456"))
                .andExpect(redirectedUrl("/spitter/" + unsaved.getUsername()));
        verify(mockRepository, atLeastOnce()).save(unsaved);

        //jsr-303 @Null非空测试
        mockMvc.perform(post("/spitter/register"))
                .andExpect(view().name("registerForm"));
    }

    @Test
    public void showSpitterProfile() throws Exception {
        Spitter foundSpitter = new Spitter("Elena", "G", "Katherine", "123456");
        when(mockRepository.findByUsername("Katherine"))
                .thenReturn(foundSpitter);
        SpitterController controller = new SpitterController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/spitter/Katherine"))
                .andExpect(view().name("profile"))
                .andExpect(model().attributeExists("spitter"))
                .andExpect(model().attribute("spitter", foundSpitter));
    }
}