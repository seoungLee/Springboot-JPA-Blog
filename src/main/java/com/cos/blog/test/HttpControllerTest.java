package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

//사용자가 요청 -> 응답(HTML 파일)
//@Controller

//사용자가 요청 -> 응답(Data)
@RestController
public class HttpControllerTest {
	
	//인터넷 브라우저 요청은 무조건 get요청밖에 할 수 없다.
	// http://localhost:8080/http/get(select)
	@GetMapping("/http/get")
	public String getTest() {
		return "get요청";
	}
	
	// http://localhost:8080/http/post(insert)
	@PostMapping("/http/post")
	public String postTest() {
		return "post요청";
	}
	
	// http://localhost:8080/http/put(update)
	@PutMapping("/http/put")
	public String putTest() {
		return "put요청";
	}
	
	// http://localhost:8080/http/delete(delete)
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete요청";
	}
}
