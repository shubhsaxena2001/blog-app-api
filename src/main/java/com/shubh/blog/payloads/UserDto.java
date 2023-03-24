package com.shubh.blog.payloads;
import jakarta.persistence.Column;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter

public class UserDto {
	private int id;
	private String name;
	private String email;
	private String password;
	private String about;
}
