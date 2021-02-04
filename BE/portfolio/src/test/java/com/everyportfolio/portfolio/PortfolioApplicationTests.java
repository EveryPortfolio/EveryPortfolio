package com.everyportfolio.portfolio;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.HashMap;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@AutoConfigureMockMvc
@SpringBootTest
class PortfolioApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

	/*@Test
	void checkUpdateTitle() {
		String accessToken = "{ \"id\": \"juyj7282@gmail.com\", \"auth\" : \"USER\" }";
		HashMap<String, Object> params = new HashMap<>();

		params.put("tableId", "10");
		params.put("title", "changeTitle!!");

		try {
			mockMvc.perform(MockMvcRequestBuilders.put("/update/title").contentType("application/json").header("access-token", accessToken).content((new Gson()).toJson(params))).andDo(print());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void checkUpdateContent() {
		String accessToken = "{ \"id\": \"juyj7282@gmail.com\", \"auth\" : \"USER\" }";
		HashMap<String, Object> params = new HashMap<>();

		params.put("tableId", 10);
		params.put("content", "changeContent!!!!");
		params.put("templateType", 1);

		try {
			mockMvc.perform(MockMvcRequestBuilders.put("/update/content").contentType("application/json").header("access-token", accessToken).content((new Gson()).toJson(params))).andDo(print());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/*@Test
	void checkDelete() {
		String accessToken = "{ \"id\": \"juyj7282@gmail.com\", \"auth\" : \"USER\" }";
		HashMap<String, Object> params = new HashMap<>();

		params.put("tableId", 10);

		try {
			mockMvc.perform(MockMvcRequestBuilders.delete("/delete").contentType("application/json").header("access-token", accessToken).content((new Gson()).toJson(params))).andDo(print());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/*@Test
	void checkGetPortfolio() {
		try {
			mockMvc.perform(MockMvcRequestBuilders.get("/view").param("tableId","11")).andDo(print());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}*/

    /*@Test
	void checkSwitchLike() {
		String accessToken = "{ \"id\": \"juyj7282@gmail.com\", \"auth\" : \"USER\" }";
		HashMap<String, Object> content = new HashMap<>();
		content.put("tableId", 11);

		try {
			mockMvc.perform(MockMvcRequestBuilders.post("/like").header("access-token", accessToken).contentType("application/json").content((new Gson()).toJson(content))).andDo(print());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	@Test
	void checkLikeCheck() {
		String accessToken = "{ \"id\": \"juyj7282@gmail.com\", \"auth\" : \"USER\" }";

		try {
			mockMvc.perform(MockMvcRequestBuilders.get("/like").header("access-token", accessToken).param("tableId", "11")).andDo(print());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
